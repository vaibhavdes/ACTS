exports.div=function(a){
	
	if(parseInt(a) % parseInt(3) == 0 && parseInt(a) % parseInt(5) == 0)
		return "fizzbuzz";
	else if(parseInt(a) % parseInt(5) == 0)
		return "buzz";
	else
		return "fizz";
	
}
