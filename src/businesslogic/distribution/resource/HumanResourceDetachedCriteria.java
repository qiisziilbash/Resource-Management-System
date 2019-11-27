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

public class HumanResourceDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression resourceStateId;
	public final AssociationExpression resourceState;
	public final IntegerExpression uniqueIdentifier;
	public final StringExpression name;
	public final CollectionExpression resourceAllocations;
	public final IntegerExpression programmingId;
	public final AssociationExpression programming;
	
	public HumanResourceDetachedCriteria() {
		super(businesslogic.distribution.resource.HumanResource.class, businesslogic.distribution.resource.HumanResourceCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		resourceStateId = new IntegerExpression("resourceState.ID", this.getDetachedCriteria());
		resourceState = new AssociationExpression("resourceState", this.getDetachedCriteria());
		uniqueIdentifier = new IntegerExpression("uniqueIdentifier", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		resourceAllocations = new CollectionExpression("ORM_ResourceAllocations", this.getDetachedCriteria());
		programmingId = new IntegerExpression("programming.ID", this.getDetachedCriteria());
		programming = new AssociationExpression("programming", this.getDetachedCriteria());
	}
	
	public HumanResourceDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, businesslogic.distribution.resource.HumanResourceCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		resourceStateId = new IntegerExpression("resourceState.ID", this.getDetachedCriteria());
		resourceState = new AssociationExpression("resourceState", this.getDetachedCriteria());
		uniqueIdentifier = new IntegerExpression("uniqueIdentifier", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		resourceAllocations = new CollectionExpression("ORM_ResourceAllocations", this.getDetachedCriteria());
		programmingId = new IntegerExpression("programming.ID", this.getDetachedCriteria());
		programming = new AssociationExpression("programming", this.getDetachedCriteria());
	}
	
	public businesslogic.accounting.job.ProgrammingDetachedCriteria createProgrammingCriteria() {
		return new businesslogic.accounting.job.ProgrammingDetachedCriteria(createCriteria("programming"));
	}
	
	public businesslogic.distribution.ResourceAllocationDetachedCriteria createResourceAllocationsCriteria() {
		return new businesslogic.distribution.ResourceAllocationDetachedCriteria(createCriteria("ORM_ResourceAllocations"));
	}
	
	public HumanResource uniqueHumanResource(PersistentSession session) {
		return (HumanResource) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public HumanResource[] listHumanResource(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (HumanResource[]) list.toArray(new HumanResource[list.size()]);
	}
}

