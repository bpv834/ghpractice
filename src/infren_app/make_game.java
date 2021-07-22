package infren_app;

public class make_game {

	static class Player{
		
		String name;
		int hp;
		int atk;
		
		public Player(String name, int hp, int atk) {
			this.name=name;
			this.hp=hp;
			this.atk=atk;
		}
		public void attack(Enemy enemy) {
			System.out.println("Player Attack!");
			System.out.println("공격 전 적의 피는"+enemy.hp);
			enemy.hp-=this.atk;
			System.out.println("공격 후 적의 피는"+enemy.hp);
			}
		public boolean isLive() {
			if(hp<=0) {
				return false;	
			}
			else {return true;}
		}
		}
	
	
	static class Enemy{
		String name;
		int hp;
		int atk;
		
		public Enemy(String name, int hp, int atk) {
			this.name=name;
			this.hp=hp;
			this.atk=atk;
			
	}
		
		public void attack(Player player) {
			System.out.println("Enemy Attack!");
			System.out.println("공격전 플레이어"+player.hp);
			player.hp-=this.atk;
			System.out.println("공격후 플레이어"+player.hp);
		}
		public boolean isLive() {
			if(hp<=0) {
				return false;	
			}
			else {return true;}
		}
	
	
	public static void main(String[] args) {
		Player player=new Player("hj",100,11);
		Enemy enemy=new Enemy("Orc",80,11);
		
		while(player.isLive()&&enemy.isLive()) {
			
		player.attack(enemy);
		if(!enemy.isLive())
			break;
		enemy.attack(player);
		}
		if(player.isLive()) {
			System.out.println("플레이어 승");}
		else {
			System.out.println("적군 승");
		}
	
	}
		}

	

}
