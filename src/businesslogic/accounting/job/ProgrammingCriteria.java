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

public class ProgrammingCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression userJobs;
	public final CollectionExpression specialties;
	public final CollectionExpression modules;
	public final CollectionExpression moduleChanges;
	
	public ProgrammingCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		userJobs = new CollectionExpression("ORM_UserJobs", this);
		specialties = new CollectionExpression("ORM_Specialties", this);
		modules = new CollectionExpression("ORM_Modules", this);
		moduleChanges = new CollectionExpression("ORM_ModuleChanges", this);
	}
	
	public ProgrammingCriteria(PersistentSession session) {
		this(session.createCriteria(Programming.class));
	}
	
	public ProgrammingCriteria() throws PersistentException {
		this(OODPersistentManager.instance().getSession());
	}
	
	public businesslogic.accounting.job.SpecialtyCriteria createSpecialtiesCriteria() {
		return new businesslogic.accounting.job.SpecialtyCriteria(createCriteria("ORM_Specialties"));
	}
	
	public businesslogic.distribution.resource.ModuleCriteria createModulesCriteria() {
		return new businesslogic.distribution.resource.ModuleCriteria(createCriteria("ORM_Modules"));
	}
	
	public businesslogic.distribution.resource.ModuleChangeCriteria createModuleChangesCriteria() {
		return new businesslogic.distribution.resource.ModuleChangeCriteria(createCriteria("ORM_ModuleChanges"));
	}
	
	public businesslogic.accounting.job.UserJobCriteria createUserJobsCriteria() {
		return new businesslogic.accounting.job.UserJobCriteria(createCriteria("ORM_UserJobs"));
	}
	
	public Programming uniqueProgramming() {
		return (Programming) super.uniqueResult();
	}
	
	public Programming[] listProgramming() {
		java.util.List list = super.list();
		return (Programming[]) list.toArray(new Programming[list.size()]);
	}
}

