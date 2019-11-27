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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMCriteria;
import org.orm.criteria.AssociationExpression;
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

import orm.OODPersistentManager;

public class ModuleCriteria extends AbstractORMCriteria {
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
	
	public ModuleCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		resourceStateId = new IntegerExpression("resourceState.ID", this);
		resourceState = new AssociationExpression("resourceState", this);
		uniqueIdentifier = new IntegerExpression("uniqueIdentifier", this);
		name = new StringExpression("name", this);
		startDate = new StringExpression("startDate", this);
		endDate = new StringExpression("endDate", this);
		resourceAllocations = new CollectionExpression("ORM_ResourceAllocations", this);
		projectManagementId = new IntegerExpression("projectManagement.ID", this);
		projectManagement = new AssociationExpression("projectManagement", this);
		allocation_s = new CollectionExpression("ORM_Allocation_s", this);
		requirements = new CollectionExpression("ORM_Requirements", this);
		dateId = new IntegerExpression("date.ID", this);
		date = new AssociationExpression("date", this);
		description = new StringExpression("description", this);
		linesOfCode = new IntegerExpression("linesOfCode", this);
		specialties = new CollectionExpression("ORM_Specialties", this);
		moduleChanges = new CollectionExpression("ORM_ModuleChanges", this);
	}
	
	public ModuleCriteria(PersistentSession session) {
		this(session.createCriteria(Module.class));
	}
	
	public ModuleCriteria() throws PersistentException {
		this(OODPersistentManager.instance().getSession());
	}
	
	public businesslogic.accounting.job.SpecialtyCriteria createSpecialtiesCriteria() {
		return new businesslogic.accounting.job.SpecialtyCriteria(createCriteria("ORM_Specialties"));
	}
	
	public businesslogic.distribution.resource.ModuleChangeCriteria createModuleChangesCriteria() {
		return new businesslogic.distribution.resource.ModuleChangeCriteria(createCriteria("ORM_ModuleChanges"));
	}
	
	public businesslogic.accounting.job.ProjectManagementCriteria createProjectManagementCriteria() {
		return new businesslogic.accounting.job.ProjectManagementCriteria(createCriteria("projectManagement"));
	}
	
	public businesslogic.distribution.Allocation_Criteria createAllocation_sCriteria() {
		return new businesslogic.distribution.Allocation_Criteria(createCriteria("ORM_Allocation_s"));
	}
	
	public businesslogic.distribution.requirement.RequirementCriteria createRequirementsCriteria() {
		return new businesslogic.distribution.requirement.RequirementCriteria(createCriteria("ORM_Requirements"));
	}
	
	public businesslogic.distribution.ResourceAllocationCriteria createResourceAllocationsCriteria() {
		return new businesslogic.distribution.ResourceAllocationCriteria(createCriteria("ORM_ResourceAllocations"));
	}
	
	public Module uniqueModule() {
		return (Module) super.uniqueResult();
	}
	
	public Module[] listModule() {
		java.util.List list = super.list();
		return (Module[]) list.toArray(new Module[list.size()]);
	}
}

