package com.betrybe.webinar.security;

import com.betrybe.webinar.service.PersonService;
import com.betrybe.webinar.service.TokenService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {

  private final TokenService tokenService;
  private final PersonService personService;

  @Autowired
  public JwtFilter(TokenService tokenService, PersonService personService) {
    this.tokenService = tokenService;
    this.personService = personService;
  }

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
      FilterChain filterChain) throws ServletException, IOException {

    // ... processamento do token JWT...
    // (1) tentamos extrair o token do cabeçalho da requisição
    Optional<String> token = extractToken(request);

    // (2) verificamos se ele existe
    if (token.isPresent()) {

      // (3) se existir, validamos o token
      String subject = tokenService.validateToken(token.get());

      // (4) se o token for válido (não houve exceção), encontramos a pessoa associada
      UserDetails userDetails = personService.loadUserByUsername(subject);

      // (5) informamos o Spring Security que a pessoa está autenticada
      UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
          userDetails, null, userDetails.getAuthorities());
      SecurityContextHolder.getContext().setAuthentication(authentication);
    }

    // (6) continuamos com a cadeia de filtros de qualquer forma
    filterChain.doFilter(request, response);

  }

  private Optional<String> extractToken(HttpServletRequest request) {
    String authHeader = request.getHeader("Authorization");

    if (authHeader == null) {
      return Optional.empty();
    }

    return Optional.of(
        authHeader.replace("Bearer ", "")
    );
  }
}