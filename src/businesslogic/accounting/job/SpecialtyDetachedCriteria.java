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
import org.orm.criteria.StringExpression;

public class SpecialtyDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression title;
	public final IntegerExpression proficiencyLevel;
	
	public SpecialtyDetachedCriteria() {
		super(businesslogic.accounting.job.Specialty.class, businesslogic.accounting.job.SpecialtyCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		proficiencyLevel = new IntegerExpression("proficiencyLevel", this.getDetachedCriteria());
	}
	
	public SpecialtyDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, businesslogic.accounting.job.SpecialtyCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		proficiencyLevel = new IntegerExpression("proficiencyLevel", this.getDetachedCriteria());
	}
	
	public Specialty uniqueSpecialty(PersistentSession session) {
		return (Specialty) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Specialty[] listSpecialty(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Specialty[]) list.toArray(new Specialty[list.size()]);
	}
}

