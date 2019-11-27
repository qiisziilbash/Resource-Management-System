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

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMDetachedCriteria;
import org.orm.criteria.AssociationExpression;
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

public class ModuleDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression resourceStateId;
	public final AssociationExpression resourceState;
	public final IntegerExpression uniqueIdentifier;
	public final StringExpression name;
	public final StringExpression startDate;
	public final StringExpression endDate;
	public final CollectionExpression resourceAllocations;
	public final IntegerExpression projectManagementId;
	public final AssociationExpression projectManagement;
	public final CollectionExpression allocation_s;
	public final CollectionExpression requirements;
	public final IntegerExpression dateId;
	public final AssociationExpression date;
	public final StringExpression description;
	public final IntegerExpression linesOfCode;
	public final CollectionExpression specialties;
	public final CollectionExpression moduleChanges;
	
	public ModuleDetachedCriteria() {
		super(businesslogic.distribution.resource.Module.class, businesslogic.distribution.resource.ModuleCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		resourceStateId = new IntegerExpression("resourceState.ID", this.getDetachedCriteria());
		resourceState = new AssociationExpression("resourceState", this.getDetachedCriteria());
		uniqueIdentifier = new IntegerExpression("uniqueIdentifier", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		startDate = new StringExpression("startDate", this.getDetachedCriteria());
		endDate = new StringExpression("endDate", this.getDetachedCriteria());
		resourceAllocations = new CollectionExpression("ORM_ResourceAllocations", this.getDetachedCriteria());
		projectManagementId = new IntegerExpression("projectManagement.ID", this.getDetachedCriteria());
		projectManagement = new AssociationExpression("projectManagement", this.getDetachedCriteria());
		allocation_s = new CollectionExpression("ORM_Allocation_s", this.getDetachedCriteria());
		requirements = new CollectionExpression("ORM_Requirements", this.getDetachedCriteria());
		dateId = new IntegerExpression("date.ID", this.getDetachedCriteria());
		date = new AssociationExpression("date", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		linesOfCode = new IntegerExpression("linesOfCode", this.getDetachedCriteria());
		specialties = new CollectionExpression("ORM_Specialties", this.getDetachedCriteria());
		moduleChanges = new CollectionExpression("ORM_ModuleChanges", this.getDetachedCriteria());
	}
	
	public ModuleDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, businesslogic.distribution.resource.ModuleCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		resourceStateId = new IntegerExpression("resourceState.ID", this.getDetachedCriteria());
		resourceState = new AssociationExpression("resourceState", this.getDetachedCriteria());
		uniqueIdentifier = new IntegerExpression("uniqueIdentifier", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		startDate = new StringExpression("startDate", this.getDetachedCriteria());
		endDate = new StringExpression("endDate", this.getDetachedCriteria());
		resourceAllocations = new CollectionExpression("ORM_ResourceAllocations", this.getDetachedCriteria());
		projectManagementId = new IntegerExpression("projectManagement.ID", this.getDetachedCriteria());
		projectManagement = new AssociationExpression("projectManagement", this.getDetachedCriteria());
		allocation_s = new CollectionExpression("ORM_Allocation_s", this.getDetachedCriteria());
		requirements = new CollectionExpression("ORM_Requirements", this.getDetachedCriteria());
		dateId = new IntegerExpression("date.ID", this.getDetachedCriteria());
		date = new AssociationExpression("date", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		linesOfCode = new IntegerExpression("linesOfCode", this.getDetachedCriteria());
		specialties = new CollectionExpression("ORM_Specialties", this.getDetachedCriteria());
		moduleChanges = new CollectionExpression("ORM_ModuleChanges", this.getDetachedCriteria());
	}
	
	public businesslogic.accounting.job.SpecialtyDetachedCriteria createSpecialtiesCriteria() {
		return new businesslogic.accounting.job.SpecialtyDetachedCriteria(createCriteria("ORM_Specialties"));
	}
	
	public businesslogic.distribution.resource.ModuleChangeDetachedCriteria createModuleChangesCriteria() {
		return new businesslogic.distribution.resource.ModuleChangeDetachedCriteria(createCriteria("ORM_ModuleChanges"));
	}
	
	public businesslogic.accounting.job.ProjectManagementDetachedCriteria createProjectManagementCriteria() {
		return new businesslogic.accounting.job.ProjectManagementDetachedCriteria(createCriteria("projectManagement"));
	}
	
	public businesslogic.distribution.Allocation_DetachedCriteria createAllocation_sCriteria() {
		return new businesslogic.distribution.Allocation_DetachedCriteria(createCriteria("ORM_Allocation_s"));
	}
	
	public businesslogic.distribution.requirement.RequirementDetachedCriteria createRequirementsCriteria() {
		return new businesslogic.distribution.requirement.RequirementDetachedCriteria(createCriteria("ORM_Requirements"));
	}
	
	public businesslogic.distribution.ResourceAllocationDetachedCriteria createResourceAllocationsCriteria() {
		return new businesslogic.distribution.ResourceAllocationDetachedCriteria(createCriteria("ORM_ResourceAllocations"));
	}
	
	public Module uniqueModule(PersistentSession session) {
		return (Module) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Module[] listModule(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Module[]) list.toArray(new Module[list.size()]);
	}
}

