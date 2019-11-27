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

import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;

public class SystemConfigurationDAO {
	public static SystemConfiguration loadSystemConfigurationByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadSystemConfigurationByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration getSystemConfigurationByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getSystemConfigurationByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration loadSystemConfigurationByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadSystemConfigurationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration getSystemConfigurationByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getSystemConfigurationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration loadSystemConfigurationByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (SystemConfiguration) session.load(businesslogic.support.SystemConfiguration.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration getSystemConfigurationByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (SystemConfiguration) session.get(businesslogic.support.SystemConfiguration.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration loadSystemConfigurationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SystemConfiguration) session.load(businesslogic.support.SystemConfiguration.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration getSystemConfigurationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SystemConfiguration) session.get(businesslogic.support.SystemConfiguration.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySystemConfiguration(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return querySystemConfiguration(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySystemConfiguration(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return querySystemConfiguration(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration[] listSystemConfigurationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listSystemConfigurationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration[] listSystemConfigurationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listSystemConfigurationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySystemConfiguration(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.support.SystemConfiguration as SystemConfiguration");
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
	
	public static List querySystemConfiguration(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.support.SystemConfiguration as SystemConfiguration");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SystemConfiguration", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration[] listSystemConfigurationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySystemConfiguration(session, condition, orderBy);
			return (SystemConfiguration[]) list.toArray(new SystemConfiguration[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration[] listSystemConfigurationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySystemConfiguration(session, condition, orderBy, lockMode);
			return (SystemConfiguration[]) list.toArray(new SystemConfiguration[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration loadSystemConfigurationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadSystemConfigurationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration loadSystemConfigurationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadSystemConfigurationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration loadSystemConfigurationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		SystemConfiguration[] systemConfigurations = listSystemConfigurationByQuery(session, condition, orderBy);
		if (systemConfigurations != null && systemConfigurations.length > 0)
			return systemConfigurations[0];
		else
			return null;
	}
	
	public static SystemConfiguration loadSystemConfigurationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		SystemConfiguration[] systemConfigurations = listSystemConfigurationByQuery(session, condition, orderBy, lockMode);
		if (systemConfigurations != null && systemConfigurations.length > 0)
			return systemConfigurations[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSystemConfigurationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateSystemConfigurationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSystemConfigurationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateSystemConfigurationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSystemConfigurationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.support.SystemConfiguration as SystemConfiguration");
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
	
	public static java.util.Iterator iterateSystemConfigurationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.support.SystemConfiguration as SystemConfiguration");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SystemConfiguration", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration createSystemConfiguration() {
		return new businesslogic.support.SystemConfiguration();
	}
	
	public static boolean save(businesslogic.support.SystemConfiguration systemConfiguration) throws PersistentException {
		try {
			OODPersistentManager.instance().saveObject(systemConfiguration);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(businesslogic.support.SystemConfiguration systemConfiguration) throws PersistentException {
		try {
			OODPersistentManager.instance().deleteObject(systemConfiguration);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(businesslogic.support.SystemConfiguration systemConfiguration) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().refresh(systemConfiguration);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(businesslogic.support.SystemConfiguration systemConfiguration) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().evict(systemConfiguration);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemConfiguration loadSystemConfigurationByCriteria(SystemConfigurationCriteria systemConfigurationCriteria) {
		SystemConfiguration[] systemConfigurations = listSystemConfigurationByCriteria(systemConfigurationCriteria);
		if(systemConfigurations == null || systemConfigurations.length == 0) {
			return null;
		}
		return systemConfigurations[0];
	}
	
	public static SystemConfiguration[] listSystemConfigurationByCriteria(SystemConfigurationCriteria systemConfigurationCriteria) {
		return systemConfigurationCriteria.listSystemConfiguration();
	}
}
