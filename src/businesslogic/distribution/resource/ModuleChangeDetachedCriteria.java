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
package businesslogic.distribution.resource;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMDetachedCriteria;
import org.orm.criteria.AssociationExpression;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

public class ModuleChangeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression dateId;
	public final AssociationExpression date;
	public final StringExpression description;
	public final StringExpression startDate;
	public final StringExpression endDate;
	
	public ModuleChangeDetachedCriteria() {
		super(businesslogic.distribution.resource.ModuleChange.class, businesslogic.distribution.resource.ModuleChangeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dateId = new IntegerExpression("date.ID", this.getDetachedCriteria());
		date = new AssociationExpression("date", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		startDate = new StringExpression("startDate", this.getDetachedCriteria());
		endDate = new StringExpression("endDate", this.getDetachedCriteria());
	}
	
	public ModuleChangeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, businesslogic.distribution.resource.ModuleChangeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dateId = new IntegerExpression("date.ID", this.getDetachedCriteria());
		date = new AssociationExpression("date", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		startDate = new StringExpression("startDate", this.getDetachedCriteria());
		endDate = new StringExpression("endDate", this.getDetachedCriteria());
	}
	
	public ModuleChange uniqueModuleChange(PersistentSession session) {
		return (ModuleChange) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ModuleChange[] listModuleChange(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ModuleChange[]) list.toArray(new ModuleChange[list.size()]);
	}
}

