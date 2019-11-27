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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import orm.ORMConstants;
import businesslogic.distribution.requirement.Requirement;

public class System extends businesslogic.distribution.resource.InformationResource {
	public System() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SYSTEM_SUBSYSTEMS) {
			return ORM_subsystems;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String technologies;
	
	private java.util.Set ORM_subsystems = new java.util.HashSet();
	
	public void setTechnologies(String value) {
		this.technologies = value;
	}
	
	public String getTechnologies() {
		return technologies;
	}
	
	public void setORM_Subsystems(java.util.Set value) {
		this.ORM_subsystems = value;
	}
	
	public java.util.Set getORM_Subsystems() {
		return ORM_subsystems;
	}
	
	public final businesslogic.distribution.resource.SubsystemSetCollection subsystems = new businesslogic.distribution.resource.SubsystemSetCollection(this, _ormAdapter, ORMConstants.KEY_SYSTEM_SUBSYSTEMS, ORMConstants.KEY_MUL_ONE_TO_MANY);

	public void addSubsystem(Subsystem subsystem) {
		getORM_Subsystems().add(subsystem);
	}

	public Requirement[] getRequirementsRecursive() {
		ArrayList<Requirement> requirements = new ArrayList<>();
		requirements.addAll(Arrays.asList(getRequirements()));

		for(Subsystem subsystem: (Set<Subsystem>) getORM_Subsystems()) {
			requirements.addAll(Arrays.asList(subsystem.getRequirementsRecursive()));
		}

		return requirements.toArray(new Requirement[requirements.size()]);
	}
	
	public String toString() {
		return super.toString();
	}
	
}
