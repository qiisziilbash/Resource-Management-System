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
package businesslogic.accounting.user;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import orm.ORMConstants;
import businesslogic.accounting.PermissionTitles;
import businesslogic.accounting.job.Job;
import businesslogic.utility.Tree;

public class User implements Serializable {
	public User() {
		approved = false;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USER_EMAILS) {
			return ORM_emails;
		}
		else if (key == ORMConstants.KEY_USER_USERJOBS) {
			return ORM_userJobs;
		}
		else if (key == ORMConstants.KEY_USER_USERPERMISSIONS) {
			return ORM_userPermissions;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USER_USER) {
			this.user = (businesslogic.accounting.user.User) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private businesslogic.accounting.user.User user;
	
	private String username;
	
	private String password;
	
	private String email;
	
	private boolean approved;
	
	private java.util.Set ORM_emails = new java.util.HashSet();
	
	private java.util.Set ORM_userJobs = new java.util.HashSet();

	private java.util.Set ORM_userPermissions = new java.util.HashSet();

	private java.util.Set<Job> jobs = new HashSet<>();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setApproved(boolean value) {
		this.approved = value;
	}
	
	public boolean getApproved() {
		return approved;
	}
	
	private void setUser(businesslogic.accounting.user.User value) {
		this.user = value;
	}
	
	private businesslogic.accounting.user.User getUser() {
		return user;
	}
	
	private void setORM_Emails(java.util.Set value) {
		this.ORM_emails = value;
	}
	
	public java.util.Set getORM_Emails() {
		return ORM_emails;
	}
	
	
	public void setORM_UserJobs(java.util.Set value) {
		this.ORM_userJobs = value;
	}
	
	public java.util.Set getORM_UserJobs() {
		return ORM_userJobs;
	}

	public final businesslogic.accounting.job.UserJobSetCollection userJobs = new businesslogic.accounting.job.UserJobSetCollection(this, _ormAdapter, ORMConstants.KEY_USER_USERJOBS, ORMConstants.KEY_MUL_ONE_TO_MANY);


	public void setORM_UserPermissions(java.util.Set value) {
		this.ORM_userPermissions = value;
	}

	public java.util.Set getORM_UserPermissions() {
		return ORM_userPermissions;
	}

	
	public businesslogic.accounting.job.Job[] getJobs() {
		return jobs.toArray(new Job[jobs.size()]);
	}

	public void setJobs(Set jobs) {
		this.jobs = jobs;
	}

	public void addJob(businesslogic.accounting.job.Job job) {
		jobs.add(job);
	}
	
	public void deleteJob(businesslogic.accounting.job.Job job) {
		getORM_UserJobs().remove(job);
	}
	
	public void approve() {
		setApproved(true);
	}
	
	public businesslogic.accounting.user.User getCreatorUser() {
		return getUser();
	}

	public void setCreatorUser(businesslogic.accounting.user.User creatorUser) {
		setUser(creatorUser);
	}

	public Tree<String> getJobInfo() {
		Tree<String> info = new Tree<>("User");
		for(Job job: getJobs()) {
			info.addChild(job.getInfo());
		}
		return info;
	}

	public PermissionTitles[] getPermissions() {
		Set<PermissionTitles> permissions = new HashSet<>();
		for(Job job: getJobs()) {
			permissions.addAll(Arrays.asList(job.getPermissions()));
		}
		return permissions.toArray(new PermissionTitles[permissions.size()]);
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
