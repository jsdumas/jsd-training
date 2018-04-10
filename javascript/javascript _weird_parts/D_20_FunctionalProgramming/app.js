//The second param is a function
function mapForEach(arr, fn) {
    var newArr = [];
    for (var i=0; i < arr.length; i++) {
        newArr.push(
        		//here we call the function from param
            fn(arr[i])   
        )
    };
    return newArr;
}

var arr1 = [1,2,3];
console.log(arr1);

//we set directly an anonymous function in param
//the result is a number
var arr2 = mapForEach(arr1, function(item) {
   return item * 2; 
});
console.log(arr2);

//the result of function is a boolean
var arr3 = mapForEach(arr1, function(item) {
   return item > 2; 
});
console.log(arr3);


var checkPastLimit = function(limiter, item) {
    return item > limiter;   
}
var arr4 = mapForEach(arr1, checkPastLimit.bind(this, 1));
console.log(arr4);


var checkPastLimitSimplified = function(limiter) {
    return function(limiter, item) {
        return item > limiter;   
    }.bind(this, limiter); 
};

var arr5 = mapForEach(arr1, checkPastLimitSimplified(1));
console.log(arr5);

