// SELETORES
const INPUT_TEXT = document.querySelector("#input-text");
const INPUT_CHECKBOX = document.querySelector("#input-checkbox");
const HREF_LINK = document.querySelector("#href");

const functionHref = (event) => {
    event.preventDefault();
}
HREF_LINK.addEventListener('click', functionHref);

const functionCheck = (event) => {
    event.preventDefault();
}
INPUT_CHECKBOX.addEventListener('click', functionCheck);

const functionInput = (event) => {
    const character = event.key;
    if (character !== 'a') {
        event.preventDefault();
    }
}
INPUT_TEXT.addEventListener('keypress', functionInput);