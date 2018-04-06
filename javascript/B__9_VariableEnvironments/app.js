function b() {
	var myVar;
    console.log(myVar);
}

function a() {
	var myVar = 2;
    console.log(myVar);
	b();
}

var myVar = 1;
console.log(myVar);
a();
console.log(myVar);


// var = variable déclarée,
//elles sont traitées avant que le code soit exécuté
//Leur portée est le contexte d'exécution courant (fonction ou le contexte globale qui contient la déclaration)
//Ce sont des propriétés non configurable du contexte d'exécution

//Une variable non déclarée (pas de mot clé var) est une variable globale
//Elles n'existent pas tant que le code n'est pas exécuté
//Ce sont des propriétés configurables (elles peuvent être supprimées)