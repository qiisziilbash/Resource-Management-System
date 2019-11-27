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
package businesslogic.accounting.job;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMCriteria;
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;

import orm.OODPersistentManager;

public class ResourceManagementCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression userJobs;
	public final CollectionExpression resources;
	public final CollectionExpression allocation_s;
	
	public ResourceManagementCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		userJobs = new CollectionExpression("ORM_UserJobs", this);
		resources = new CollectionExpression("ORM_Resources", this);
		allocation_s = new CollectionExpression("ORM_Allocation_s", this);
	}
	
	public ResourceManagementCriteria(PersistentSession session) {
		this(session.createCriteria(ResourceManagement.class));
	}
	
	public ResourceManagementCriteria() throws PersistentException {
		this(OODPersistentManager.instance().getSession());
	}
	
	public businesslogic.distribution.resource.ResourceCriteria createResourcesCriteria() {
		return new businesslogic.distribution.resource.ResourceCriteria(createCriteria("ORM_Resources"));
	}
	
	public businesslogic.distribution.Allocation_Criteria createAllocation_sCriteria() {
		return new businesslogic.distribution.Allocation_Criteria(createCriteria("ORM_Allocation_s"));
	}
	
	public businesslogic.accounting.job.UserJobCriteria createUserJobsCriteria() {
		return new businesslogic.accounting.job.UserJobCriteria(createCriteria("ORM_UserJobs"));
	}
	
	public ResourceManagement uniqueResourceManagement() {
		return (ResourceManagement) super.uniqueResult();
	}
	
	public ResourceManagement[] listResourceManagement() {
		java.util.List list = super.list();
		return (ResourceManagement[]) list.toArray(new ResourceManagement[list.size()]);
	}
}

