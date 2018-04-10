// IIFE
(function(global, name) {
    
    var greeting = 'Hello';
    //global meens we change vamue of greeting in window object
    //if we don't do that, console.log print value of first declaration of greeting in global context (window.greeting = 'Hola') 
    global.greeting = 'Hello';
    console.log(greeting + ' ' + name);
    
}(window, 'John')); // IIFE

console.log(greeting);






















