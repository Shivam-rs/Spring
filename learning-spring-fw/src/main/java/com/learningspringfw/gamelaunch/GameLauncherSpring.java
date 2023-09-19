package com.learningspringfw.gamelaunch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learningspringfw.games.GameRunner;
import com.learningspringfw.games.GamingConsole;

@Configuration
@ComponentScan("com.learningspringfw.games")

public class GameLauncherSpring {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GameLauncherSpring.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();

		}

	}

//	@Bean
//	public GamingConsole game() {
//		var game = new PacmanGame();
//		return game;
//	}
//
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}
}
