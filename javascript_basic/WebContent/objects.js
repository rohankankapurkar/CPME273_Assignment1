function contact(fname,lname,number,email){
	
	this.fname = fname;
	this.lname= lname;
	this.number=number;
	this.email=email;

}


var contacts = [ ];
var i=contacts.length;


function addContact () {
	var fname = document.getElementById("fname").value;
	var lname = document.getElementById("lname").value;
	var number = document.getElementById("number").value;
	var email = document.getElementById("email").value;
	
	
	i = contacts.length;
	
	contacts[i] = new contact (fname,lname,number,email);
	
	document.getElementById("output").innerHTML += "New contact has been added "+ contacts[i].fname + "</br>" ;
		
	i++;
 
}


function showContacts () {
	
	document.getElementById("output").innerHTML += "Till now you have these many contacts added in your list</br>"; 
	 
        for (var i = 0 ; i<contacts.length;i++)
        	{
		document.getElementById("output").innerHTML += contacts[i].fname+ " " +contacts[i].lname+ " "+contacts[i].number+ " "+contacts[i].email+"</br>" ; 
		}
        }


function searchContact() {
	
	for (var i =0;i<contacts.length;i++)
{
     if (document.getElementById("search").value === contacts[i].fname)
    	 {
    	 document.getElementById("output").innerHTML += contacts[i].fname+ " is present.And here is his/her contact no "+ contacts[i].number + " and  his/her mail id "+ contacts[i].email + "</br>";
    	 }
     
}	
	
	
}



function removeContact() {
	
	
	for (var i = 0; i<contacts.length; i++)
		{
		if (	document.getElementById("remove").value === contacts[i].fname){
			document.getElementById("output").innerHTML = "The contact "+ contacts[i].fname + " " + contacts[i].lname + " is deleted</br>";
			contacts.splice(i,1);
			showContacts();
			
	    	
		}
		}
	
	
}


