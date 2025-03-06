const fs = require("fs");

let input = fs.readFileSync(0).toString().trim().split("\n");

arrA = input[0].split(" ");
arrB = input[1].split(" ");


let mathA = Number(arrA[0]), engA = Number(arrA[1]);
let mathB = Number(arrB[0]), engB = Number(arrB[1]);

if ( mathA > mathB && engA > engB ) {
    console.log(1);
} else {
    console.log(0);
}

