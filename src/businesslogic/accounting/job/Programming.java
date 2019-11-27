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
import businesslogic.distribution.resource.Module;
import businesslogic.distribution.resource.ModuleChange;
import businesslogic.utility.Tree;

public class Programming extends businesslogic.accounting.job.Job {
	public Programming() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PROGRAMMING_SPECIALTIES) {
			return ORM_specialties;
		}
		else if (key == ORMConstants.KEY_PROGRAMMING_MODULES) {
			return ORM_modules;
		}
		else if (key == ORMConstants.KEY_PROGRAMMING_MODULECHANGES) {
			return ORM_moduleChanges;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_specialties = new java.util.HashSet();
	
	private java.util.Set ORM_modules = new java.util.HashSet();
	
	private java.util.Set ORM_moduleChanges = new java.util.HashSet();
	
	private void setORM_Specialties(java.util.Set value) {
		this.ORM_specialties = value;
	}
	
	public java.util.Set getORM_Specialties() {
		return ORM_specialties;
	}
	
	public final businesslogic.accounting.job.SpecialtySetCollection specialties = new businesslogic.accounting.job.SpecialtySetCollection(this, _ormAdapter, ORMConstants.KEY_PROGRAMMING_SPECIALTIES, ORMConstants.KEY_MUL_ONE_TO_MANY);

	public void setORM_Modules(java.util.Set value) {
		this.ORM_modules = value;
	}

	public java.util.Set getORM_Modules() {
		return ORM_modules;
	}
	
	public final businesslogic.distribution.resource.ModuleSetCollection modules = new businesslogic.distribution.resource.ModuleSetCollection(this, _ormAdapter, ORMConstants.KEY_PROGRAMMING_MODULES, ORMConstants.KEY_MUL_ONE_TO_MANY);

	public void setORM_ModuleChanges(java.util.Set value) {
		this.ORM_moduleChanges = value;
	}

	public java.util.Set getORM_ModuleChanges() {
		return ORM_moduleChanges;
	}
	
	public final businesslogic.distribution.resource.ModuleChangeSetCollection moduleChanges = new businesslogic.distribution.resource.ModuleChangeSetCollection(this, _ormAdapter, ORMConstants.KEY_PROGRAMMING_MODULECHANGES, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public Specialty[] getSpecialties() {
		Set<Specialty> castedSpecialities = getORM_Specialties();
		return castedSpecialities.toArray(new Specialty[castedSpecialities.size()]);
	}
	
	public void addSpecialty(Specialty specialty) {
		getORM_Specialties().add(specialty);
	}

	public void addModule(Module module) {
		getORM_Modules().add(module);
	}

	public Module[] getModules() {
		Set<Module> castedModules= getORM_Modules();
		return castedModules.toArray(new Module[castedModules.size()]);
	}

	public void addModuleChange(ModuleChange change) {
		getORM_ModuleChanges().add(change);
	}

	public ModuleChange[] getModuleChanges() {
		Set<ModuleChange> castedChanges = getORM_ModuleChanges();
		return castedChanges.toArray(new ModuleChange[castedChanges.size()]);
	}

	@Override
	public Tree<String> getInfo() {
		Tree<String> info = new Tree<>(JobType.Programming.getTitle());
		for(Specialty specialty: (Set<Specialty>) getORM_Specialties()) {
			info.addChild(new Tree<>(specialty.getTitle()));
		}
		return info;
	}

	@Override
	public PermissionTitles[] getPermissions() {
		Set<PermissionTitles> permissions = new HashSet<>();
		permissions.add(PermissionTitles.MODULE_CREATION);
		permissions.add(PermissionTitles.MODULE_MAINTAINE);
		return permissions.toArray(new PermissionTitles[permissions.size()]);
	}

	public String toString() {
		return super.toString();
	}
	
}
