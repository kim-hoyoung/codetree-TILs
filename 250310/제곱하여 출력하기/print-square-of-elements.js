const fs = require("fs");

let input = fs.readFileSync(0).toString().trim().split("\n");

let arr = input[1].split(" ").map(Number);

console.log(arr.map(num => num * num).join(" "));

