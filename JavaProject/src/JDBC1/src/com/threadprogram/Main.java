package com.threadprogram;

public class Main {

	public static void main(String[] args) {
		Thread t= Thread.currentThread();
		String s=Thread.currentThread().getName();
		System.out.println(s);
		System.out.println(t.getPriority());

	}

}


	