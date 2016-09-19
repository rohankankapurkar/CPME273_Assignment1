function employee(fname,lname,number,mail) {
	
this.fname = fname;
this.lname = lname;
this.number =number;
this.mail =mail;
this.role = "employee";

this.getDetails = function getDetails() {
	
	document.getElementById("output").innerHTML = "This is  " + this.fname;

	
}
	
}


function DBA(fname,lname,number,mail) {
	this.fname = fname;
	this.lname = lname;
	this.number =number;
	this.mail =mail;
	this.role = "DBA";
	
}



function developer(fname,lname,number,mail) {
	this.fname = fname;
	this.lname = lname;
	this.number =number;
	this.mail =mail;
	this.role = "developer";
	

}




DBA.prototype = new employee();
developer.prototype  = new employee();

var x = [];
function add() {
	
	
	
	var fname= document.getElementById("fname").value;
	var lname= document.getElementById("lname").value;
	var number= document.getElementById("number").value;
	var mail= document.getElementById("mail").value;
	
	

	
	var i = x.length;
	var option = document.getElementById("option").value;
	
	
	
	if (option === "DBA")
		{

		x[i] = new DBA(fname,lname,number,mail);
		document.getElementById("output").innerHTML = "</br>New employee is added  "+ x[i].fname + "He is "+  x[i].role+ "<br></br>";
		i++;
		}
	else
		{

		x[i] = new developer(fname,lname,number,mail);
		document.getElementById("output").innerHTML = "</br>New employee is added  "+ x[i].fname + "He is "+  x[i].role + "</br></br>";
		i++;
		}
	}
 

function show(){
	
	for (var i =0;i<x.length ; i++)
      {
	
			document.getElementById("output").innerHTML += "</br>  "+ x[i].fname + "He is "+  x[i].role;
		}		

		
		
}	