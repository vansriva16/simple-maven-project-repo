package com.sapient.trg.pl;

public class MessageTest {
	public static void main(String[] args) {
		MessageBuilder messageBuilder = new MessageBuilder();
		
		System.out.println(messageBuilder.getMessage(null));
		System.out.println(messageBuilder.getMessage("Srini"));



}
}