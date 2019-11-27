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
package businesslogic.distribution;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMDetachedCriteria;
import org.orm.criteria.BooleanExpression;
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;

public class Allocation_DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final BooleanExpression allocated;
	public final CollectionExpression requirements;
	public final CollectionExpression resourceAllocations;
	
	public Allocation_DetachedCriteria() {
		super(Allocation.class, businesslogic.distribution.Allocation_Criteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		allocated = new BooleanExpression("allocated", this.getDetachedCriteria());
		requirements = new CollectionExpression("ORM_Requirements", this.getDetachedCriteria());
		resourceAllocations = new CollectionExpression("ORM_ResourceAllocations", this.getDetachedCriteria());
	}
	
	public Allocation_DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, businesslogic.distribution.Allocation_Criteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		allocated = new BooleanExpression("allocated", this.getDetachedCriteria());
		requirements = new CollectionExpression("ORM_Requirements", this.getDetachedCriteria());
		resourceAllocations = new CollectionExpression("ORM_ResourceAllocations", this.getDetachedCriteria());
	}
	
	public businesslogic.distribution.requirement.RequirementDetachedCriteria createRequirementsCriteria() {
		return new businesslogic.distribution.requirement.RequirementDetachedCriteria(createCriteria("ORM_Requirements"));
	}
	
	public businesslogic.distribution.ResourceAllocationDetachedCriteria createResourceAllocationsCriteria() {
		return new businesslogic.distribution.ResourceAllocationDetachedCriteria(createCriteria("ORM_ResourceAllocations"));
	}
	
	public Allocation uniqueAllocation_(PersistentSession session) {
		return (Allocation) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Allocation[] listAllocation_(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Allocation[]) list.toArray(new Allocation[list.size()]);
	}
}

