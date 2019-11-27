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
import java.util.Set;

import orm.ORMConstants;
import businesslogic.distribution.Allocation;
import businesslogic.distribution.requirement.Requirement;

public class InformationResource extends businesslogic.distribution.resource.Resource implements Serializable {
	public InformationResource() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_INFORMATIONRESOURCE_ALLOCATION_S) {
			return ORM_allocation_s;
		}
		else if (key == ORMConstants.KEY_INFORMATIONRESOURCE_REQUIREMENTS) {
			return ORM_requirements;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_INFORMATIONRESOURCE_PROJECTMANAGEMENT) {
			this.projectManagement = (businesslogic.accounting.job.ProjectManagement) owner;
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
	
	private businesslogic.accounting.job.ProjectManagement projectManagement;
	
	private java.util.Set ORM_allocation_s = new java.util.HashSet();
	
	private java.util.Set ORM_requirements = new java.util.HashSet();
	
	public void setProjectManagement(businesslogic.accounting.job.ProjectManagement value) {
		if (projectManagement != null) {
			projectManagement.informationResources.remove(this);
		}
		if (value != null) {
			value.informationResources.add(this);
		}
	}
	
	public businesslogic.accounting.job.ProjectManagement getProjectManagement() {
		return projectManagement;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_ProjectManagement(businesslogic.accounting.job.ProjectManagement value) {
		this.projectManagement = value;
	}
	
	private businesslogic.accounting.job.ProjectManagement getORM_ProjectManagement() {
		return projectManagement;
	}
	
	private void setORM_Allocation_s(java.util.Set value) {
		this.ORM_allocation_s = value;
	}
	
	private java.util.Set getORM_Allocation_s() {
		return ORM_allocation_s;
	}
	
	public final businesslogic.distribution.Allocation_SetCollection allocation_s = new businesslogic.distribution.Allocation_SetCollection(this, _ormAdapter, ORMConstants.KEY_INFORMATIONRESOURCE_ALLOCATION_S, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Requirements(java.util.Set value) {
		this.ORM_requirements = value;
	}
	
	private java.util.Set getORM_Requirements() {
		return ORM_requirements;
	}
	
	public final businesslogic.distribution.requirement.RequirementSetCollection requirements = new businesslogic.distribution.requirement.RequirementSetCollection(this, _ormAdapter, ORMConstants.KEY_INFORMATIONRESOURCE_REQUIREMENTS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public Requirement[] getRequirements() {
		Set<Requirement> requirementSet = getORM_Requirements();
		return requirementSet.toArray(new Requirement[requirementSet.size()]);
	}

	public Requirement[] getRequirementsRecursive() {
		return null;
	}
	
	public void addRequirement(businesslogic.distribution.requirement.Requirement requirement) {
		getORM_Requirements().add(requirement);
	}

	public void removeRequirement(businesslogic.distribution.requirement.Requirement requirement) {
		getORM_Requirements().remove(requirement);
	}
	
	public void addAllocation(businesslogic.distribution.Allocation  allocation) {
		getORM_Allocation_s().add(allocation);
	}
	
	public businesslogic.distribution.Allocation [] getAllocations() {
		Set<Allocation> allocationSet = getORM_Allocation_s();
		return allocationSet.toArray(new Allocation[allocationSet.size()]);
	}
	
	public String toString() {
		return super.toString();
	}
	
}
