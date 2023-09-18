package com.shivam.learningspringfw.game;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("Go in hole");
	}

	@Override
	public void left() {
		System.out.println("Go back");
	}

	@Override
	public void right() {
		System.out.println("Run fast");
	}
}
