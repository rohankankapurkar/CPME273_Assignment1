package arrays;
import java.util.*;
public class Person {
	 String name;
	 String number;
	 String email;

	Person(String name,String number, String email){
		
		this.name = name;
		this.number = number;
		this. email = email;
	}
	
	
	public static void showContact() {
		
		for ( int i =0;i<Arrays.persons.length;i++)
		
		{
		System.out.println("The members are" +Arrays.persons[i]);	
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void remove () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of person you want to search");
		
		String name = sc.nextLine();
		for (int i = 0 ; i< Arrays.persons.length; i++)
		{
			if (Arrays.persons[i].name == name)
			{
				System.out.println("Person found");
				
			}
			else
			{
			    System.out.println("No name found");	
			}
		}   
		
		
		
	}

}
