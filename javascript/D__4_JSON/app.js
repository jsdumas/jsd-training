var objectLiteral = {
    firstname: 'Mary',
    isAProgrammer: true
}

//JSON to String
console.log(JSON.stringify(objectLiteral));

//String to JSON
var jsonValue = JSON.parse('{ "firstname": "Mary", "isAProgrammer": true }');

console.log(jsonValue);
