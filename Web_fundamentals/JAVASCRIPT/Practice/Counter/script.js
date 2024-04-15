let count = 0;

function decrease() {
  let myvalue = document.getElementById("screen");

  if (myvalue.innerText != 0) {
    count -= 1;
    myvalue.innerHTML = count;
  }
}

function increase() {
  let myvalue = document.getElementById("screen");

  if (myvalue.innerHTML >= 0) {
    count += 1;
    myvalue.innerHTML = count;
  }
}

function reset(){
    let myvalue = document.getElementById("screen");
    count=0;
    myvalue.innerHTML=count;

}

let myval = document.getElementById("myh1");
myval.style.backgroundColor="yellow";
myval.style.marginBottom="10px";
console.log(myval);