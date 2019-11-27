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
import org.orm.criteria.StringExpression;

import orm.OODPersistentManager;

public class SpecialtyCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression title;
	public final IntegerExpression proficiencyLevel;
	
	public SpecialtyCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		title = new StringExpression("title", this);
		proficiencyLevel = new IntegerExpression("proficiencyLevel", this);
	}
	
	public SpecialtyCriteria(PersistentSession session) {
		this(session.createCriteria(Specialty.class));
	}
	
	public SpecialtyCriteria() throws PersistentException {
		this(OODPersistentManager.instance().getSession());
	}
	
	public Specialty uniqueSpecialty() {
		return (Specialty) super.uniqueResult();
	}
	
	public Specialty[] listSpecialty() {
		java.util.List list = super.list();
		return (Specialty[]) list.toArray(new Specialty[list.size()]);
	}
}

