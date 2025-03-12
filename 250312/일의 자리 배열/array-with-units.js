const fs = require("fs");

let input = fs.readFileSync(0).toString().trim().split(" ");

let arr = input[0].split(" ").map(Number);

console.log(arr);

//console.log(arr.map(num => num[0] + num[1]).join(" "));