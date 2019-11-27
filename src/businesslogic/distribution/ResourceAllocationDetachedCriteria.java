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
import org.orm.criteria.IntegerExpression;

public class ResourceAllocationDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	
	public ResourceAllocationDetachedCriteria() {
		super(businesslogic.distribution.ResourceAllocation.class, businesslogic.distribution.ResourceAllocationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public ResourceAllocationDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, businesslogic.distribution.ResourceAllocationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public ResourceAllocation uniqueResourceAllocation(PersistentSession session) {
		return (ResourceAllocation) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ResourceAllocation[] listResourceAllocation(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ResourceAllocation[]) list.toArray(new ResourceAllocation[list.size()]);
	}
}

