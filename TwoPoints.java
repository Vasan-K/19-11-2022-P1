package satTest;

import java.util.*;

public class TwoPoints{

	public static void main(String[] args) {
		  int sp,fp;
	      try (Scanner a = new Scanner(System.in)) {
			System.out.println("Enter the Slow pointer:");
			  sp=a.nextInt();
			  System.out.println("Enter the fast pointer:");
			  fp=a.nextInt();
		}
	      computePointOfInterception(sp,fp);

	}
	
	public static void computePointOfInterception(int x, int y) {
		 
        for(int i=1;i<=12;i++){
    
           if(x==y)
             {
  	          System.out.println(x);
  	          break;   
              }
    
            x++;
            y+=2;
            x=x%12;
            y=y%12;
    
         }
    }
	
}

	



    