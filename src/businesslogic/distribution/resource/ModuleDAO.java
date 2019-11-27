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

public class ModuleDAO {
	public static Module loadModuleByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadModuleByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module getModuleByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getModuleByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module loadModuleByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadModuleByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module getModuleByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getModuleByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module loadModuleByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Module) session.load(businesslogic.distribution.resource.Module.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module getModuleByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Module) session.get(businesslogic.distribution.resource.Module.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module loadModuleByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Module) session.load(businesslogic.distribution.resource.Module.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module getModuleByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Module) session.get(businesslogic.distribution.resource.Module.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryModule(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryModule(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryModule(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryModule(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module[] listModuleByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listModuleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module[] listModuleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listModuleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryModule(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.Module as Module");
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
	
	public static List queryModule(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.Module as Module");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Module", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module[] listModuleByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryModule(session, condition, orderBy);
			return (Module[]) list.toArray(new Module[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module[] listModuleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryModule(session, condition, orderBy, lockMode);
			return (Module[]) list.toArray(new Module[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module loadModuleByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadModuleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module loadModuleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadModuleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module loadModuleByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Module[] modules = listModuleByQuery(session, condition, orderBy);
		if (modules != null && modules.length > 0)
			return modules[0];
		else
			return null;
	}
	
	public static Module loadModuleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Module[] modules = listModuleByQuery(session, condition, orderBy, lockMode);
		if (modules != null && modules.length > 0)
			return modules[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateModuleByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateModuleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateModuleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateModuleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateModuleByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.Module as Module");
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
	
	public static java.util.Iterator iterateModuleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.Module as Module");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Module", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module createModule() {
		return new businesslogic.distribution.resource.Module();
	}
	
	public static boolean save(businesslogic.distribution.resource.Module module) throws PersistentException {
		try {
			OODPersistentManager.instance().saveObject(module);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(businesslogic.distribution.resource.Module module) throws PersistentException {
		try {
			OODPersistentManager.instance().deleteObject(module);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(businesslogic.distribution.resource.Module module)throws PersistentException {
		try {
			if (module.getProjectManagement() != null) {
				module.getProjectManagement().informationResources.remove(module);
			}
			
			return delete(module);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(businesslogic.distribution.resource.Module module, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (module.getProjectManagement() != null) {
				module.getProjectManagement().informationResources.remove(module);
			}
			
			try {
				session.delete(module);
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
	
	public static boolean refresh(businesslogic.distribution.resource.Module module) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().refresh(module);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(businesslogic.distribution.resource.Module module) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().evict(module);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Module loadModuleByCriteria(ModuleCriteria moduleCriteria) {
		Module[] modules = listModuleByCriteria(moduleCriteria);
		if(modules == null || modules.length == 0) {
			return null;
		}
		return modules[0];
	}
	
	public static Module[] listModuleByCriteria(ModuleCriteria moduleCriteria) {
		return moduleCriteria.listModule();
	}
}
