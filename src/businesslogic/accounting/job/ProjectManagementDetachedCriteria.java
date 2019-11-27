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

public class ProjectManagementDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression userJobs;
	public final CollectionExpression informationResources;
	public final CollectionExpression specialties;
	public final CollectionExpression requirements;
	public final CollectionExpression notification;
	
	public ProjectManagementDetachedCriteria() {
		super(businesslogic.accounting.job.ProjectManagement.class, businesslogic.accounting.job.ProjectManagementCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userJobs = new CollectionExpression("ORM_UserJobs", this.getDetachedCriteria());
		informationResources = new CollectionExpression("ORM_InformationResources", this.getDetachedCriteria());
		specialties = new CollectionExpression("ORM_Specialties", this.getDetachedCriteria());
		requirements = new CollectionExpression("ORM_Requirements", this.getDetachedCriteria());
		notification = new CollectionExpression("ORM_Notification", this.getDetachedCriteria());
	}
	
	public ProjectManagementDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, businesslogic.accounting.job.ProjectManagementCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userJobs = new CollectionExpression("ORM_UserJobs", this.getDetachedCriteria());
		informationResources = new CollectionExpression("ORM_InformationResources", this.getDetachedCriteria());
		specialties = new CollectionExpression("ORM_Specialties", this.getDetachedCriteria());
		requirements = new CollectionExpression("ORM_Requirements", this.getDetachedCriteria());
		notification = new CollectionExpression("ORM_Notification", this.getDetachedCriteria());
	}
	
	public businesslogic.distribution.resource.InformationResourceDetachedCriteria createInformationResourcesCriteria() {
		return new businesslogic.distribution.resource.InformationResourceDetachedCriteria(createCriteria("ORM_InformationResources"));
	}
	
	public businesslogic.accounting.job.SpecialtyDetachedCriteria createSpecialtiesCriteria() {
		return new businesslogic.accounting.job.SpecialtyDetachedCriteria(createCriteria("ORM_Specialties"));
	}
	
	public businesslogic.distribution.requirement.RequirementDetachedCriteria createRequirementsCriteria() {
		return new businesslogic.distribution.requirement.RequirementDetachedCriteria(createCriteria("ORM_Requirements"));
	}
	
	public businesslogic.utility.NotificationDetachedCriteria createNotificationCriteria() {
		return new businesslogic.utility.NotificationDetachedCriteria(createCriteria("ORM_Notification"));
	}
	
	public businesslogic.accounting.job.UserJobDetachedCriteria createUserJobsCriteria() {
		return new businesslogic.accounting.job.UserJobDetachedCriteria(createCriteria("ORM_UserJobs"));
	}
	
	public ProjectManagement uniqueProjectManagement(PersistentSession session) {
		return (ProjectManagement) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ProjectManagement[] listProjectManagement(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ProjectManagement[]) list.toArray(new ProjectManagement[list.size()]);
	}
}

