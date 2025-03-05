const fs = require("fs");

let input = fs.readFileSync(0).toString().trim();

let n = Number(input);

if (n >= 1000) {
    console.log("mask");
} else if (  n>= 3000) {
    console.log("book");
} else {
    console.log("no");
}