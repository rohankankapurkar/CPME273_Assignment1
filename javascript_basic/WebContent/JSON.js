function medicine (name,price,expiry) {
	this.name =name;
	this.price =price;
	this.expiry = expiry;
	}


function cosmetic (name,price,expiry) {
	this.name =name;
	this.price =price;
	this.expiry = expiry;
	}


var meds = [];

function addMedicine(){
	
	var name =document.getElementById("name").value;
	var price = document.getElementById("price").value;
	var expiry = document.getElementById("expiry").value;
	
    var i = meds.length;
    
    meds[i] = new medicine(name,price,expiry);
    
    document.getElementById("output").innerHTML = "added into Meds";
	
     i++;
}

var cosms = [];

function addCosmetic () {
	
	
	var name1 =document.getElementById("name1").value;
	var price1 = document.getElementById("price1").value;
	var expiry1 = document.getElementById("expiry1").value;
	
	var j = cosms.length;
	
	cosms[j] = new cosmetic(name1,price1,expiry1);
	
    document.getElementById("output").innerHTML = "added into Cosms</br>";

		j++;

	
}


var JSONobj = {list1: meds , list2: cosms } ;


function showMed() {

document.getElementById("output").innerHTML += "We have following medicines<br>";

for (var i = 0; i< meds.length; i++)
{	
document.getElementById("output").innerHTML += JSONobj.list1[i].name+ "<br>";
}


}



function showCos() {

	document.getElementById("output").innerHTML += "We have following cosmetics<br>";

	for (var i = 0; i< cosms.length; i++)
	{	
	document.getElementById("output").innerHTML += JSONobj.list2[i].name+ "<br>";
	}


	}


