/*

Write a menu program to insert, update, delete and search elements in the array. 
Use switch case in main function to display menu to user 
 
 */
//package menuprogram;
import java.util.*;
public class array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int i,n,m;
		 int position,key,insert,index,update;
		 System.out.println("Press 1 to insert, 2 to update, 3 to delete, 4 to search");
		    m= input.nextInt();
		 System.out.println("Enter the numbers of elements in array ") ;
			n = input.nextInt();
			int[] a = new int[n];  //int[] arrayname=new int[size] 1-D array;
	   		System.out.println("Enter the elements in the array") ;
	   		for(i=0;i<n;i++){
	       		a[i] = input.nextInt();
	   		}
   		int[] temp = new int[n+1];
		switch(m) {
			 case 1:
		 System.out.println("Enter element to be inserted in the array");
	 		insert = input.nextInt();
	 		 System.out.println("Enter the index number for element to be inserted");
	 		 index=input.nextInt();
	 		 for(i=0;i<=a.length;i++) {
	 			 if(i<index) {
	 				 temp[i]=a[i];
	 			 }
	 			 if(i>index) {
	 				 temp[i]=a[i-1];
	 			 }
	 			 if(i==index) {
	 				 temp[i]=insert;
	 			 }
	 		 }
	 		System.out.println("After inserting, "+ insert +" , the new array is");
	 		for(i=0;i<=n;i++) {
	 			System.out.println(temp[i]);
	 		}
	 		break;	
	 case 2:
		 System.out.println("Enter element to be place in the array");
	 		update = input.nextInt();
	 		 System.out.println("Enter the index number for element to be placed in the array");
	 		 index=input.nextInt();
	 		 for(i=0;i<a.length;i++) {
	 			 if(i<index) {
	 				 temp[i]=a[i];
	 			 }
	 			 if(i>index) {
	 				 temp[i]=a[i];
	 			 }
	 			 if(i==index) {
	 				 temp[i]=update;
	 			 }
	 		 }
	 		System.out.println("After updating the new array is");
	 		for(i=0;i<n;i++) {
	 			System.out.println(temp[i]);
	 		}
	 		break;
	 case 3:
		 System.out.println("Enter the position of the number which is to be deleted");
	 		position = input.nextInt();
			for(i=position;i<n-1;i++){
	        		a[i]=a[i+1];
	    		}
	    		//n=n-1;
	    	System.out.println("After deleting the new array is");
	    		for(i=0;i<n-1;i++) {
	        		System.out.println(a[i]);
	    		}
	    		break;
	 case 4:
		 System.out.println("Enter the number to search in the array");
   	   key = input.nextInt();
  		for (i= 0;i<a.length; i++){
  	         if (a[i] == key) {
  	           System.out.println(key+" is present at location "+(i));
  	           break;
  	         }
  	      }
  	      if (i == a.length) {
  	    	  System.out.print(key + " doesn't exist in array.");
  	      }
  	      break;
	 default:
		 System.out.println("Sorry wrong input for array operation");
		 
	 }

	}

	}
