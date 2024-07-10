// const items = Object.freeze([
//   "carrots",
//   "onions",
//   "celery",
//   "mushrooms",
//   "butter",
//   "thyme",
// ]);

// const sortedItems = [...items].sort();
// console.log(items);
// console.log(sortedItems);

// const numbers = [10, 5, 3, 12, 22, 8];
// console.log(
//   numbers.sort(function (a, b) {
//     return a - b;
//   })
// );
// // this will return [10, 12, 22, 3, 5, 8 ]

// const groceryList = Object.freeze([
//   { item: "carrots", haveIngredient: false },
//   { item: "onions", haveIngredient: true },
//   { item: "celery", haveIngredient: false },
//   { item: "cremini mushrooms", haveIngredient: false },
//   { item: "butter", haveIngredient: true },
// ]);

// const sortedGroceries = [...groceryList].sort((a, b) =>
//   a.item > b.item ? 1 : -1
// );
// const sortedGroceries2 = [...groceryList].sort((a, b) =>
//   a.item < b.item ? 1 : -1
// );

// // const sortedGroceries = [...groceryList].sort((a, b) =>
// //   a.item.localeCompare(b.item)
// // );

// console.log(sortedGroceries);
// console.log(sortedGroceries2);

function gretting(name) {
  console.log(`hi ${name}`);
}

console.log(gretting("m"));
