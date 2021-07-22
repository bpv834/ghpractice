package infren_app;

public class EnemyC extends Character {

	public EnemyC(String name, int hp, int atk) {
		super(name, hp, atk);
	}
	
	public void attack(Character enemy) {
		
		if (hp<=20) {
		
		System.out.println("Orc È­³²");
		this.atk+=15;
		}
		super.attack(enemy);
	}
	
}
