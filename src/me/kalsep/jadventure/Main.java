package me.kalsep.jadventure;

public class Main {
	
	/*public static int move() {
		Player player = new Player();
		return player.x++;
	}*/
	
	public static void main(String[] args) {
		Renderer renderer = new Renderer();
		Player player = new Player();
		System.out.println(renderer.title);
		
		while (true) {
			renderer.info(Player.x, Player.y);
			renderer.draw();
			
			player.move();
		}
	}
	
}
