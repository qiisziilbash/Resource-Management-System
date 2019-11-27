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

public class SubsystemCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression resourceStateId;
	public final AssociationExpression resourceState;
	public final IntegerExpression uniqueIdentifier;
	public final StringExpression name;
	public final CollectionExpression resourceAllocations;
	public final IntegerExpression projectManagementId;
	public final AssociationExpression projectManagement;
	public final CollectionExpression allocation_s;
	public final CollectionExpression requirements;
	public final CollectionExpression modules;
	
	public SubsystemCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		resourceStateId = new IntegerExpression("resourceState.ID", this);
		resourceState = new AssociationExpression("resourceState", this);
		uniqueIdentifier = new IntegerExpression("uniqueIdentifier", this);
		name = new StringExpression("name", this);
		resourceAllocations = new CollectionExpression("ORM_ResourceAllocations", this);
		projectManagementId = new IntegerExpression("projectManagement.ID", this);
		projectManagement = new AssociationExpression("projectManagement", this);
		allocation_s = new CollectionExpression("ORM_Allocation_s", this);
		requirements = new CollectionExpression("ORM_Requirements", this);
		modules = new CollectionExpression("ORM_Modules", this);
	}
	
	public SubsystemCriteria(PersistentSession session) {
		this(session.createCriteria(Subsystem.class));
	}
	
	public SubsystemCriteria() throws PersistentException {
		this(OODPersistentManager.instance().getSession());
	}
	
	public businesslogic.distribution.resource.ModuleCriteria createModulesCriteria() {
		return new businesslogic.distribution.resource.ModuleCriteria(createCriteria("ORM_Modules"));
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
	
	public Subsystem uniqueSubsystem() {
		return (Subsystem) super.uniqueResult();
	}
	
	public Subsystem[] listSubsystem() {
		java.util.List list = super.list();
		return (Subsystem[]) list.toArray(new Subsystem[list.size()]);
	}
}

