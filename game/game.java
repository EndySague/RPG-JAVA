package game;
import java.util.Scanner;
//concluido
public class game {
	public static void main(String[]args) {
		System.out.println("escolhar: guerreiro, mago, arqueiro");
		Scanner scanner = new Scanner(System.in);
		
		String p1;
		while (true) {
			p1 = scanner.nextLine();
		if (p1.equalsIgnoreCase("guerreiro")) {
			System.out.println("você escolheu guerreiro use sua espada!!!");
			break;
		}
		else if (p1.equalsIgnoreCase("mago")) {
			System.out.println("você escolheu o Mago agora e capaz de usar magias!!!");
			break;
		}
		else if (p1.equalsIgnoreCase("arqueiro")) {
			System.out.println("você escolheu o arqueiro sua mira e certeira!!!");
			break;
		}
		else {
			System.out.println("tente novamente");
		}
		}
		characters.perso(p1);
		eventos.rodarEvt();
		 
		
		
	}
}

abstract class character {
	
	protected int hp = 100;
	
	
	void dano(){
		System.out.println("recebeu dano");
	}
	
	void ataque() {
		System.out.println("atacou");
	}
	
}