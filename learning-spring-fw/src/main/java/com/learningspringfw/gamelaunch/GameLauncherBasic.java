package com.learningspringfw.gamelaunch;

import com.learningspringfw.games.GameRunner;
import com.learningspringfw.games.MarioGame;
import com.learningspringfw.games.PacmanGame;
import com.learningspringfw.games.SuperContraGame;

public class GameLauncherBasic {

	public static void main(String[] args) {

		var marioGame = new MarioGame();

		var superContraGame = new SuperContraGame();

		var pacmanGame = new PacmanGame();
		var gameRunner = new GameRunner(pacmanGame);

		gameRunner.run();

	}

}
