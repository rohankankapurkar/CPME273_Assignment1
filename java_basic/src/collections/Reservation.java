package collections;



import java.util.*;
public class Reservation {
Scanner sc = new Scanner(System.in);
Queue<String>  q = new LinkedList <String> () ; 

	
	public void book() {
		
		   
		   System.out.println("Enter your name");
		   
		   String name = sc.nextLine();
		   
		   
           q.add(name);
           
           System.out.println("Your name is been forwarded " +name +"Your number is  "+q.size());
           System.out.println( " ");
		
	}
	
	public void show(){
		Iterator it = q.iterator();
	      
		   System.out.println ( "Employees are : ");
		      
		   while (it.hasNext()){
		   System.out.println ( " "+ it.next());
		   }
		
	}
	
	public void showNumber(){
		System.out.println("Number of people who will be joining this meeting");
		System.out.println(q.size());

		
	}
}

