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

public class AdminDAO {
	public static Admin loadAdminByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadAdminByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin getAdminByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getAdminByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin loadAdminByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadAdminByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin getAdminByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getAdminByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin loadAdminByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Admin) session.load(businesslogic.accounting.user.Admin.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin getAdminByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Admin) session.get(businesslogic.accounting.user.Admin.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin loadAdminByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Admin) session.load(businesslogic.accounting.user.Admin.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin getAdminByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Admin) session.get(businesslogic.accounting.user.Admin.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdmin(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryAdmin(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdmin(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryAdmin(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin[] listAdminByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listAdminByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin[] listAdminByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listAdminByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdmin(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.user.Admin as Admin");
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
	
	public static List queryAdmin(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.user.Admin as Admin");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Admin", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin[] listAdminByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdmin(session, condition, orderBy);
			return (Admin[]) list.toArray(new Admin[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin[] listAdminByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdmin(session, condition, orderBy, lockMode);
			return (Admin[]) list.toArray(new Admin[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin loadAdminByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadAdminByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin loadAdminByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadAdminByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin loadAdminByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Admin[] admins = listAdminByQuery(session, condition, orderBy);
		if (admins != null && admins.length > 0)
			return admins[0];
		else
			return null;
	}
	
	public static Admin loadAdminByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Admin[] admins = listAdminByQuery(session, condition, orderBy, lockMode);
		if (admins != null && admins.length > 0)
			return admins[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdminByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateAdminByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdminByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateAdminByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdminByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.user.Admin as Admin");
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
	
	public static java.util.Iterator iterateAdminByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.user.Admin as Admin");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Admin", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin createAdmin() {
		return new businesslogic.accounting.user.Admin();
	}
	
	public static boolean save(businesslogic.accounting.user.Admin admin) throws PersistentException {
		try {
			OODPersistentManager.instance().saveObject(admin);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(businesslogic.accounting.user.Admin admin) throws PersistentException {
		try {
			OODPersistentManager.instance().deleteObject(admin);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(businesslogic.accounting.user.Admin admin) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().refresh(admin);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(businesslogic.accounting.user.Admin admin) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().evict(admin);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Admin loadAdminByCriteria(AdminCriteria adminCriteria) {
		Admin[] admins = listAdminByCriteria(adminCriteria);
		if(admins == null || admins.length == 0) {
			return null;
		}
		return admins[0];
	}
	
	public static Admin[] listAdminByCriteria(AdminCriteria adminCriteria) {
		return adminCriteria.listAdmin();
	}
}
