greet();

//Function statement as if()
function greet() {
    console.log('hi');   
}

//Function expression
//Here function is a variable
//And an anonymous function is attributed to variable
var anonymousGreet = function() {
    console.log('hi');   
}

anonymousGreet();

//Here Function take another function as param
function log(a) {
   a();    
}

log(function() {
    console.log('hi');   
});


