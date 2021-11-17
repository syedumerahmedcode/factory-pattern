package com.umer.servermanagement.usage;

import java.util.Scanner;

import com.umer.servermanagement.ServerFactory;
import com.umer.servermanagement.servertypes.IServer;

public class ServerManagementTool {

	public static void main(String[] args) throws Exception {
		/**
		 * This user input takes place of a GUI drop down, so that we can keep the
		 * implementation simple and focus on the implementation and usage of Factory
		 * pattern
		 * 
		 * Helps us in determining what type of server does the user wants to resolve?
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Which server do you want to resolve?");
		String serverName = input.nextLine();
		
		/**
		 * We do not specify explicitly i the code which server to initialize. This is taken care of by the factory itself.
		 */
		IServer server=ServerFactory.getServer(serverName);
		server.resolve();
	}
}
