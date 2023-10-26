const buttonEnviar = document.getElementById('submit-btn');
const checkboxAgreement = document.getElementById('agreement');
/* const questionTextArea = document.querySelector('#question').value.length; */
/* const invalidReason = questionTextArea > 500; */

const functionEnviar = (event) => {
  event.preventDefault();
};

function AgreementChange() {
  buttonEnviar.disabled = !agreement.checked;
}

checkboxAgreement.addEventListener('change', AgreementChange);
buttonEnviar.addEventListener('click', functionEnviar);
