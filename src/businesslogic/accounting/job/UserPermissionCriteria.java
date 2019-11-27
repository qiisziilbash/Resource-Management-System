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
import org.orm.criteria.IntegerExpression;

import orm.OODPersistentManager;

public class UserPermissionCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;

	public UserPermissionCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
	}

	public UserPermissionCriteria(PersistentSession session) {
		this(session.createCriteria(UserPermission.class));
	}

	public UserPermissionCriteria() throws PersistentException {
		this(OODPersistentManager.instance().getSession());
	}
	
	public UserPermission uniqueUserPermission() {
		return (UserPermission) super.uniqueResult();
	}
	
	public UserPermission[] listUserPermission() {
		java.util.List list = super.list();
		return (UserPermission []) list.toArray(new UserPermission[list.size()]);
	}
}

