const fs = require("fs");

input = fs.readFileSync(0).toString().trim().split(" ");



a = Number(input[0]);
b = Number(input[1]);
c = Number(input[2]);


sum = a + b + c;
avg = sum / 3;
temp = sum - avg
console.log(sum + "\n" + avg +"\n"+ temp);