package com.shivam.learningspringfw;

import com.shivam.learningspringfw.game.GameRunner;
import com.shivam.learningspringfw.game.MarioGame;
import com.shivam.learningspringfw.game.PacmanGame;
import com.shivam.learningspringfw.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

		var marioGame = new MarioGame();

		var superContraGame = new SuperContraGame();

		var pacmanGame = new PacmanGame();
		var gameRunner = new GameRunner(pacmanGame);

		gameRunner.run();

	}

}
