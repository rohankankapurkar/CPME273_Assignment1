package arrays;
import java.util.Scanner;



public  class Arrays {
	
    public static Person [] persons = new Person[10];


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

	    public static void showMenu() {
		
		System.out.println("Enter 1 to add the contact");
		System.out.println("Enter 2 to remove the contact");
		System.out.println("Enter 3 to check the contact");
		
	}
	    

		public static int add(){
			Scanner sc = new Scanner(System.in);
			

			System.out.println("Enter the name");
			String name = sc.nextLine();
			System.out.println("Enter the number");
	        String number = sc.nextLine();
			
			System.out.println("Enter the email");
	        String email = sc.nextLine();
	        
	        
	        //Person p = new Person (name,number,email);
	        

	        int length = 0; 
	       
	        persons[length] = new Person(name,number,email);	
	        System.out.println("The person has been added into contact list :  " + persons[length].name);
	        length++;    
	        return 0;
		}
		
	     public static void main(String[] args) {

			showMenu();
			
			int choice = getMenu();
			while(choice>0){
				switch(choice){
				case 1:
					add();
				    break;
				case 2:
					
					Person.remove();
					break;
				case 3:
					Person.showContact();
					break;  
				
				
			
				default:
					System.out.println("!!!Invalid Choice!!!");
				}
				showMenu();
				choice =  getMenu();
			}		
		}
		
	}

