const myArray = [-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5];

function getNegativeNumbers(array) {

    const negatives = [];

    for (const number = 0; number < array.length; i++) {
        if (array[i] < 0) {
            negatives.push(array[i]);
        }
    }
    return negatives;

}
console.log(getNegativeNumbers(myArray));