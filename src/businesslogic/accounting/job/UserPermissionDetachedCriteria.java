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
import org.orm.criteria.IntegerExpression;

public class UserPermissionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;

	public UserPermissionDetachedCriteria() {
		super(UserPermission.class, UserPermissionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}

	public UserPermissionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, UserPermissionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public UserPermission uniqueUserPermission(PersistentSession session) {
		return (UserPermission) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public UserPermission[] listUserPermission(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (UserPermission[]) list.toArray(new UserPermission[list.size()]);
	}
}

