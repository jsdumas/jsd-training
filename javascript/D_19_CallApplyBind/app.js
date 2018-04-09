var person = {
    firstname: 'John',
    lastname: 'Doe',
    getFullName: function() {
        
        var fullname = this.firstname + ' ' + this.lastname;
        return fullname;
        
    }
}

var logName = function(lang1, lang2) {

    console.log('Logged: ' + this.getFullName());
    console.log('Arguments: ' + lang1 + ' ' + lang2);
    console.log('-----------');
    
}

//bind an object to a function (this into the function refer to this object)
var logPersonName = logName.bind(person);
logPersonName('en');

//call an object and param to a function
logName.call(person, 'en', 'es');
//apply an object and an array of param to a function
logName.apply(person, ['en', 'es']);

(function(lang1, lang2) {

    console.log('Logged: ' + this.getFullName());
    console.log('Arguments: ' + lang1 + ' ' + lang2);
    console.log('-----------');
    
}).apply(person, ['es', 'en']);

// function borrowing
var person2 = {
    firstname: 'Jane',
    lastname: 'Doe'
}

//apply can substitute an object to another one
console.log(person.getFullName.apply(person2));

// function currying
function multiply(a, b) {
    return a*b;   
}

//bind allow to fix an immutable value to a function
var multipleByTwo = multiply.bind(this, 2);
console.log(multipleByTwo(4));

var multipleByThree = multiply.bind(this, 3);
console.log(multipleByThree(4));