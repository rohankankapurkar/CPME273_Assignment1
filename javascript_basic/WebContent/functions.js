var tasks = [];


function addTask() {
    
	var i = tasks.length;
	tasks[i] = document.getElementById("task").value ;
	
	document.getElementById("output").innerHTML += "Task added =  "+ tasks[i]+ "</br>";
	i++;
	
}


function showTasks() {
	
	document.getElementById("output").innerHTML += "You have below tasks pending </br>";

	for (var i = 0; i< tasks.length ; i++)
		{
		
		document.getElementById("output").innerHTML += tasks[i] + "</br>";
		}
}


function removeTask() {
	
	var found = 0;
	
	
	for (var i = 0;i<tasks.length;i++){
		
	if (tasks[i] === document.getElementById("remove").value)
		{
		
		document.getElementById("output").innerHTML += "Task "+ tasks[i] +" is deleted<br>";
		tasks.splice(i,1);
		found = 0;
		break;
		}
	else {
	   found = 1;
	}
    
}  
	
if (found == 1){
	document.getElementById("output").innerHTML += "Task is invalid<br>";

}
	
}


