const fs = require("fs");

let input = fs.readFileSync(0).toString().trim();

let N = Number(input);
let number = N;
let result = "";

for (let i = 0; i <5; i++) {
    result += (N) + " ";

    N += number;
    
}

console.log(result.trim());