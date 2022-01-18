package me.kalsep.jadventure;

import java.util.Random;

public class Renderer {
	World world = new World();
	Player player = new Player();
	Random random = new Random();
	
	char playerChar, worldChar;
	String title;
	String[] messages = {
			"making your life better",
			"moving letters on your screen", 
			"wishes you a good day", 
			"cries from existential pain",
			"brings you this message",
			"putting the creator of this on fire",
			};
	
	public Renderer() {
		//▀▄█▌▐░▒▓
		
		this.playerChar = 'O';
		this.worldChar = '#';
		this.title = "2DJadventure - " + messages[random.nextInt(messages.length)];
	}
	
	public void info(int x, int y) {
		System.out.println(Player.name + " - " + Player.x + ", " + Player.y);
		//System.out.print(x + ", " + y);
	}
	
	public void draw() {
		for (int i = 0; i < world.height + 1; i++) {
			for (int j = 0; j < world.width + 1; j++) {
				System.out.print((j == Player.x && i == Player.y) ? playerChar : worldChar);
			}
			System.out.println("");
		}
	}
}
