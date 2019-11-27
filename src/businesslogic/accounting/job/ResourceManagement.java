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

import java.util.HashSet;
import java.util.Set;

import orm.ORMConstants;
import businesslogic.accounting.PermissionTitles;
import businesslogic.distribution.Allocation;

public class ResourceManagement extends businesslogic.accounting.job.Job {
	public ResourceManagement() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_RESOURCEMANAGEMENT_RESOURCES) {
			return ORM_resources;
		}
		else if (key == ORMConstants.KEY_RESOURCEMANAGEMENT_ALLOCATION_S) {
			return ORM_allocation_s;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_resources = new java.util.HashSet();
	
	private java.util.Set ORM_allocation_s = new java.util.HashSet();
	
	private void setORM_Resources(java.util.Set value) {
		this.ORM_resources = value;
	}
	
	private java.util.Set getORM_Resources() {
		return ORM_resources;
	}
	
	public final businesslogic.distribution.resource.ResourceSetCollection resources = new businesslogic.distribution.resource.ResourceSetCollection(this, _ormAdapter, ORMConstants.KEY_RESOURCEMANAGEMENT_RESOURCES, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Allocation_s(java.util.Set value) {
		this.ORM_allocation_s = value;
	}
	
	private java.util.Set getORM_Allocation_s() {
		return ORM_allocation_s;
	}
	
	public final businesslogic.distribution.Allocation_SetCollection allocation_s = new businesslogic.distribution.Allocation_SetCollection(this, _ormAdapter, ORMConstants.KEY_RESOURCEMANAGEMENT_ALLOCATION_S, ORMConstants.KEY_MUL_ONE_TO_MANY);

	public void addAllocation(Allocation allocation) {
		getORM_Allocation_s().add(allocation);
	}

	@Override
	public PermissionTitles[] getPermissions() {
		Set<PermissionTitles> permissions = new HashSet<>();
		permissions.add(PermissionTitles.RESOURCE_ALLOCATION_REGISTRATION);
		permissions.add(PermissionTitles.NEW_RESOURCE_REGISTRATION);
		permissions.add(PermissionTitles.RESOURCES_REPORT);
		permissions.add(PermissionTitles.RESOURCE_REQUIREMENTS_REPORT);
		permissions.add(PermissionTitles.RESOURCE_ALLOCATION_FLOW_REPORT);
		permissions.add(PermissionTitles.ESSENTIAL_RESOURCE_ALLOCATION_PREDICTION);
		return permissions.toArray(new PermissionTitles[permissions.size()]);
	}
	
	public String toString() {
		return super.toString();
	}
	
}
