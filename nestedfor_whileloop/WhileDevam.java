package nestedfor_whileloop;

import java.util.Scanner;

public class WhileDevam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Kullanicidan baslangic ve bitis degerlerini alin. 
        //Baslangic degeri ve bitis degeri
        //dahil aralarindaki tum cift tamsayilari 
        //while loop kullanarak ekrana yazdiriniz.
	
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen baslang�� ve biti� degeriniz yaz�n�z");
	int ba�lang��=scan.nextInt();
	int biti�=scan.nextInt();
	
if (ba�lang��>biti�) {
          while (biti�<=ba�lang��) {
   	              if (biti�%2==0) {
	    	   System.out.println(biti�);	
	    	}
	            biti�++;    		
	}
	    
} else {
          while (ba�lang��<=biti�) {
    	     if (ba�lang��%2==0) {
    		     System.out.println(ba�lang��);
    	}
    	ba�lang��++;
    	
    }
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
