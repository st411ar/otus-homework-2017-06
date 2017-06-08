package org.st411ar.otus;

import au.com.bytecode.opencsv.CSVParser;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Hello, Otus!");
		System.out.println("Dependencies checking is started");
		CSVParser parser = new CSVParser();
		System.out.println("Dependencies checking is finished successfully");
		System.out.println("See you, Otus!");
	}
}