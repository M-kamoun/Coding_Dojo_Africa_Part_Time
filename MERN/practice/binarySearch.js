// function binarySearch(arr, target) {
//   let start = 0;
//   let end = arr.length - 1;

//   while (start <= end) {
//     let midIndex = Math.floor((start + end) / 2);
//     if (target === arr[midIndex]) {
//       return midIndex;
//     }
//     if (target < arr[midIndex]) {
//       end = midIndex - 1;
//     } else {
//       start = midIndex + 1;
//     }
//   }
//   return -1;
// }

// const findValue = binarySearch([1, 2, 3, 4, 5, 6, 7, 8], 10);

// if (findValue === -1) {
//   console.log("Value not Found");
// } else {
//   console.log("Value is  found in Index : " + findValue);
// }

// // recursive way

// // let arr = ["A", "B", "c"];
// // let start = 0;
// // let end = arr.length - 1;
// // let target = "C";

// function binarySearchRecursive(arr, start, end, target) {
//   if (start > end) return console.log(`the value ${target} is not exist`);
//   let midIndex = Math.floor((start + end) / 2);
//   if (arr[midIndex] === target)
//     return console.log(`the value ${target} is in index ${midIndex} `);
//   if (arr[midIndex] > target)
//     return binarySearchRecursive(arr, start, midIndex - 1, target);
//   else return binarySearchRecursive(arr, midIndex + 1, end, target);
// }

// binarySearchRecursive(["A", "B", "C"], 0, 2, "C");

// // // for (let i = 1; i < 1024; i++) {
// // //   arr.push(i);
// // // }

// // // console.log(arr);

// Number.prototype.isPrime = function () {
//   for (let i = 2; i < this; i++) {
//     if (this % i === 0) {
//       return false;
//     }
//   }
//   return true;
// };

// console.log(Number(3).isPrime());

// setTimeout(() => console.log("start"), 3000);

// console.log("end");

const groceryList = Object.freeze([
  { item: "carrots", haveIngredient: false },
  { item: "onions", haveIngredient: true },
  { item: "celery", haveIngredient: false },
  { item: "cremini mushrooms", haveIngredient: false },
  { item: "butter", haveIngredient: true },
]);

// const needThyme = [...groceryList, { item: "thyme", haveIngredient: false }];
// console.log(needThyme);
const needThyme = groceryList.concat([
  { item: "thyme", haveIngredient: false },
]);
console.log(needThyme);
const gotTheThyme = [
  ...needThyme.slice(0, 5),
  { ...needThyme[4], haveIngredient: false },
];
console.log(gotTheThyme);
//console.log(needThyme);
