// 1
console.log(hello);
var hello = "world";
//var hello;
//logs undefined

console.log("*****************************************");

//2
var needle = "haystack";
test();
function test() {
  var needle = "magnet";
  console.log(needle); // logs magnet
}

// var needle;
// function test() {
//   var needle ;    // local needle variable is a separate variable that shadows the global needle variable
// needle= "magnet";
//   console.log(needle);
// }
// needle = "haystack";
// test()

console.log("*****************************************");

//3

var brendan = "super cool";
function print() {
  brendan = "only okay";
  console.log(brendan);
}
console.log(brendan); // logs super cool

// the function print () is not called, so the value of brendan is not affected.

console.log("*****************************************");

//4

var food = "chicken";
console.log(food);
eat();

function eat() {
  food = "half-chicken";
  console.log(food);
  var food = "gone";
}

//var food;
// function eat() {
// var food;                      local variable
//   food = "half-chicken";
//   console.log(food);
//   food = "gone";
// }
//food="chicken"
//console.log(food);
// eat();

// logs chicken
//half-chicken

console.log("*****************************************");

//5

mean();
console.log(food);
var mean = function () {
  food = "chicken";
  console.log(food);
  var food = "fish";
  console.log(food);
};
console.log(food);

//var mean;
// mean();     error    mean is not a function

console.log("*****************************************");

//6

console.log(genre);
var genre = "disco";
rewind();
function rewind() {
  genre = "rock";
  console.log(genre);
  var genre = "r&b";
  console.log(genre);
}
console.log(genre);

// var genre;
//function rewind() {
//  var genre;                  local variable
//   genre = "rock";
//   console.log(genre);
//   genre = "r&b";
//   console.log(genre);

// }
//console.log(genre);
// genre="disco"
// rewind()
//console.log(genre);

// logs :
// undefined
//rock
//r&b
//disco

console.log("*****************************************");

// 7

dojo = "san jose";
console.log(dojo);
learn();
function learn() {
  dojo = "seattle";
  console.log(dojo);
  var dojo = "burbank";
  console.log(dojo);
}
console.log(dojo);

//

//var dojo;
// function learn() {
//  var dojo;
//   dojo = "seattle";
//   console.log(dojo);
//   dojo = "burbank";
//   console.log(dojo);
// }
// dojo = "san jose";
// console.log(dojo);
// learn()
//console.log(dojo);

// logs :
// san jose
// seattle
// burbank
// san jose

console.log("*****************************************");

//8

console.log(makeDojo("Chicago", 65));
console.log(makeDojo("Berkeley", 0));
function makeDojo(name, students) {
  const dojo = {};
  dojo.name = name;
  dojo.students = students;
  if (dojo.students > 50) {
    dojo.hiring = true;
  } else if (dojo.students <= 0) {
    //dojo = "closed for now";
    dojo.hiring = "closed for now"; // we can change like this
  }
  return dojo;
}

// dojo is variable const type object
// the variable const is immutable
// we can change the element of dojo or add an element
// but we can't affect directly the variable like
//  dojo = "closed for now";

// logs
// TypeError: Assignment to constant variable.

// if we change    dojo = "closed for now";  with  dojo.hiring = "closed for now"
// logs
//{ name: 'Chicago', students: 65, hiring: true }
//{ name: 'Berkeley', students: 0, hiring: 'closed for now' }
