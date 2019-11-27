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

public class HumanResourceCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression resourceStateId;
	public final AssociationExpression resourceState;
	public final IntegerExpression uniqueIdentifier;
	public final StringExpression name;
	public final CollectionExpression resourceAllocations;
	public final IntegerExpression programmingId;
	public final AssociationExpression programming;
	
	public HumanResourceCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		resourceStateId = new IntegerExpression("resourceState.ID", this);
		resourceState = new AssociationExpression("resourceState", this);
		uniqueIdentifier = new IntegerExpression("uniqueIdentifier", this);
		name = new StringExpression("name", this);
		resourceAllocations = new CollectionExpression("ORM_ResourceAllocations", this);
		programmingId = new IntegerExpression("programming.ID", this);
		programming = new AssociationExpression("programming", this);
	}
	
	public HumanResourceCriteria(PersistentSession session) {
		this(session.createCriteria(HumanResource.class));
	}
	
	public HumanResourceCriteria() throws PersistentException {
		this(OODPersistentManager.instance().getSession());
	}
	
	public businesslogic.accounting.job.ProgrammingCriteria createProgrammingCriteria() {
		return new businesslogic.accounting.job.ProgrammingCriteria(createCriteria("programming"));
	}
	
	public businesslogic.distribution.ResourceAllocationCriteria createResourceAllocationsCriteria() {
		return new businesslogic.distribution.ResourceAllocationCriteria(createCriteria("ORM_ResourceAllocations"));
	}
	
	public HumanResource uniqueHumanResource() {
		return (HumanResource) super.uniqueResult();
	}
	
	public HumanResource[] listHumanResource() {
		java.util.List list = super.list();
		return (HumanResource[]) list.toArray(new HumanResource[list.size()]);
	}
}

