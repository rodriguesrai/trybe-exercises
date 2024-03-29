# Exemplo:


str = "coxinha"
# saída: {'c': 1, 'o': 1, 'x': 1, 'i': 1, 'n': 1, 'h': 1, 'a': 1}
# Explicação: Nenhuma letra repete em coxinha :)
string = "bbbbaaaacccaaaaaaddddddddccccccc"
# saída: {'b': 4, 'a': 10, 'c': 10, 'd': 8}

count_chars = {}

for char in string:
    if char not in count_chars:
        count_chars[char] = 1
    else:
        count_chars[char] += 1

print(count_chars)
