package com.learningspringfw.games;

import org.springframework.stereotype.Component;

@Component

public class SuperContraGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("sit");
	}

	@Override
	public void left() {
		System.out.println("cover");
	}

	@Override
	public void right() {
		System.out.println("fight");
	}
}
