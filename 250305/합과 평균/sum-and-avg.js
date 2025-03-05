const fs = require("fs");

let input = fs.readFileSync(0).toString().trim().split(" ");

let A = Number(input[0]);
let B = Number(input[1]);

let sum = A + B;
let avg = sum/2;

console.log(sum + " " + avg.toFixed(1));