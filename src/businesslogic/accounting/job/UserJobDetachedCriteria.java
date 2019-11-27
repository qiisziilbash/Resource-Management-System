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

public class UserJobDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	
	public UserJobDetachedCriteria() {
		super(businesslogic.accounting.job.UserJob.class, businesslogic.accounting.job.UserJobCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public UserJobDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, businesslogic.accounting.job.UserJobCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public UserJob uniqueUserJob(PersistentSession session) {
		return (UserJob) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public UserJob[] listUserJob(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (UserJob[]) list.toArray(new UserJob[list.size()]);
	}
}

