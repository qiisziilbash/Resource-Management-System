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
package businesslogic.accounting.user;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMDetachedCriteria;
import org.orm.criteria.AssociationExpression;
import org.orm.criteria.BooleanExpression;
import org.orm.criteria.CollectionExpression;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

public class AdminDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression userId;
	public final AssociationExpression user;
	public final StringExpression username;
	public final StringExpression password;
	public final StringExpression email;
	public final BooleanExpression approved;
	public final CollectionExpression emails;
	public final CollectionExpression userJobs;
	public final CollectionExpression systemConfigurations;
	
	public AdminDetachedCriteria() {
		super(businesslogic.accounting.user.Admin.class, businesslogic.accounting.user.AdminCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userId = new IntegerExpression("user.ID", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		approved = new BooleanExpression("approved", this.getDetachedCriteria());
		emails = new CollectionExpression("ORM_Emails", this.getDetachedCriteria());
		userJobs = new CollectionExpression("ORM_UserJobs", this.getDetachedCriteria());
		systemConfigurations = new CollectionExpression("ORM_SystemConfigurations", this.getDetachedCriteria());
	}
	
	public AdminDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, businesslogic.accounting.user.AdminCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userId = new IntegerExpression("user.ID", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		approved = new BooleanExpression("approved", this.getDetachedCriteria());
		emails = new CollectionExpression("ORM_Emails", this.getDetachedCriteria());
		userJobs = new CollectionExpression("ORM_UserJobs", this.getDetachedCriteria());
		systemConfigurations = new CollectionExpression("ORM_SystemConfigurations", this.getDetachedCriteria());
	}
	
	public businesslogic.support.SystemConfigurationDetachedCriteria createSystemConfigurationsCriteria() {
		return new businesslogic.support.SystemConfigurationDetachedCriteria(createCriteria("ORM_SystemConfigurations"));
	}
	
	public businesslogic.accounting.user.UserDetachedCriteria createUserCriteria() {
		return new businesslogic.accounting.user.UserDetachedCriteria(createCriteria("user"));
	}
	
	public network.EmailDetachedCriteria createEmailsCriteria() {
		return new network.EmailDetachedCriteria(createCriteria("ORM_Emails"));
	}
	
	public businesslogic.accounting.job.UserJobDetachedCriteria createUserJobsCriteria() {
		return new businesslogic.accounting.job.UserJobDetachedCriteria(createCriteria("ORM_UserJobs"));
	}
	
	public Admin uniqueAdmin(PersistentSession session) {
		return (Admin) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Admin[] listAdmin(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Admin[]) list.toArray(new Admin[list.size()]);
	}
}

