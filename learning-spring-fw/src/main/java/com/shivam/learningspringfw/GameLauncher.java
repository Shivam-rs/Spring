package com.shivam.learningspringfw;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shivam.learningspringfw.game.GameRunner;
import com.shivam.learningspringfw.game.GamingConsole;

@Configuration
@ComponentScan("com.shivam.learningspringfw.game")

public class GameLauncher {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GameLauncher.class)) {
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
