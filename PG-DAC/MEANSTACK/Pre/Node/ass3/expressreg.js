express = require("express");
bodyparser = require("body-parser");
login = require("./login");
register = require("./register");

app = express();

var logger=function(req,resp,next){
			console.log(req.url);
			next();
}

var uname = [];
var email = [];
var password = [];
var role = [];

var user
app.use(bodyparser.urlencoded({extended:false}));
app.use(logger);

app.get("/",function(req,resp){
		resp.sendFile("home.html",{root:__dirname});
});


app.get("/login",function(req,resp){
		resp.sendFile("login.html",{root:__dirname});
});

app.get("/register",function(req,resp){
		resp.sendFile("register.html",{root:__dirname});
});

app.post("/login",function(req,resp){
		status = login.process(req.body.username,uname);
		console.log(status);
		var str = "";
		if(status==-1)
		{
			str+= "User Not Found";
			console.log("User Not Found");
		}
		else
		{
			str = " Email " + email[status];
			str+= "<br>";
			str+= " Role " + role[status];
			console.log("Login Succesfull " + str);
		}
		console.log(str);
		resp.send(str);
});

app.post("/register",function(req,resp){
		uname.push(req.body.username);
		email.push(req.body.email);
		password.push(req.body.password);
		role.push(req.body.role);
		
		str = "Registration Succesfull";
		str += "<br>";
		str += "<a href='/login'>Login</a>";
		resp.send(str);
});

app.listen(2000);
console.log("server running on port 2000");
