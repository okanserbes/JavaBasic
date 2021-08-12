package com.neotech.lesson25;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Registration reg = new Registration();

		System.out.println("Your e-mail is");
		reg.setEmail("okanserbes@yahoo.com");
		System.out.println(reg.getEmail());

		System.out.println("Your username is");
		reg.setUserName("okanserbes111");
		System.out.println(reg.getUserName());
		System.out.println("Your password is");
		reg.setPassword("123456767");
		System.out.println(reg.getPassword());
	}

}
