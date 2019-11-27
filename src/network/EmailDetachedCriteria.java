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
package network;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMDetachedCriteria;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

public class EmailDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression content;
	public final StringExpression address;
	
	public EmailDetachedCriteria() {
		super(network.Email.class, network.EmailCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		address = new StringExpression("address", this.getDetachedCriteria());
	}
	
	public EmailDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, network.EmailCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		address = new StringExpression("address", this.getDetachedCriteria());
	}
	
	public Email uniqueEmail(PersistentSession session) {
		return (Email) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Email[] listEmail(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Email[]) list.toArray(new Email[list.size()]);
	}
}

