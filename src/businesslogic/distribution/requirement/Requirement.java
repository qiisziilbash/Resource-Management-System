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
package businesslogic.distribution.requirement;

import java.io.Serializable;

import businesslogic.accounting.job.ProjectManagement;
import businesslogic.distribution.resource.InformationResource;

public class Requirement implements Serializable {
	public Requirement() {
	}
	
	private int ID;
	
	private int requirementPriority;
	
	private String resourceName;
	
	private String resourceType;
	
	private int quantity;

	private String startDate;

	private String endDate;
	
	private ProjectManagement projectManagement;
	
	private InformationResource informationResource;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setResourceName(String value) {
		this.resourceName = value;
	}
	
	public String getResourceName() {
		return resourceName;
	}
	
	public void setResourceType(String value) {
		this.resourceType = value;
	}
	
	public String getResourceType() {
		return resourceType;
	}
	
	public void setQuantity(int value) {
		this.quantity = value;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public int getRequirementPriority() {
		return requirementPriority;
	}

	public void setRequirementPriority(int requirementPriority) {
		this.requirementPriority = requirementPriority;
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
	
	public void setProjectManager(ProjectManagement pm) {
		pm.addRequirement(this);
	}
	
	public void setProjectManagement(ProjectManagement projectManager) {
		this.projectManagement = projectManager;
	}
	

	public ProjectManagement getProjectManagement() {
		return this.projectManagement;
	}

	public void setInformationResource(InformationResource informationResource) {
		informationResource.addRequirement(this);
		this.informationResource = informationResource;
	}

	public InformationResource getInformationResource() {
		return this.informationResource;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
