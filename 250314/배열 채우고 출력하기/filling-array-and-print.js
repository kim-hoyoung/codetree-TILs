const fs = require("fs");

let input = fs.readFileSync(0).toString().trim().split(" ");

let reversed = input.reverse();

console.log(reversed.join(""));