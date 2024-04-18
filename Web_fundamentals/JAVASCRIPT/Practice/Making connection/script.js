console.log("page loaded...");

var request = document.querySelector("#requests");
var connection = document.querySelector("#connections");
var username = document.querySelector("#user");
//console.log(request.textContent);

function add(id){
    var line = document.querySelector(id);
    line.remove();
    request.innerText--;
    connection.innerText++;

}

function del(id) {
    var line = document.querySelector(id);
    line.remove();
    request.innerText--;

}

function edit() {
    console.log(document.querySelector("user"));
    username.innerText = "Kamoun M";
}