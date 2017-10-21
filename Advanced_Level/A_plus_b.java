package test;

import java.util.Scanner;

import sun.security.util.Length;

public class A_plus_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    int a = input.nextInt();
	    int b = input.nextInt();
	    while(a < -1000000 || b > 1000000){
	      a = input.nextInt();
	      b = input.nextInt();
	    }
	    String c = "" + (a + b);
	    char[] copy_c = new char[20];
	    String c_abs = "" + Math.abs(a+b);
	    if(c_abs.length() < 4)
    		System.out.print(c);
	    else {
	    	int tail = 0;
	    	int num = 0;
	    	if(a + b < 0) {
		    	System.out.print(c.charAt(0));
		    	for(int i = c.length() - 1,j = 1;i > 0;i--,j++) {
		    		copy_c[j-1] = c.charAt(i);
		    		num++;
		    		//System.out.print(c.charAt(i));
		    		
		    		if(num % 3 == 0) {
		    			copy_c[j] = ',';
		    			j++;
		    			//System.out.print(',');
		    		}		
		    		tail = j;
		    	}
		    	copy_c[tail] = '\0';
		    }
		    if(a + b > 0) {
		    	for(int i = c.length() - 1,j = 1;i > -1;i--,j++) {
		    		copy_c[j-1] = c.charAt(i);
		    		num++;
		    		//System.out.print(c.charAt(i));
		    		
		    		if(num % 3 == 0) {
		    			copy_c[j] = ',';
		    			j++;
		    			//System.out.print(',');
		    		}	
		    		tail = j;
		    	}
		    	copy_c[tail] = '\0';
		    }
		    for(int i = 0;copy_c[i] != '\0'; i++) {
		    	tail = i;
		    }
		    //tail++;
		    if(copy_c[tail] == ',') {
		    	tail--;
		    }
		    for(int i = tail; i > -1; i--) {
		    	System.out.print(copy_c[i]);
		    }
		    if(a + b == 0)		
		    	System.out.print(c);
	    }
		//---------------------------------------------------
		
		
		
	}
		
}
