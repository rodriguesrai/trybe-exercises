const bmi = (weight, height) => {
    return weight / height ** 2;
}

console.log(bmi(65, 1.8));

module.exports = bmi;