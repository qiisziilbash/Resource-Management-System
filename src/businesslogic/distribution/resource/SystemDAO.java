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

import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;

public class SystemDAO {
	public static System loadSystemByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadSystemByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System getSystemByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getSystemByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System loadSystemByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadSystemByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System getSystemByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getSystemByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System loadSystemByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (System) session.load(businesslogic.distribution.resource.System.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System getSystemByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (System) session.get(businesslogic.distribution.resource.System.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System loadSystemByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (System) session.load(businesslogic.distribution.resource.System.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System getSystemByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (System) session.get(businesslogic.distribution.resource.System.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySystem(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return querySystem(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySystem(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return querySystem(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System[] listSystemByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listSystemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System[] listSystemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listSystemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySystem(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.System as System");
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
	
	public static List querySystem(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.System as System");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("System", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System[] listSystemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySystem(session, condition, orderBy);
			return (System[]) list.toArray(new System[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System[] listSystemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySystem(session, condition, orderBy, lockMode);
			return (System[]) list.toArray(new System[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System loadSystemByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadSystemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System loadSystemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadSystemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System loadSystemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		System[] systems = listSystemByQuery(session, condition, orderBy);
		if (systems != null && systems.length > 0)
			return systems[0];
		else
			return null;
	}
	
	public static System loadSystemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		System[] systems = listSystemByQuery(session, condition, orderBy, lockMode);
		if (systems != null && systems.length > 0)
			return systems[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSystemByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateSystemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSystemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateSystemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSystemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.System as System");
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
	
	public static java.util.Iterator iterateSystemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.System as System");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("System", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System createSystem() {
		return new businesslogic.distribution.resource.System();
	}
	
	public static boolean save(businesslogic.distribution.resource.System system) throws PersistentException {
		try {
			OODPersistentManager.instance().saveObject(system);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(businesslogic.distribution.resource.System system) throws PersistentException {
		try {
			OODPersistentManager.instance().deleteObject(system);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(businesslogic.distribution.resource.System system)throws PersistentException {
		try {
			if (system.getProjectManagement() != null) {
				system.getProjectManagement().informationResources.remove(system);
			}
			
			return delete(system);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(businesslogic.distribution.resource.System system, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (system.getProjectManagement() != null) {
				system.getProjectManagement().informationResources.remove(system);
			}
			
			try {
				session.delete(system);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(businesslogic.distribution.resource.System system) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().refresh(system);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(businesslogic.distribution.resource.System system) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().evict(system);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static System loadSystemByCriteria(SystemCriteria systemCriteria) {
		System[] systems = listSystemByCriteria(systemCriteria);
		if(systems == null || systems.length == 0) {
			return null;
		}
		return systems[0];
	}
	
	public static System[] listSystemByCriteria(SystemCriteria systemCriteria) {
		return systemCriteria.listSystem();
	}
}
