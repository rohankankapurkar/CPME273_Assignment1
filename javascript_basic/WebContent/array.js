function medicine (name,price,expiry) {
	this.name =name;
	this.price = price;
	this.expiry = expiry;

}

var medicines = [];
var i = medicines.length;


function addMedicine (){
	
	
	i =medicines.length;

	var name = document.getElementById("name").value;
	var price = document.getElementById("price").value;
	var expiry = document.getElementById("expiry").value;
	
	medicines[i] = new medicine(name,price,expiry);
	
	alert(	medicines[i].name+ "  has been added");

	i++;
	//document.getElementById("output").innerHTML = "new medicine has been added :  "+ medicines[i].name ;  

	
	
}


function showAll() {
	
	document.getElementById("output").innerHTML += "you have following medicines in store";

	for (var i =0 ;i<medicines.length;i++)
		{
		document.getElementById("output").innerHTML +=  "<br>"+medicines[i].name+ "  has price  "+ medicines[i].price + " and expiry as " + medicines[i].expiry + "<br>";
		}
}



function removeMedicine() {
	
	var remove = document.getElementById("remove").value;
     
	
	for (var i = 0; i< medicines.length ; i++)
		
		{
		
		if(medicines[i].name == remove)
			{
			alert(remove+ "  has been removed");
			medicines.splice(i,1);
			showAll();
			}
		
		}
		
	
}



function checkExpiry (){
	
	var name = document.getElementById("name").value;
	
	for (var i = 0; i< medicines.length ; i++)
        {
		if (name === medicines[i].name)
			{
			alert("The expirt of the medicine" + expiry + "  is " + medicines[i].expiry);
			
			}
        }
	
	
	
	
}


