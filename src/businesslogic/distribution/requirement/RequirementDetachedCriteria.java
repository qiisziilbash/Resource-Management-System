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

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMDetachedCriteria;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

public class RequirementDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression requirementPriority;
	public final StringExpression resourceName;
	public final StringExpression resourceType;
	public final StringExpression startDate;
	public final StringExpression endDate;
	public final IntegerExpression quantity;
	
	public RequirementDetachedCriteria() {
		super(businesslogic.distribution.requirement.Requirement.class, businesslogic.distribution.requirement.RequirementCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		requirementPriority = new IntegerExpression("requirementPriority", this.getDetachedCriteria());
		resourceName = new StringExpression("resourceName", this.getDetachedCriteria());
		resourceType = new StringExpression("resourceType", this.getDetachedCriteria());
		startDate = new StringExpression("startDate", this.getDetachedCriteria());
		endDate = new StringExpression("endDate", this.getDetachedCriteria());
		quantity = new IntegerExpression("quantity", this.getDetachedCriteria());
	}
	
	public RequirementDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, businesslogic.distribution.requirement.RequirementCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		requirementPriority = new IntegerExpression("requirementPriority", this.getDetachedCriteria());
		resourceName = new StringExpression("resourceName", this.getDetachedCriteria());
		resourceType = new StringExpression("resourceType", this.getDetachedCriteria());
		startDate = new StringExpression("startDate", this.getDetachedCriteria());
		endDate = new StringExpression("endDate", this.getDetachedCriteria());
		quantity = new IntegerExpression("quantity", this.getDetachedCriteria());
	}
	
	public Requirement uniqueRequirement(PersistentSession session) {
		return (Requirement) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Requirement[] listRequirement(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Requirement[]) list.toArray(new Requirement[list.size()]);
	}
}

