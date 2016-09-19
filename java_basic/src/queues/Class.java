package queues;

import java.util.*;
public class Class {
Scanner sc = new Scanner(System.in);
Queue<String>  q = new LinkedList < String > () ; 

	
	public void book() {
		
		   
		   System.out.println("Enter your name");
		   
		   String name = sc.nextLine();
		   
		   
           q.add(name);
           
           System.out.println("You are in the enrollment queue " +name +"Your waitlisting number is  "+q.size());
           System.out.println( " ");
		
	}
	
	public void show(){
		Iterator it = q.iterator();
	      
		   System.out.println ( "Stdents in the queue in FIFO manner are : ");
		      
		   while (it.hasNext()){
		   System.out.println ( " "+ it.next());
		   }
		
	}
	
	public void showNumber(){
		System.out.println("Number of people who have enrolled are");
		System.out.println(q.size());

		
	}
}
