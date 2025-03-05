const fs = require("fs");

let n = fs.readFileSync(0).toString().trim();


if ( n >= 100) {
    console.log("vapor");
} else if (n < 0) {
    console.log("ice");
} else {
    console.log("water");
}