package me.kalsep.jadventure;

import java.util.Scanner;

public class Player {
	World world = new World();
	static Scanner keyListener = new Scanner(System.in);
	
	static int x = 2;
	static int y = 1;
	static final String name = "hamer";
	
	public void move() {
		char key = 0;
		
		try {
			key = keyListener.nextLine().charAt(0);
		} catch (Exception exception) {
			System.out.println(key + ": " + exception);
		}
		
		switch (key) {
			case 'w':
				Player.y = (Player.y - 1 == -1) ? Player.y : Player.y - 1;
				break;
			
			case 'a':
				Player.x = (Player.x - 1 == -1) ? Player.x : Player.x - 1;
				break;
				
			case 's':
				Player.y = (Player.y + 1 == world.height + 1) ? Player.y : Player.y + 1;
				break;
				
			case 'd':
				Player.x = (Player.x + 1 == world.width + 1) ? Player.x : Player.x + 1;
				break;
		}
	}
	
}
