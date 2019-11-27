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
package businesslogic.distribution.resource;

import java.io.Serializable;

import orm.ORMConstants;

public class ModuleChange implements Serializable {
	public ModuleChange() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MODULECHANGE_DATE) {
			this.date = (businesslogic.utility.Date) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private businesslogic.utility.Date date;
	
	private String description;

	private String startDate;

	private String endDate;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDate(businesslogic.utility.Date value) {
		this.date = value;
	}
	
	public businesslogic.utility.Date getDate() {
		return date;
	}
	
	public ModuleChange(String description, businesslogic.utility.Date startDate, businesslogic.utility.Date endDate) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String toString() {
		return String.valueOf(getID());
	}
	
}
