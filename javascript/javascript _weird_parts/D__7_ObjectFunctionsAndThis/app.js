function a() {
	//here this refere to window object
    console.log(this);
    this.newvariable = 'hello';
}

var b = function() {
	//here this refere to window object
    console.log(this);   
}

a();

//console log newvariable of window object
console.log(newvariable); // not good!

b();

var c = {
    name: 'The c object',
    log: function() {
    	//here this refere to object c
        var self = this;
        
        self.name = 'Updated c object';
        //but if we use this here, we refere to window object
        //so that we use self variable instantiate upper
        console.log(self);
        
        var setname = function(newname) {
        	//same for here
            self.name = newname;   
        }
        setname('Updated again! The c object');
      //same for here
        console.log(self);
    }
}

c.log();







