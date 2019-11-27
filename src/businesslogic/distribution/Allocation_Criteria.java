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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMCriteria;
import org.orm.criteria.BooleanExpression;
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;

import orm.OODPersistentManager;

public class Allocation_Criteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final BooleanExpression allocated;
	public final CollectionExpression requirements;
	public final CollectionExpression resourceAllocations;
	
	public Allocation_Criteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		allocated = new BooleanExpression("allocated", this);
		requirements = new CollectionExpression("ORM_Requirements", this);
		resourceAllocations = new CollectionExpression("ORM_ResourceAllocations", this);
	}
	
	public Allocation_Criteria(PersistentSession session) {
		this(session.createCriteria(Allocation.class));
	}
	
	public Allocation_Criteria() throws PersistentException {
		this(OODPersistentManager.instance().getSession());
	}
	
	public businesslogic.distribution.requirement.RequirementCriteria createRequirementsCriteria() {
		return new businesslogic.distribution.requirement.RequirementCriteria(createCriteria("ORM_Requirements"));
	}
	
	public businesslogic.distribution.ResourceAllocationCriteria createResourceAllocationsCriteria() {
		return new businesslogic.distribution.ResourceAllocationCriteria(createCriteria("ORM_ResourceAllocations"));
	}
	
	public Allocation uniqueAllocation_() {
		return (Allocation) super.uniqueResult();
	}
	
	public Allocation[] listAllocation_() {
		java.util.List list = super.list();
		return (Allocation[]) list.toArray(new Allocation[list.size()]);
	}
}

