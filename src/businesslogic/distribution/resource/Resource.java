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
import businesslogic.distribution.ResourceAllocation;


public class Resource implements Serializable {
	public Resource() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_RESOURCE_RESOURCEALLOCATIONS) {
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
	
	private String uniqueIdentifier;
	
	private String name;
	
	private java.util.Set ORM_resourceAllocations = new java.util.HashSet();
	
	private int resourceState;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setUniqueIdentifier(String value) {
		this.uniqueIdentifier = value;
	}
	
	public String getUniqueIdentifier() {
		return uniqueIdentifier;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setORM_ResourceAllocations(java.util.Set value) {
		this.ORM_resourceAllocations = value;
	}
	
	public java.util.Set getORM_ResourceAllocations() {
		return ORM_resourceAllocations;
	}
	
	public final businesslogic.distribution.ResourceAllocationSetCollection resourceAllocations = new businesslogic.distribution.ResourceAllocationSetCollection(this, _ormAdapter, ORMConstants.KEY_RESOURCE_RESOURCEALLOCATIONS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public int getResourceState() {
		return this.resourceState;
	}
	
	public void setResourceState(int resourceState) {
		this.resourceState = resourceState;
	}

	public void addResourceAllocation(ResourceAllocation resourceAllocation) {
		getORM_ResourceAllocations().add(resourceAllocation);
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
