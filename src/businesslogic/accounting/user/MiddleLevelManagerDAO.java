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

public class MiddleLevelManagerDAO {
	public static MiddleLevelManager loadMiddleLevelManagerByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadMiddleLevelManagerByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager getMiddleLevelManagerByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getMiddleLevelManagerByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager loadMiddleLevelManagerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadMiddleLevelManagerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager getMiddleLevelManagerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getMiddleLevelManagerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager loadMiddleLevelManagerByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (MiddleLevelManager) session.load(businesslogic.accounting.user.MiddleLevelManager.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager getMiddleLevelManagerByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (MiddleLevelManager) session.get(businesslogic.accounting.user.MiddleLevelManager.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager loadMiddleLevelManagerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MiddleLevelManager) session.load(businesslogic.accounting.user.MiddleLevelManager.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager getMiddleLevelManagerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MiddleLevelManager) session.get(businesslogic.accounting.user.MiddleLevelManager.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMiddleLevelManager(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryMiddleLevelManager(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMiddleLevelManager(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryMiddleLevelManager(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager[] listMiddleLevelManagerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listMiddleLevelManagerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager[] listMiddleLevelManagerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listMiddleLevelManagerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMiddleLevelManager(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.user.MiddleLevelManager as MiddleLevelManager");
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
	
	public static List queryMiddleLevelManager(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.user.MiddleLevelManager as MiddleLevelManager");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MiddleLevelManager", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager[] listMiddleLevelManagerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMiddleLevelManager(session, condition, orderBy);
			return (MiddleLevelManager[]) list.toArray(new MiddleLevelManager[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager[] listMiddleLevelManagerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMiddleLevelManager(session, condition, orderBy, lockMode);
			return (MiddleLevelManager[]) list.toArray(new MiddleLevelManager[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager loadMiddleLevelManagerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadMiddleLevelManagerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager loadMiddleLevelManagerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadMiddleLevelManagerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager loadMiddleLevelManagerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		MiddleLevelManager[] middleLevelManagers = listMiddleLevelManagerByQuery(session, condition, orderBy);
		if (middleLevelManagers != null && middleLevelManagers.length > 0)
			return middleLevelManagers[0];
		else
			return null;
	}
	
	public static MiddleLevelManager loadMiddleLevelManagerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		MiddleLevelManager[] middleLevelManagers = listMiddleLevelManagerByQuery(session, condition, orderBy, lockMode);
		if (middleLevelManagers != null && middleLevelManagers.length > 0)
			return middleLevelManagers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMiddleLevelManagerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateMiddleLevelManagerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMiddleLevelManagerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateMiddleLevelManagerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMiddleLevelManagerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.user.MiddleLevelManager as MiddleLevelManager");
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
	
	public static java.util.Iterator iterateMiddleLevelManagerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.user.MiddleLevelManager as MiddleLevelManager");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MiddleLevelManager", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager createMiddleLevelManager() {
		return new businesslogic.accounting.user.MiddleLevelManager();
	}
	
	public static boolean save(businesslogic.accounting.user.MiddleLevelManager middleLevelManager) throws PersistentException {
		try {
			OODPersistentManager.instance().saveObject(middleLevelManager);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(businesslogic.accounting.user.MiddleLevelManager middleLevelManager) throws PersistentException {
		try {
			OODPersistentManager.instance().deleteObject(middleLevelManager);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(businesslogic.accounting.user.MiddleLevelManager middleLevelManager) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().refresh(middleLevelManager);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(businesslogic.accounting.user.MiddleLevelManager middleLevelManager) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().evict(middleLevelManager);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MiddleLevelManager loadMiddleLevelManagerByCriteria(MiddleLevelManagerCriteria middleLevelManagerCriteria) {
		MiddleLevelManager[] middleLevelManagers = listMiddleLevelManagerByCriteria(middleLevelManagerCriteria);
		if(middleLevelManagers == null || middleLevelManagers.length == 0) {
			return null;
		}
		return middleLevelManagers[0];
	}
	
	public static MiddleLevelManager[] listMiddleLevelManagerByCriteria(MiddleLevelManagerCriteria middleLevelManagerCriteria) {
		return middleLevelManagerCriteria.listMiddleLevelManager();
	}
}
