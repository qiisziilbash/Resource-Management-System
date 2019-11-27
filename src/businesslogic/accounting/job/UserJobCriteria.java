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

public class UserJobCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	
	public UserJobCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
	}
	
	public UserJobCriteria(PersistentSession session) {
		this(session.createCriteria(UserJob.class));
	}
	
	public UserJobCriteria() throws PersistentException {
		this(OODPersistentManager.instance().getSession());
	}
	
	public UserJob uniqueUserJob() {
		return (UserJob) super.uniqueResult();
	}
	
	public UserJob[] listUserJob() {
		java.util.List list = super.list();
		return (UserJob[]) list.toArray(new UserJob[list.size()]);
	}
}

