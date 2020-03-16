package day04;

/*
	반복문을 사용해서 다음 모양을 출력하세요.
	
		1-0.
			*****
			*****
			*****
			*****
			*****
			
		1. 
			*
			**
			***
			****
			*****
		
		2.
			    *
			   **
			  ***
			 ****
			*****
		
		3. 
			*****
			****
			***
			**
			*
		
		4. 
			*****
			 ****
			  ***
			   **
			    *
			    
		5. 
			    *
			   ***
			  *****
			 *******
			*********
			
		6.
			    *
			   ***
			  *****
			 *******
			*********
			 *******
			  *****
			   ***
			    *
		
		7-0.
			    12345
			    12345
			    12345
			    12345
			    
		7-1.
				1  2  3  4  5
				6  7  8  9  10
				11 12 13 14 15
				16 17 18 19 20
				21 22 23 24 25
		
		7.
			1
			12
			123
			1234
			12345
			
		8.
			    1
			   12
			  123
			 1234
			12345
			
		9.
			12345
			1234
			123
			12
			1
			
		10.
			1
			2  3
			4  5  6
			7  8  9  10
			11 12 13 14 15
			
		00
			1  1  1  1  1
			2  2  2  2  2  
		    3  3  3  3  3
		    4  4  4  4  4
		    5  5  5  5  5
		
 */
public class Hw99 {

	public static void main(String[] args) {
		
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            	System.out.println("");
        	}
        System.out.println("-------------------------");
        for(int i=5;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            	System.out.println("");
        	}
        
        for(int i = 1; i <= 5; i++ ) {
        	for(int j=1; j<=5; j++) {
        		System.out.print(i + "  ");
        	}
        	System.out.println("");
        }

        System.out.println("------------------------------");
        for(int i = 1; i<=5; i++) {
        	
        	for(int j=1; j<=5; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println("--------------------------");
        
        for(int i = 0; i<5; i++) {
        		for(int j=5; j>=0; j--) { 
        			if(j > i) {
        				System.out.print(" ");
        			}else {
        				System.out.print("*");
        			}
        		}
        		System.out.println();
        }
        

        System.out.println("--------------------------");

        for(int i=0; i<5; i++) {
        	for(int j=1; j<=5; j++ ) {
        		if(j>i) {
        			System.out.print("*");

        		}else{
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        }
        System.out.println("--------------------------");
        
        for(int i=0;i<5;i++){
        	for(int j=0;j<5-i;j++){
        		System.out.print(" ");  
        	}
        	for(int j=0;j<2*i+1;j++){
        		System.out.print("*"); 
        	}
        	System.out.println("");
        }
        System.out.println("--------------------------");
        
        int no =0;
//        String str = no+"";
        
        for(int i =1; i<=5; i++) {
        	for(int j=1; j<=5; j++) {
        		
        		no++;
        		if(no < 10) {
        			System.out.print(no + "  ");
        		}else {
        			System.out.print(no + " ");
        		}
        			
        	}
        		System.out.println();
        }
        System.out.println("--------------------------");
        
        for(int i=1; i<=5; i++) {
        	for(int j=1; j<=i; j++) {
        		System.out.print(j);
        		
        		
        	}
        	System.out.println();
        	
        }
        System.out.println("--------------------------");
      /*
       *    43210
       * 		1
			   12
			  123
			 1234
			12345
       */
        for(int i=1; i<=5; i++) {
        	for(int j=4; j>=0; j--) {
        		if(j>=i) {
	    		/* 4  1  =  " "
	    		 * 3  1  =  " "
	    		 * 2  1  =  " "
	    		 * 1  1  =  " " 
	    		 * 0  1  =  "1-0=1"
	    		 * -----------------
	    		 * 4  2  = " "
	    		 * 3  2  = " "
	    		 * 2  2  = " "
	    		 * 1  2  = "2-1=1"
	    		 * 0  2  = "2-0=2"
	    		 * -----------------
	    		 * 4  3  = " "
	    		 * 3  3  = " "
	    		 * 2  3  = "3-2=1"
	    		 * 1  3  = "3-1=2"
	    		 * 0  3  = "3-0=3"
	    		 * ------------------
	    		 * ......
	    		 * 
	    		 */
        			System.out.print(" ");
        		}else {
        			System.out.print((i-j));
        		}
        	}
        	System.out.println();
        }
        System.out.println("--------------------------");
        
        for(int i=5; i>=1; i--) {
        	for(int j=1; j<i+1; j++) {
        		System.out.print(j);
        		
        	}
        	System.out.println();
        }
        
        System.out.println("--------------------------");
        int no2 =0;
        for(int i= 1; i<=5; i++) {
        	for(int j = 1; j<=i; j++){
        		
        			no2 ++;

        			System.out.printf("%3d",no2);
        			
//        			if(no2 <10) {
//        				System.out.print(no2 + "  ");
//        			}else {
//        				System.out.print(no2 + " ");
//        			}
        		}
        	System.out.println();
        }
        System.out.println("--------------------------");
        
        for(int i =0; i<5; i++) {
        	for(int j=0; j<5; j++) {
        		System.out.printf("%3d", (i+1) + 5*j);
        	}
        	System.out.println();
        }
        
	}

}