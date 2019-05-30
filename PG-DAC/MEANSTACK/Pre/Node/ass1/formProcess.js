http=require('http');
url=require('url');
query=require("querystring");
fs=require('fs');

function process_request(req,resp){
   u=url.parse(req.url);
   console.log(u);
   resp.writeHead(200,{'content-type':'text/html'});
   switch(u.pathname){
     case '/':
	    fs.readFile("./empform.html",function(err,data){
		     if(err){
			     resp.write("Some error");
				 console.log("error occured");
			 }
			 else{
			     resp.write(data);
			    
			 }
			 resp.end();
		});
		break;
	case '/employee':
	       str="";
		   req.on("data",function(d){
			   str+=d;
		   });
		   req.on("end",function(){
				response = "";
				console.log("str :" ,str);
				formresult=query.parse(str);
				response += "ID: " + formresult.id;
				response += "  Name: " + formresult.name;
				response +=	"  Age: " + formresult.age;
				response += " Salary: " + formresult.salary;
				resp.end(response);
		   });		
	     break;
    
   }

}

server=http.createServer(process_request);
server.listen(3000);
console.log("server is running at port 3000");
