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

public class ProjectManagementCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression userJobs;
	public final CollectionExpression informationResources;
	public final CollectionExpression specialties;
	public final CollectionExpression requirements;
	public final CollectionExpression notification;
	
	public ProjectManagementCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		userJobs = new CollectionExpression("ORM_UserJobs", this);
		informationResources = new CollectionExpression("ORM_InformationResources", this);
		specialties = new CollectionExpression("ORM_Specialties", this);
		requirements = new CollectionExpression("ORM_Requirements", this);
		notification = new CollectionExpression("ORM_Notification", this);
	}
	
	public ProjectManagementCriteria(PersistentSession session) {
		this(session.createCriteria(ProjectManagement.class));
	}
	
	public ProjectManagementCriteria() throws PersistentException {
		this(OODPersistentManager.instance().getSession());
	}
	
	public businesslogic.distribution.resource.InformationResourceCriteria createInformationResourcesCriteria() {
		return new businesslogic.distribution.resource.InformationResourceCriteria(createCriteria("ORM_InformationResources"));
	}
	
	public businesslogic.accounting.job.SpecialtyCriteria createSpecialtiesCriteria() {
		return new businesslogic.accounting.job.SpecialtyCriteria(createCriteria("ORM_Specialties"));
	}
	
	public businesslogic.distribution.requirement.RequirementCriteria createRequirementsCriteria() {
		return new businesslogic.distribution.requirement.RequirementCriteria(createCriteria("ORM_Requirements"));
	}
	
	public businesslogic.utility.NotificationCriteria createNotificationCriteria() {
		return new businesslogic.utility.NotificationCriteria(createCriteria("ORM_Notification"));
	}
	
	public businesslogic.accounting.job.UserJobCriteria createUserJobsCriteria() {
		return new businesslogic.accounting.job.UserJobCriteria(createCriteria("ORM_UserJobs"));
	}
	
	public ProjectManagement uniqueProjectManagement() {
		return (ProjectManagement) super.uniqueResult();
	}
	
	public ProjectManagement[] listProjectManagement() {
		java.util.List list = super.list();
		return (ProjectManagement[]) list.toArray(new ProjectManagement[list.size()]);
	}
}

