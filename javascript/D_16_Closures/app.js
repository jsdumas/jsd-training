function greet(whattosay) {

   return function(name) {
       console.log(whattosay + ' ' + name);
   }

}

//greet invocation return anonymous function 
var sayHi = greet('Hi');
//here we invok the anonymous function
//and 'Hi' is memorised as a closure
sayHi('Tony');
