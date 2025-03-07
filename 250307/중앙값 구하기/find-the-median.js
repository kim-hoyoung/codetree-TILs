const fs = require("fs");

let input = fs.readFileSync(0).toString().trim().split(" ");

let a = Number(input[0]);
let b = Number(input[1]);
let c = Number(input[2]);

if (a > b) {
    if (b > c) {
        console.log(b); // a > b > c -> b가 중간값
    } else if (a > c) {
        console.log(c); // a > c > b -> c가 중간값
    } else {
        console.log(a); // c > a > b -> a가 중간값
    }
} else { // b >= a
    if (a > c) {
        console.log(a); // b > a > c -> a가 중간값
    } else if (b > c) {
        console.log(c); // b > c > a -> c가 중간값
    } else {
        console.log(b); // c > b > a -> b가 중간값
    }
}