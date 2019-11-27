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
package businesslogic.support;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMDetachedCriteria;
import org.orm.criteria.IntegerExpression;

public class SystemConfigurationDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression backupPreiodDays;
	
	public SystemConfigurationDetachedCriteria() {
		super(businesslogic.support.SystemConfiguration.class, businesslogic.support.SystemConfigurationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		backupPreiodDays = new IntegerExpression("backupPreiodDays", this.getDetachedCriteria());
	}
	
	public SystemConfigurationDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, businesslogic.support.SystemConfigurationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		backupPreiodDays = new IntegerExpression("backupPreiodDays", this.getDetachedCriteria());
	}
	
	public SystemConfiguration uniqueSystemConfiguration(PersistentSession session) {
		return (SystemConfiguration) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SystemConfiguration[] listSystemConfiguration(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SystemConfiguration[]) list.toArray(new SystemConfiguration[list.size()]);
	}
}

