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
package businesslogic.distribution.requirement;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMCriteria;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

import orm.OODPersistentManager;

public class RequirementCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression requirementPriority;
	public final StringExpression resourceName;
	public final StringExpression resourceType;
	public final StringExpression startDate;
	public final StringExpression endDate;
	public final IntegerExpression quantity;
	
	public RequirementCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		requirementPriority = new IntegerExpression("requirementPriority", this);
		resourceName = new StringExpression("resourceName", this);
		resourceType = new StringExpression("resourceType", this);
		startDate = new StringExpression("startDate", this);
		endDate = new StringExpression("endDate", this);
		quantity = new IntegerExpression("quantity", this);
	}
	
	public RequirementCriteria(PersistentSession session) {
		this(session.createCriteria(Requirement.class));
	}
	
	public RequirementCriteria() throws PersistentException {
		this(OODPersistentManager.instance().getSession());
	}
	
	public Requirement uniqueRequirement() {
		return (Requirement) super.uniqueResult();
	}
	
	public Requirement[] listRequirement() {
		java.util.List list = super.list();
		return (Requirement[]) list.toArray(new Requirement[list.size()]);
	}
}

