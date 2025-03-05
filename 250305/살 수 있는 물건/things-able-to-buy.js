const fs = require("fs");

let n = fs.readFileSync(0).toString().trim();



if ( Number(n) === 1000) {
    console.log("mask");
} else if (  Number(n) === 3000) {
    console.log("book");
} else {
    console.log("no");
}