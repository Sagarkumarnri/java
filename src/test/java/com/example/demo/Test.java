package com.example.demo;

import static org.hamcrest.CoreMatchers.startsWith;

public class Test {
	public static void main(String[]args)
	{
		new Thread(()->{

			System.out.println("inside run method");

			


			}).start();

	}

}
