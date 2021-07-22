package infren_app;

public class make_game {
	public static void main(String[] args) {
		Character player=new Character("hj",100,11);
		Character enemy=new Character("Orc",80,11);
		
		while(player.isLive()&&enemy.isLive()) {
			
		player.attack(enemy);
		if(!enemy.isLive())
			break;
		enemy.attack(player);
		}
		if(player.isLive()) {
			System.out.println("ÇÃ·¹ÀÌ¾î ½Â");}
		else {
			System.out.println("Àû±º ½Â");
		}
	
	}
		}

	

