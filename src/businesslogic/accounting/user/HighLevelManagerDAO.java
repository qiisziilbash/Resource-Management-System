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
package businesslogic.accounting.user;

import java.util.List;

import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;

public class HighLevelManagerDAO {
	public static HighLevelManager loadHighLevelManagerByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadHighLevelManagerByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager getHighLevelManagerByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getHighLevelManagerByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager loadHighLevelManagerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadHighLevelManagerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager getHighLevelManagerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getHighLevelManagerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager loadHighLevelManagerByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (HighLevelManager) session.load(businesslogic.accounting.user.HighLevelManager.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager getHighLevelManagerByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (HighLevelManager) session.get(businesslogic.accounting.user.HighLevelManager.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager loadHighLevelManagerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (HighLevelManager) session.load(businesslogic.accounting.user.HighLevelManager.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager getHighLevelManagerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (HighLevelManager) session.get(businesslogic.accounting.user.HighLevelManager.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHighLevelManager(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryHighLevelManager(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHighLevelManager(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryHighLevelManager(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager[] listHighLevelManagerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listHighLevelManagerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager[] listHighLevelManagerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listHighLevelManagerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHighLevelManager(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.user.HighLevelManager as HighLevelManager");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHighLevelManager(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.user.HighLevelManager as HighLevelManager");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("HighLevelManager", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager[] listHighLevelManagerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHighLevelManager(session, condition, orderBy);
			return (HighLevelManager[]) list.toArray(new HighLevelManager[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager[] listHighLevelManagerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHighLevelManager(session, condition, orderBy, lockMode);
			return (HighLevelManager[]) list.toArray(new HighLevelManager[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager loadHighLevelManagerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadHighLevelManagerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager loadHighLevelManagerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadHighLevelManagerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager loadHighLevelManagerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		HighLevelManager[] highLevelManagers = listHighLevelManagerByQuery(session, condition, orderBy);
		if (highLevelManagers != null && highLevelManagers.length > 0)
			return highLevelManagers[0];
		else
			return null;
	}
	
	public static HighLevelManager loadHighLevelManagerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		HighLevelManager[] highLevelManagers = listHighLevelManagerByQuery(session, condition, orderBy, lockMode);
		if (highLevelManagers != null && highLevelManagers.length > 0)
			return highLevelManagers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHighLevelManagerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateHighLevelManagerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHighLevelManagerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateHighLevelManagerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHighLevelManagerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.user.HighLevelManager as HighLevelManager");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHighLevelManagerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.user.HighLevelManager as HighLevelManager");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("HighLevelManager", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager createHighLevelManager() {
		return new businesslogic.accounting.user.HighLevelManager();
	}
	
	public static boolean save(businesslogic.accounting.user.HighLevelManager highLevelManager) throws PersistentException {
		try {
			OODPersistentManager.instance().saveObject(highLevelManager);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(businesslogic.accounting.user.HighLevelManager highLevelManager) throws PersistentException {
		try {
			OODPersistentManager.instance().deleteObject(highLevelManager);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(businesslogic.accounting.user.HighLevelManager highLevelManager) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().refresh(highLevelManager);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(businesslogic.accounting.user.HighLevelManager highLevelManager) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().evict(highLevelManager);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HighLevelManager loadHighLevelManagerByCriteria(HighLevelManagerCriteria highLevelManagerCriteria) {
		HighLevelManager[] highLevelManagers = listHighLevelManagerByCriteria(highLevelManagerCriteria);
		if(highLevelManagers == null || highLevelManagers.length == 0) {
			return null;
		}
		return highLevelManagers[0];
	}
	
	public static HighLevelManager[] listHighLevelManagerByCriteria(HighLevelManagerCriteria highLevelManagerCriteria) {
		return highLevelManagerCriteria.listHighLevelManager();
	}
}
