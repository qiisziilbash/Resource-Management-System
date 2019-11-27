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

public class SystemDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final StringExpression technologies;
	public final CollectionExpression subsystems;
	
	public SystemDetachedCriteria() {
		super(businesslogic.distribution.resource.System.class, businesslogic.distribution.resource.SystemCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		resourceStateId = new IntegerExpression("resourceState.ID", this.getDetachedCriteria());
		resourceState = new AssociationExpression("resourceState", this.getDetachedCriteria());
		uniqueIdentifier = new IntegerExpression("uniqueIdentifier", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		resourceAllocations = new CollectionExpression("ORM_ResourceAllocations", this.getDetachedCriteria());
		projectManagementId = new IntegerExpression("projectManagement.ID", this.getDetachedCriteria());
		projectManagement = new AssociationExpression("projectManagement", this.getDetachedCriteria());
		allocation_s = new CollectionExpression("ORM_Allocation_s", this.getDetachedCriteria());
		requirements = new CollectionExpression("ORM_Requirements", this.getDetachedCriteria());
		technologies = new StringExpression("technologies", this.getDetachedCriteria());
		subsystems = new CollectionExpression("ORM_Subsystems", this.getDetachedCriteria());
	}
	
	public SystemDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, businesslogic.distribution.resource.SystemCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		resourceStateId = new IntegerExpression("resourceState.ID", this.getDetachedCriteria());
		resourceState = new AssociationExpression("resourceState", this.getDetachedCriteria());
		uniqueIdentifier = new IntegerExpression("uniqueIdentifier", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		resourceAllocations = new CollectionExpression("ORM_ResourceAllocations", this.getDetachedCriteria());
		projectManagementId = new IntegerExpression("projectManagement.ID", this.getDetachedCriteria());
		projectManagement = new AssociationExpression("projectManagement", this.getDetachedCriteria());
		allocation_s = new CollectionExpression("ORM_Allocation_s", this.getDetachedCriteria());
		requirements = new CollectionExpression("ORM_Requirements", this.getDetachedCriteria());
		technologies = new StringExpression("technologies", this.getDetachedCriteria());
		subsystems = new CollectionExpression("ORM_Subsystems", this.getDetachedCriteria());
	}
	
	public businesslogic.distribution.resource.SubsystemDetachedCriteria createSubsystemsCriteria() {
		return new businesslogic.distribution.resource.SubsystemDetachedCriteria(createCriteria("ORM_Subsystems"));
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
	
	public System uniqueSystem(PersistentSession session) {
		return (System) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public System[] listSystem(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (System[]) list.toArray(new System[list.size()]);
	}
}

