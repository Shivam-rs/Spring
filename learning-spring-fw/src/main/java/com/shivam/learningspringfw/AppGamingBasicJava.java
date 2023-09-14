package com.shivam.learningspringfw;

import com.shivam.learningspringfw.game.GameRunner;
import com.shivam.learningspringfw.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {

		// var marioGame = new MarioGame();

		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);

		gameRunner.run();

	}

}
