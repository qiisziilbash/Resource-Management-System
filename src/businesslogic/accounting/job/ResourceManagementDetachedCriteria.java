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

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMDetachedCriteria;
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;

public class ResourceManagementDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression userJobs;
	public final CollectionExpression resources;
	public final CollectionExpression allocation_s;
	
	public ResourceManagementDetachedCriteria() {
		super(ResourceManagement.class, ResourceManagementCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userJobs = new CollectionExpression("ORM_UserJobs", this.getDetachedCriteria());
		resources = new CollectionExpression("ORM_Resources", this.getDetachedCriteria());
		allocation_s = new CollectionExpression("ORM_Allocation_s", this.getDetachedCriteria());
	}
	
	public ResourceManagementDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ResourceManagementCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userJobs = new CollectionExpression("ORM_UserJobs", this.getDetachedCriteria());
		resources = new CollectionExpression("ORM_Resources", this.getDetachedCriteria());
		allocation_s = new CollectionExpression("ORM_Allocation_s", this.getDetachedCriteria());
	}
	
	public businesslogic.distribution.resource.ResourceDetachedCriteria createResourcesCriteria() {
		return new businesslogic.distribution.resource.ResourceDetachedCriteria(createCriteria("ORM_Resources"));
	}
	
	public businesslogic.distribution.Allocation_DetachedCriteria createAllocation_sCriteria() {
		return new businesslogic.distribution.Allocation_DetachedCriteria(createCriteria("ORM_Allocation_s"));
	}
	
	public businesslogic.accounting.job.UserJobDetachedCriteria createUserJobsCriteria() {
		return new businesslogic.accounting.job.UserJobDetachedCriteria(createCriteria("ORM_UserJobs"));
	}
	
	public ResourceManagement uniqueResourceManagement(PersistentSession session) {
		return (ResourceManagement) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ResourceManagement[] listResourceManagement(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ResourceManagement[]) list.toArray(new ResourceManagement[list.size()]);
	}
}

