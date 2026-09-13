package game;
import java.util.Random;
import java.util.Scanner;

public class eventos {
		
   public static void inimigo(character m1) {
	   
	   System.out.println("um inimigo apareceu");
	   System.out.println("digite atk para atacar");
	   Scanner scanner = new Scanner(System.in);
	   String m2 = scanner.nextLine();
		   if (m2.equalsIgnoreCase("atk")) {
			   m1.ataque();
		   }
		   
      
   }
   
   
   static void parede() {
	   System.out.println("uma parede de preda apareceu no meio do caminho");
	   System.out.println("digite dst para destruir ela!!!");
	   Scanner scanner = new Scanner(System.in);
	   String m2 = scanner.nextLine();
	   if (m2.equalsIgnoreCase("dst")) {
		   System.out.println("vc destruiu a parede");
	   }
	   
   }
   
   
   
   static void chefao() {
	   int pont = 0;
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("chefão apareceu");
	   System.out.println("digite atk e vezes para matar");
	   
	   for (int i=0;i<3;i++) {
	   String m2 = scanner.nextLine();
	   if (m2.equalsIgnoreCase("atk")) {
		   pont += 1;
		   System.out.println("vc lançou o"+ " "+pont+" "+"atk");
		   if (pont == 3) {
			   System.out.println("vc matou ele");
			   }
	   }
	   }
	   
   }
   
   public static void rodarEvt() {
   Random random = new Random();
   int e = 0;
   try {
   while (e < 4) {
   int num = random.nextInt(3)+1;
	   
   if (num == 1) {
	   inimigo(null);
	   e++;
	   
   }
   else if (num == 2) {
	   parede();
	   e++;
	   
   }
   else if (num == 3) {
        chefao();
        e++;
        
}
   }
   }
   catch (Exception t) {
	System.out.println("fim rodada");   
   }
}
}	




