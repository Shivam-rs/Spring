package com.shivam.learningspringfw.game;

public class GameRunner {

	private SuperContraGame game;

	public GameRunner(SuperContraGame game) {

		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: " + game);

		game.up();
		game.down();
		game.left();
		game.right();
	}

}
