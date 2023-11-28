package com.test_sp.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) throws IOException {
		List<Message> messageList = new MessageReader().readMessagesFromFile();
		for (Message message : messageList) {
			message.accept(visitor);
			System.out.println();
		}
	}

}
