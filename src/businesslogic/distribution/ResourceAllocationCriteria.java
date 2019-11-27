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
import org.orm.criteria.IntegerExpression;

import orm.OODPersistentManager;

public class ResourceAllocationCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	
	public ResourceAllocationCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
	}
	
	public ResourceAllocationCriteria(PersistentSession session) {
		this(session.createCriteria(ResourceAllocation.class));
	}
	
	public ResourceAllocationCriteria() throws PersistentException {
		this(OODPersistentManager.instance().getSession());
	}
	
	public ResourceAllocation uniqueResourceAllocation() {
		return (ResourceAllocation) super.uniqueResult();
	}
	
	public ResourceAllocation[] listResourceAllocation() {
		java.util.List list = super.list();
		return (ResourceAllocation[]) list.toArray(new ResourceAllocation[list.size()]);
	}
}

