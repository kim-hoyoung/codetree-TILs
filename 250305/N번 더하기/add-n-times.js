const fs = require("fs");

let input = fs.readFileSync(0).toString().trim().split(" ");

let A = Number(input[0]);
let N = Number(input[1]);

let sum = A + N;

for(let i = 0; i < N; i++) {
    console.log(sum);
    sum += N;
}