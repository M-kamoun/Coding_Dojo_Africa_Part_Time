
var cookiePart = document.querySelector(".cookie");

function view() {
    alert("Loading weather report...")
}

function celtofar(temp) {
    
    return Math.round(9 / 5 * temp + 32);
}

function fartocel(temp){
  
    return Math.round(5 / 9 * (temp - 32));
}

function convert(elem){
    

for(var i=1;i<9;i++){
    var tempSpan = document.querySelector("#temp" + i);
    var tempVal= parseInt(tempSpan.innerText);
    if(elem.value=="°C"){
        tempSpan.innerText=fartocel(tempVal);
    }else {
        tempSpan.innerText = celtofar(tempVal);
    }
}

}

function dismiss() {
    cookiePart.remove();
}