package generics;

import java.util.Arrays;



public class Sort {

 

    public <E extends Comparable<E>> int sort(E[] a) {
        for (int i = 0; i < a.length - 1; i++) {
        	
        	for ( int j = i+1 ;  j<a.length; j++)
        	{
                 if (a[j].compareTo(a[i])<=0) {
        		{
        			 E temp = a[i];
        	            a[i] = a[j];
        	            a[j] = temp;
        		}
        		}
        		
        	}
        	
        	
        
        }
		return 0;
        
      //  System.out.println("array is" + a);
    }

    public static void main(String[] args){
        Sort firstsort = new Sort();

        Integer[] a = {1,2,5,4,3,7};
        System.out.println("before : "+Arrays.toString(a));

        firstsort.sort(a);
        System.out.println("aftr sorting the integers : "+Arrays.toString(a));
        
         Character[] b= {'r','o','h','a','n'};
         System.out.println("before : "+Arrays.toString(b));

         firstsort.sort(b);
         System.out.println("After sorting the characters :"+Arrays.toString(b));
         
         
         
         String[] c = {"rr","oo","hh","aa","nn"};
         System.out.println("before : "+Arrays.toString(c));

         firstsort.sort(c);
         System.out.println("After sorting the characters :"+Arrays.toString(c));
         
         
         
         
         
    }
}