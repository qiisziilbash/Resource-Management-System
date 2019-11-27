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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import orm.ORMConstants;
import businesslogic.accounting.PermissionTitles;

public class Admin extends businesslogic.accounting.user.User {
	public Admin() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ADMIN_SYSTEMCONFIGURATIONS) {
			return ORM_systemConfigurations;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_systemConfigurations = new java.util.HashSet();
	
	public void setORM_SystemConfigurations(java.util.Set value) {
		this.ORM_systemConfigurations = value;
	}
	
	public java.util.Set getORM_SystemConfigurations() {
		return ORM_systemConfigurations;
	}
	
	public final businesslogic.support.SystemConfigurationSetCollection systemConfigurations = new businesslogic.support.SystemConfigurationSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMIN_SYSTEMCONFIGURATIONS, ORMConstants.KEY_MUL_ONE_TO_MANY);

	@Override
	public PermissionTitles[] getPermissions() {
		Set<PermissionTitles> permissions = new HashSet<>();
		permissions.addAll(Arrays.asList(super.getPermissions()));

		permissions.add(PermissionTitles.SYSTEM_CONFIGURATION);

		return permissions.toArray(new PermissionTitles[permissions.size()]);
	}
	
	public String toString() {
		return super.toString();
	}
	
}
