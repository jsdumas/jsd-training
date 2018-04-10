function buildFunctions() {
 
    var arr = [];
    
    for (var i = 0; i < 3; i++) {
        
        arr.push(
            function() {
                console.log(i);   
            }
        )
        
    }
    
    return arr;
}

//First invocation of this function set an array and memorise in closure variable i with 3 as a value
var fs = buildFunctions();

//so that every time we invoke function of an item of the arrray, we get 3 as result in console.log
fs[0]();
fs[1]();
fs[2]();

function buildFunctions2() {
 
    var arr = [];
    
    for (var i = 0; i < 3; i++) {
        arr.push(
        		//here IIFE stock in each item of the array the value that tale var i for each iteration
            (function(j) {
                return function() {
                    console.log(j);   
                }
            }(i))
        )
        
    }
    
    return arr;
}

var fs2 = buildFunctions2();

fs2[0]();
fs2[1]();
fs2[2]();