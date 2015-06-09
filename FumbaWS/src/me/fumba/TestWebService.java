package me.fumba;

import java.util.Calendar;

/**
 * 
 * @author Fumba Chibaka
 *
 */
public class TestWebService {

	/**
	 * Provides the current date in format dow mon dd hh:mm:ss zzz yyyy
	 * 
	 * @return
	 */
	public String retrieveCurrentDate(String username) {
		Calendar calendar = Calendar.getInstance();
		return "Hallo, " + username + " Date: " + calendar.getTime().toString();
	}
}
