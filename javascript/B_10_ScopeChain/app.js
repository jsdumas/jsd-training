function a() {
	function b() {
		//Call myVar in Global context
		console.log(myVar);
	}
	b();
}

function aa() {
	var myVar = 2;
	function b() {
		//call myVar in aa context
		console.log(myVar);
	}
	b();
}

var myVar = 1;
a();
aa();