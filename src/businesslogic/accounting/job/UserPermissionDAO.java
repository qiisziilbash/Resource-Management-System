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

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;

public class UserPermissionDAO {
	public static UserPermission loadUserPermissionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadUserPermissionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static UserPermission getUserPermissionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getUserPermissionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static UserPermission loadUserPermissionByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadUserPermissionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static UserPermission getUserPermissionByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getUserPermissionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static UserPermission loadUserPermissionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (UserPermission) session.load(UserPermission.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static UserPermission getUserPermissionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (UserPermission) session.get(UserPermission.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static UserPermission loadUserPermissionByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (UserPermission) session.load(UserPermission.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static UserPermission getUserPermissionByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (UserPermission) session.get(UserPermission.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryUserPermission(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryUserPermission(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryUserPermission(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryUserPermission(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static UserPermission[] listUserPermissionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listUserPermissionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static UserPermission[] listUserPermissionByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listUserPermissionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryUserPermission(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.job.UserPermission as UserPermission");
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

	public static List queryUserPermission(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.job.UserPermission as UserPermission");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UserPermission", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static UserPermission[] listUserPermissionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUserPermission(session, condition, orderBy);
			return (UserPermission[]) list.toArray(new UserPermission[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static UserPermission[] listUserPermissionByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			List list = queryUserPermission(session, condition, orderBy, lockMode);
			return (UserPermission[]) list.toArray(new UserPermission[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static UserPermission loadUserPermissionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadUserPermissionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static UserPermission loadUserPermissionByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadUserPermissionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static UserPermission loadUserPermissionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UserPermission[] userPermissions = listUserPermissionByQuery(session, condition, orderBy);
		if (userPermissions != null && userPermissions.length > 0)
			return userPermissions[0];
		else
			return null;
	}

	public static UserPermission loadUserPermissionByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		UserPermission[] userPermissions = listUserPermissionByQuery(session, condition, orderBy, lockMode);
		if (userPermissions != null && userPermissions.length > 0)
			return userPermissions[0];
		else
			return null;
	}

	public static java.util.Iterator iterateUserPermissionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateUserPermissionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static java.util.Iterator iterateUserPermissionByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateUserPermissionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static java.util.Iterator iterateUserPermissionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.job.UserPermission as UserPermission");
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

	public static java.util.Iterator iterateUserPermissionByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.job.UserPermission as UserPermission");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UserPermission", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static UserPermission createUserPermission() {
		return new UserPermission();
	}

	public static boolean save(UserPermission userPermission) throws PersistentException {
		try {
			OODPersistentManager.instance().saveObject(userPermission);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean delete(UserPermission userPermission) throws PersistentException {
		try {
			OODPersistentManager.instance().deleteObject(userPermission);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean refresh(UserPermission userPermission) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().refresh(userPermission);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean evict(UserPermission userPermission) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().evict(userPermission);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UserPermission loadUserPermissionByCriteria(UserPermissionCriteria userPermissionCriteria) {
		UserPermission[] userPermissions = listUserPermissionByCriteria(userPermissionCriteria);
		if(userPermissions == null || userPermissions.length == 0) {
			return null;
		}
		return userPermissions[0];
	}
	
	public static UserPermission[] listUserPermissionByCriteria(UserPermissionCriteria userPermissionCriteria) {
		return userPermissionCriteria.listUserPermission();
	}
}
