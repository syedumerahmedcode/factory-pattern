package com.umer.server.usage;

import java.util.Scanner;

public class ServerManagementTool {

	public static void main(String[] args) {
		/**
		 * This user input takes place of a GUI drop down, so that we can keep the
		 * implementation simple and focus on the implementation and usage of Factory
		 * pattern
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Which server do you want to resolve?");
		String serverName=input.nextLine();
	}
}
