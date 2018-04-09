(function(global, $) {
    
	//this function return a object, this is not a function constructor
    var Greetr = function(firstName, lastName, language) {
        return new Greetr.init(firstName, lastName, language);   
    }
    
    Greetr.prototype = {};
    
    //this is a function constructor
    Greetr.init = function(firstName, lastName, language) {
    	// self memorise this        
        var self = this;
        // init property with default value if needed
        self.firstName = firstName || '';
        self.lastName = lastName || '';
        self.language = language || 'en';
        
    }
    
    Greetr.init.prototype = Greetr.prototype;
    
    global.Greetr = global.G$ = Greetr;
    
}(window, jQuery));