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

public class ProgrammingDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression userJobs;
	public final CollectionExpression specialties;
	public final CollectionExpression modules;
	public final CollectionExpression moduleChanges;
	
	public ProgrammingDetachedCriteria() {
		super(businesslogic.accounting.job.Programming.class, businesslogic.accounting.job.ProgrammingCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userJobs = new CollectionExpression("ORM_UserJobs", this.getDetachedCriteria());
		specialties = new CollectionExpression("ORM_Specialties", this.getDetachedCriteria());
		modules = new CollectionExpression("ORM_Modules", this.getDetachedCriteria());
		moduleChanges = new CollectionExpression("ORM_ModuleChanges", this.getDetachedCriteria());
	}
	
	public ProgrammingDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, businesslogic.accounting.job.ProgrammingCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userJobs = new CollectionExpression("ORM_UserJobs", this.getDetachedCriteria());
		specialties = new CollectionExpression("ORM_Specialties", this.getDetachedCriteria());
		modules = new CollectionExpression("ORM_Modules", this.getDetachedCriteria());
		moduleChanges = new CollectionExpression("ORM_ModuleChanges", this.getDetachedCriteria());
	}
	
	public businesslogic.accounting.job.SpecialtyDetachedCriteria createSpecialtiesCriteria() {
		return new businesslogic.accounting.job.SpecialtyDetachedCriteria(createCriteria("ORM_Specialties"));
	}
	
	public businesslogic.distribution.resource.ModuleDetachedCriteria createModulesCriteria() {
		return new businesslogic.distribution.resource.ModuleDetachedCriteria(createCriteria("ORM_Modules"));
	}
	
	public businesslogic.distribution.resource.ModuleChangeDetachedCriteria createModuleChangesCriteria() {
		return new businesslogic.distribution.resource.ModuleChangeDetachedCriteria(createCriteria("ORM_ModuleChanges"));
	}
	
	public businesslogic.accounting.job.UserJobDetachedCriteria createUserJobsCriteria() {
		return new businesslogic.accounting.job.UserJobDetachedCriteria(createCriteria("ORM_UserJobs"));
	}
	
	public Programming uniqueProgramming(PersistentSession session) {
		return (Programming) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Programming[] listProgramming(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Programming[]) list.toArray(new Programming[list.size()]);
	}
}

