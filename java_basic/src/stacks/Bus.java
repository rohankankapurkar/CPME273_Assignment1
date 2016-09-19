package stacks;
import java.util.*;





public class Bus {
	
	Stack<Character> st = new Stack<Character>();
    Scanner sc = new Scanner (System.in);
      public void reverseString() {
	
	System.out.println("Enter the string you want to reverse");
	String name = sc.nextLine();
	
	char r [] ;
	int length = name.length();
	
	for (int i = 0 ; i< length ; i++)
	{
		
		st.push(name.charAt(i));
		
	}
		
	System.out.println("the string which you have entered is  " + name+ "    And its reverse string is");
		
	print(st);
	
	      
	
}

      

public static void print (Stack s)
{
   String str = "";
   int length = str.length();
   while(!s.empty())
   {
      System.out.println(s.peek());
      s.pop();
      
      
  
   }
   
}

}


 

		
	
	
	
	
	
	
	





