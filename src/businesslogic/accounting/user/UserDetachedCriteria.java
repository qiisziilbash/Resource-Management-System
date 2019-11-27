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

public class UserDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression userId;
	public final AssociationExpression user;
	public final StringExpression username;
	public final StringExpression password;
	public final StringExpression email;
	public final BooleanExpression approved;
	public final CollectionExpression emails;
	public final CollectionExpression userJobs;
	public final CollectionExpression userPermissions;
	
	public UserDetachedCriteria() {
		super(businesslogic.accounting.user.User.class, businesslogic.accounting.user.UserCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userId = new IntegerExpression("user.ID", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		approved = new BooleanExpression("approved", this.getDetachedCriteria());
		emails = new CollectionExpression("ORM_Emails", this.getDetachedCriteria());
		userJobs = new CollectionExpression("ORM_UserJobs", this.getDetachedCriteria());
		userPermissions = new CollectionExpression("ORM_UserPermissions", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, businesslogic.accounting.user.UserCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userId = new IntegerExpression("user.ID", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		approved = new BooleanExpression("approved", this.getDetachedCriteria());
		emails = new CollectionExpression("ORM_Emails", this.getDetachedCriteria());
		userJobs = new CollectionExpression("ORM_UserJobs", this.getDetachedCriteria());
		userPermissions = new CollectionExpression("ORM_UserPermissions", this.getDetachedCriteria());
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
	
	public businesslogic.accounting.job.UserJobDetachedCriteria createUserPermissionsCriteria() {
		return new businesslogic.accounting.job.UserJobDetachedCriteria(createCriteria("ORM_UserPermissions"));
	}
	
	public User uniqueUser(PersistentSession session) {
		return (User) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public User[] listUser(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (User[]) list.toArray(new User[list.size()]);
	}
}

