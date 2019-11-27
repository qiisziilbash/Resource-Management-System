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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMCriteria;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;

import orm.OODPersistentManager;

public class EmailCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression content;
	public final StringExpression address;
	
	public EmailCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		content = new StringExpression("content", this);
		address = new StringExpression("address", this);
	}
	
	public EmailCriteria(PersistentSession session) {
		this(session.createCriteria(Email.class));
	}
	
	public EmailCriteria() throws PersistentException {
		this(OODPersistentManager.instance().getSession());
	}
	
	public Email uniqueEmail() {
		return (Email) super.uniqueResult();
	}
	
	public Email[] listEmail() {
		java.util.List list = super.list();
		return (Email[]) list.toArray(new Email[list.size()]);
	}
}

