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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import orm.ORMConstants;
import businesslogic.distribution.requirement.Requirement;

public class Project extends businesslogic.distribution.resource.InformationResource implements Serializable {
	public Project() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PROJECT_SYSTEMS) {
			return ORM_systems;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int budget;
	
	public java.util.Set ORM_systems = new java.util.HashSet();
	
	public void setBudget(int value) {
		this.budget = value;
	}
	
	public int getBudget() {
		return budget;
	}
	
	private void setORM_Systems(java.util.Set value) {
		this.ORM_systems = value;
	}
	
	public java.util.Set getORM_Systems() {
		return ORM_systems;
	}
	
	public final businesslogic.distribution.resource.SystemSetCollection systems = new businesslogic.distribution.resource.SystemSetCollection(this, _ormAdapter, ORMConstants.KEY_PROJECT_SYSTEMS, ORMConstants.KEY_MUL_ONE_TO_MANY);

	public void addSystem(System system) {
		getORM_Systems().add(system);
	}

	public Requirement[] getRequirementsRecursive() {
		ArrayList<Requirement> requirements = new ArrayList<>();
		requirements.addAll(Arrays.asList(getRequirements()));

		for(System system: (Set<System>) getORM_Systems()) {
			requirements.addAll(Arrays.asList(system.getRequirementsRecursive()));
		}

		return requirements.toArray(new Requirement[requirements.size()]);
	}
	
	public String toString() {
		return super.toString();
	}
	
}
