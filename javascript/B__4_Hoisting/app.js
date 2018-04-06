b();
console.log(a);

var a = 'Hello World!';

function b() {
    console.log('Called b!');
}

//Hosting
//Les déclarations de variables (et les déclarations en général) sont traitées 
//avant que n'importe quel autre code soit exécuté. Ainsi, déclarer une variable 
//n'importe où dans le code équivaut à la déclarer au début de son contexte d'exécution.
//Cela signifie qu'une variable peut également apparaître dans le code avant d'avoir été déclarée.
//Ce comportement est appelé « remontée » (hoisting en anglais) car la déclaration de la variable 
//est « remontée » au début de la fonction courante ou du contexte global.