package game;

public class characters {
  public static void perso(String p1) { 
	  
	  
	  
  class guerreiro extends character {
	  
	  
	  @Override
	   void ataque(){
		System.out.println("guerreiro atacou");
		
	  }
	  
	  
	  @Override
	   void dano() {
		System.out.println("o guerreiro foi atingido");
	  }
  }
  
  
  class mago extends character {
	  
	  @Override
	  void ataque(){
		System.out.println("o mago lançou magia");
		
	  }
	  
	  
	  @Override
	  void dano() {
		System.out.println("o mago recebeu dano");
	  }
  }
  
  
  
  class arqueiro extends character {
	  
	  @Override
	  void ataque(){
		System.out.println("o arqueiro disparou sua flecha");
	  }
	  
	  
	  @Override
	  void dano() {
		System.out.println("o arqueiro recebeu dano");
	  }
  }
   
  character m1 = null;
  try {
  if (p1.equalsIgnoreCase("mago")) {
	  m1 = new mago();
  }
  else if (p1.equalsIgnoreCase("guerreiro")) {
	  m1 = new guerreiro();
  }
  else if (p1.equalsIgnoreCase("arqueiro")) {
	  m1 = new arqueiro();
  }
  else {
	  System.out.println("erro");
  }
  
  if (m1 != null) {
  eventos.inimigo(m1);
  
  }
  
  }
  catch (Exception e) {
	  System.out.println("fim da rodada");
  }
}
}
