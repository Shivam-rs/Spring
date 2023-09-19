package com.shivam.learningspringfw.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("Hide");
	}

	@Override
	public void left() {
		System.out.println("Do something");
	}

	@Override
	public void right() {
		System.out.println("Walk");
	}
}
