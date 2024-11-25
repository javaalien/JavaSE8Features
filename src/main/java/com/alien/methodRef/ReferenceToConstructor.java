package com.alien.methodRef;

public class ReferenceToConstructor {
	public static void main(String[] args) {
		Messageable hello = Message::new;
		hello.getMessage("Hello Alien");
	}
}

interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.print(msg);
	}
}