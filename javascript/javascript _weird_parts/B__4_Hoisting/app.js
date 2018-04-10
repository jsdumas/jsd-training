b();
console.log(a);

var a = 'Hello World!';

function b() {
    console.log('Called b!');
}

//Hoisting === La remontée de variables 

//Les déclarations de variables (et les déclarations en général) sont traitées 
//avant que n'importe quel autre code soit exécuté. Ainsi, déclarer une variable 
//n'importe où dans le code équivaut à la déclarer au début de son contexte d'exécution.
//Cela signifie qu'une variable peut également apparaître dans le code avant d'avoir été déclarée.
//Ce comportement est appelé « remontée » (hoisting en anglais) car la déclaration de la variable 
//est « remontée » au début de la fonction courante ou du contexte global.


//Étant donné ce comportement, il est recommandé de toujours déclarer les variables au début de leurs 
//portées (le début du code global ou le début du corps de la fonction) afin de mieux (sa)voir quelles
//variables font partie de la fonction et lesquelles proviennent de la chaîne de portées.

//Il est important de noter que la remontée des variables affecte uniquement la déclaration 
//et pas l'initialisation de la valeur. La valeur sera affectée lorsque le moteur accèdera à l'instruction d'affectation. 