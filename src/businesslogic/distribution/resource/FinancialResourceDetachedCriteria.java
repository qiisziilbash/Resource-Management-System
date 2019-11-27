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

public class FinancialResourceDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression resourceStateId;
	public final AssociationExpression resourceState;
	public final IntegerExpression uniqueIdentifier;
	public final StringExpression name;
	public final CollectionExpression resourceAllocations;
	public final IntegerExpression financialValue;
	
	public FinancialResourceDetachedCriteria() {
		super(businesslogic.distribution.resource.FinancialResource.class, businesslogic.distribution.resource.FinancialResourceCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		resourceStateId = new IntegerExpression("resourceState.ID", this.getDetachedCriteria());
		resourceState = new AssociationExpression("resourceState", this.getDetachedCriteria());
		uniqueIdentifier = new IntegerExpression("uniqueIdentifier", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		resourceAllocations = new CollectionExpression("ORM_ResourceAllocations", this.getDetachedCriteria());
		financialValue = new IntegerExpression("financialValue", this.getDetachedCriteria());
	}
	
	public FinancialResourceDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, businesslogic.distribution.resource.FinancialResourceCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		resourceStateId = new IntegerExpression("resourceState.ID", this.getDetachedCriteria());
		resourceState = new AssociationExpression("resourceState", this.getDetachedCriteria());
		uniqueIdentifier = new IntegerExpression("uniqueIdentifier", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		resourceAllocations = new CollectionExpression("ORM_ResourceAllocations", this.getDetachedCriteria());
		financialValue = new IntegerExpression("financialValue", this.getDetachedCriteria());
	}

	public businesslogic.distribution.ResourceAllocationDetachedCriteria createResourceAllocationsCriteria() {
		return new businesslogic.distribution.ResourceAllocationDetachedCriteria(createCriteria("ORM_ResourceAllocations"));
	}
	
	public FinancialResource uniqueFinancialResource(PersistentSession session) {
		return (FinancialResource) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public FinancialResource[] listFinancialResource(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (FinancialResource[]) list.toArray(new FinancialResource[list.size()]);
	}
}

