express = require("express");
bodyparser = require("body-parser");

fdiv = require("./formdiv");

app = express();

var logger=function(req,resp,next){
			console.log(req.url);
			next();
}

app.use(bodyparser.urlencoded({extended:false}));
app.use(logger);

app.get("/",function(req,resp){
		resp.sendFile("formdiv.html",{root:__dirname});
});

app.post("/div",function(req,resp){
		result = fdiv.div(req.body.num);
		console.log(result);
		resp.send(result);
});

app.listen(2000);
console.log("server running on port 2000");
