
const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split(" ");

let N = Number(input[0]);
let M = Number(input[1]);




while ( N >= 1 ) {
    console.log(parseInt(N));
    N /= M
}

