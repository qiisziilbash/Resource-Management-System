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

public class JobCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression userJobs;
	
	public JobCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		userJobs = new CollectionExpression("ORM_UserJobs", this);
	}
	
	public JobCriteria(PersistentSession session) {
		this(session.createCriteria(Job.class));
	}
	
	public JobCriteria() throws PersistentException {
		this(OODPersistentManager.instance().getSession());
	}
	
	public businesslogic.accounting.job.UserJobCriteria createUserJobsCriteria() {
		return new businesslogic.accounting.job.UserJobCriteria(createCriteria("ORM_UserJobs"));
	}
	
	public Job uniqueJob() {
		return (Job) super.uniqueResult();
	}
	
	public Job[] listJob() {
		java.util.List list = super.list();
		return (Job[]) list.toArray(new Job[list.size()]);
	}
}

