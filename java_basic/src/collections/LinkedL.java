package collections;






import java.util.*;

public  class LinkedL {

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

	    public static int showMenu() {
		
		System.out.println("Enter 1 to book the meeting ");
		System.out.println("Enter 2 to see people who are joining");
		System.out.println("Enter 3 to number of people who will be joining the meeting");
		return 1;
		
	}

	

	     public static void main(String[] args) {

			showMenu();
			Reservation b= new Reservation();
			int choice = getMenu();
			while(choice>0){
				switch(choice){
				case 1:
					b.book();
				    break;
				case 2:
					b.show();
					break;
				case 3:
					b.showNumber();
					break;
				
				
			
				default:
					System.out.println("!!!Invalid Choice!!!");
				}
				showMenu();
				choice =  getMenu();
			}		
		}
		
	}


