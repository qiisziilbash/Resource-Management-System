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
package businesslogic.support;

import java.io.Serializable;

public class SystemConfiguration implements Serializable {
	public SystemConfiguration() {

	}



	private int ID;
	
	private int backupPreiodDays;

	private BackupFormat backupFormat;

	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setBackupPreiodDays(int value) {
		this.backupPreiodDays = value;
	}
	
	public int getBackupPreiodDays() {
		return backupPreiodDays;
	}

	public businesslogic.utility.Date getDate() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}

	public void setDate(businesslogic.utility.Date date) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}

	public BackupFormat getBackupFormat() {
		return  backupFormat;
	}

	public void setBackupFormat(BackupFormat backupFormat) {
		this.backupFormat = backupFormat;
	}

	public String toString() {
		return backupFormat.toString();
	}
	
}
