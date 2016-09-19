package stacks;


import java.util.*;

public class Stack1 {

	public static void SelectMenu() {

		
		System.out.println("Enter 1 To reverese a string");
		
		
	}

	public static int getMenu() {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		try{
			choice = Integer.parseInt(sc.next());
		}catch(Exception E){
			System.out.println("Please enter a number as the menu says!");
			return 10;
		}	
		return choice;
	}

	public static void main(String[] args) {

			SelectMenu();
			Bus b= new Bus();
			int choice = getMenu();
			while(choice>0){
				switch(choice){
				case 1:
					b.reverseString();
					break;
				
				
			
				default:
					System.out.println("!!!Invalid Choice!!!");
				}
				SelectMenu();
				choice =  getMenu();
			}		
		}
		
	}

