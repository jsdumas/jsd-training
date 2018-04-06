function greet(name) {
	//Default value with ||
    name = name || '<Your name here>';
    console.log('Hello ' + name);    
}

greet('Tony');
greet();