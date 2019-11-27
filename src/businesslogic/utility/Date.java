/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package businesslogic.utility;

import java.io.Serializable;
import java.util.Calendar;

public class Date implements Serializable {
	public Date() {
	}

	public Date(java.util.Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		setYear(cal.get(Calendar.YEAR));
		setMonth(cal.get(Calendar.MONTH));
		setDay(cal.get(Calendar.DATE));
		setHour(cal.get(Calendar.HOUR));
		setMinute(cal.get(Calendar.MINUTE));
		setSecond(cal.get(Calendar.SECOND));
	}
	
	private int ID;
	
	private int second;
	
	private int minute;
	
	private int hour;
	
	private int day;
	
	private int month;
	
	private int year;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setSecond(int value) {
		this.second = value;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setMinute(int value) {
		this.minute = value;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setHour(int value) {
		this.hour = value;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setDay(int value) {
		this.day = value;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setMonth(int value) {
		this.month = value;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setYear(int value) {
		this.year = value;
	}
	
	public int getYear() {
		return year;
	}
	
	public String toString() {
		return String.format("%02d", getDay()) + "/" + String.format("%02d", getMonth()) + "/" + String.format("%02d", getYear());
	}
	
}
