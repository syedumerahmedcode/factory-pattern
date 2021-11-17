package com.umer.servermanagement;

import com.umer.servermanagement.servertypes.FTPServer;
import com.umer.servermanagement.servertypes.IServer;
import com.umer.servermanagement.servertypes.MailServer;

/**
 * This class will pump out different types of server objects.
 * @author umer
 *
 */
public class ServerFactory {
	
	public static IServer getServer(String serverType) throws Exception{
		// This contains the logic of which server object to invoke.
		switch(serverType) {
		case "mail":
			return new MailServer();
		case "ftp":
			return new FTPServer();
		default:
			throw new Exception("Invalid server type");
		}
	}
}
