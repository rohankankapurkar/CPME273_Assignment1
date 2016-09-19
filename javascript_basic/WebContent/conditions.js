function addPizza() {
	
	var regular = document.getElementById("pizza1");
	var cheese = document.getElementById("pizza2");
	var chicken = document.getElementById("pizza3");
	var veggies = document.getElementById("pizza4");
	var crust = document.getElementById("pizza5");
	
	
	var pizza = [];
	var i = pizza.length;
	var cost = 0;
	
	if (regular.checked == true)
		{cost = cost + parseInt(regular.value);
		pizza[i] = "Regular pizza with extra";
		i++;
		}	

	if (cheese.checked == true){
		cost = cost + parseInt(cheese.value);
		pizza[i] = "Cheese";
		i++;
	}
	
	
	if (chicken.checked == true){
		cost = cost + parseInt(chicken.value);
		pizza[i] = "Chicken";
		i++;	
	}
	if (veggies.checked == true){
		pizza[i] = "Veggies";
		i++;	
        cost = cost + parseInt(veggies.value);
	}
	if (crust.checked == true){
		cost = cost + parseInt(crust.value);
		pizza[i] = "Thin crust";
		i++;
	}
	document.getElementById("output").innerHTML = "As per your selection the total cost of the Pizza is  "+cost+ "<br> The topping selection is ";

	
	
	for (var i =0; i<pizza.length;i++)
		{
		document.getElementById("output").innerHTML += pizza[i]+ "  ";
		
		}
	
	
	
	
	var confirm1 = window.confirm("Shall we confirm your order with bill  " + cost);
	
	if (confirm1 == true)
		{
		document.getElementById("output").innerHTML += "</br>Thanks for ordering Pizza. Your Pizza is geeting ready</br>";
		}
	else {
		document.getElementById("output").innerHTML += "You cancelled your order.Kindly chhose your menu again</br>";
	}	
}