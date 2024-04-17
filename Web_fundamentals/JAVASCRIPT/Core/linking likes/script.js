

var count=[9,12,9];
var myspan = [
document.querySelector("#span-1"),
document.querySelector("#span-2"),
document.querySelector("#span-3")
];

function increase (index){
    count[index]++;
    myspan[index].innerText= count[index] + " Likes";


}