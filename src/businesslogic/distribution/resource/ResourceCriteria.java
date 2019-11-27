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
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

import orm.OODPersistentManager;

public class ResourceCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression resourceState;
	public final StringExpression uniqueIdentifier;
	public final StringExpression name;
	public final CollectionExpression resourceAllocations;
	
	public ResourceCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		resourceState = new IntegerExpression("resourceState", this);
		uniqueIdentifier = new StringExpression("uniqueIdentifier", this);
		name = new StringExpression("name", this);
		resourceAllocations = new CollectionExpression("ORM_ResourceAllocations", this);
	}
	
	public ResourceCriteria(PersistentSession session) {
		this(session.createCriteria(Resource.class));
	}
	
	public ResourceCriteria() throws PersistentException {
		this(OODPersistentManager.instance().getSession());
	}

	public businesslogic.distribution.ResourceAllocationCriteria createResourceAllocationsCriteria() {
		return new businesslogic.distribution.ResourceAllocationCriteria(createCriteria("ORM_ResourceAllocations"));
	}
	
	public Resource uniqueResource() {
		return (Resource) super.uniqueResult();
	}
	
	public Resource[] listResource() {
		java.util.List list = super.list();
		return (Resource[]) list.toArray(new Resource[list.size()]);
	}
}

