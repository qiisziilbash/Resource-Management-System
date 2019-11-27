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
package businesslogic.distribution;

import java.io.Serializable;
import java.util.Set;

import orm.ORMConstants;
import businesslogic.distribution.requirement.Requirement;
import businesslogic.distribution.resource.Resource;

public class Allocation implements Serializable {
	public Allocation() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ALLOCATION__REQUIREMENTS) {
			return ORM_requirements;
		}
		else if (key == ORMConstants.KEY_ALLOCATION__RESOURCEALLOCATIONS) {
			return ORM_resourceAllocations;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private boolean allocated;
	
	private java.util.Set ORM_requirements = new java.util.HashSet();
	
	private java.util.Set ORM_resourceAllocations = new java.util.HashSet();
	
	private Resource[] resources;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setAllocated(boolean value) {
		this.allocated = value;
	}
	
	public boolean getAllocated() {
		return allocated;
	}
	
	private void setORM_Requirements(java.util.Set value) {
		this.ORM_requirements = value;
	}
	
	private java.util.Set getORM_Requirements() {
		return ORM_requirements;
	}
	
	public final businesslogic.distribution.requirement.RequirementSetCollection requirements = new businesslogic.distribution.requirement.RequirementSetCollection(this, _ormAdapter, ORMConstants.KEY_ALLOCATION__REQUIREMENTS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_ResourceAllocations(java.util.Set value) {
		this.ORM_resourceAllocations = value;
	}
	
	public java.util.Set getORM_ResourceAllocations() {
		return ORM_resourceAllocations;
	}
	
	public final businesslogic.distribution.ResourceAllocationSetCollection resourceAllocations = new businesslogic.distribution.ResourceAllocationSetCollection(this, _ormAdapter, ORMConstants.KEY_ALLOCATION__RESOURCEALLOCATIONS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public businesslogic.distribution.requirement.Requirement getRequirement() {
		if(getORM_Requirements().isEmpty()) {
			return null;
		}
		return ((Set<Requirement>)getORM_Requirements()).toArray(new Requirement[getORM_Requirements().size()])[0];
	}
	
	public void setRequirement(businesslogic.distribution.requirement.Requirement requirement) {
		getORM_Requirements().clear();
		getORM_Requirements().add(requirement);
	}
	
	public Resource[] getResources() {
		return this.resources;
	}
	
	public void setResources(Resource[] resources) {
		this.resources = resources;
	}
	
	public void addResources(Resource[] resources) {
		for (Resource resource : resources) {
			ResourceAllocation ra = new ResourceAllocation();
			resource.addResourceAllocation(ra);
			getORM_ResourceAllocations().add(ra);
		}

	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
