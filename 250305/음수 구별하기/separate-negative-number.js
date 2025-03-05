const fs = require("fs");

let input = fs.readFileSync(0).toString().trim()

if (input < 0 ) {
    console.log("minus");
} else {
    console.log(input);
}