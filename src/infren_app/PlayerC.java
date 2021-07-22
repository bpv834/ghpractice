package infren_app;

public class PlayerC extends Character {

	public PlayerC(String name, int hp, int atk) {
	super(name, hp, atk);
}
public void attack(Character player) {
		
		if (hp<=80) {
		
		System.out.println("»ý¸í·Â Èí¼ö");
		this.hp+=10;
		}
		super.attack(player);
	}
}
