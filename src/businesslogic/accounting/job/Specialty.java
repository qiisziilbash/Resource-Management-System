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
package businesslogic.accounting.job;

import java.io.Serializable;

import businesslogic.utility.Tree;

public class Specialty implements Serializable {
	public Specialty() {
	}
	
	private int ID;
	
	private String title;
	
	private int proficiencyLevel;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setProficiencyLevel(int value) {
		this.proficiencyLevel = value;
	}
	
	public int getProficiencyLevel() {
		return proficiencyLevel;
	}
	
	public Tree<String> getInfo() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
