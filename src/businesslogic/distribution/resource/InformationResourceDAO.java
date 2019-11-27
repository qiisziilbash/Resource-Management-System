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

public class InformationResourceDAO {
	public static InformationResource loadInformationResourceByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadInformationResourceByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource getInformationResourceByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getInformationResourceByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource loadInformationResourceByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadInformationResourceByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource getInformationResourceByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getInformationResourceByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource loadInformationResourceByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (InformationResource) session.load(businesslogic.distribution.resource.InformationResource.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource getInformationResourceByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (InformationResource) session.get(businesslogic.distribution.resource.InformationResource.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource loadInformationResourceByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (InformationResource) session.load(businesslogic.distribution.resource.InformationResource.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource getInformationResourceByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (InformationResource) session.get(businesslogic.distribution.resource.InformationResource.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInformationResource(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryInformationResource(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInformationResource(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryInformationResource(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource[] listInformationResourceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listInformationResourceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource[] listInformationResourceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listInformationResourceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInformationResource(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.InformationResource as InformationResource");
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
	
	public static List queryInformationResource(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.InformationResource as InformationResource");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("InformationResource", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource[] listInformationResourceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryInformationResource(session, condition, orderBy);
			return (InformationResource[]) list.toArray(new InformationResource[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource[] listInformationResourceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryInformationResource(session, condition, orderBy, lockMode);
			return (InformationResource[]) list.toArray(new InformationResource[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource loadInformationResourceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadInformationResourceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource loadInformationResourceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadInformationResourceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource loadInformationResourceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		InformationResource[] informationResources = listInformationResourceByQuery(session, condition, orderBy);
		if (informationResources != null && informationResources.length > 0)
			return informationResources[0];
		else
			return null;
	}
	
	public static InformationResource loadInformationResourceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		InformationResource[] informationResources = listInformationResourceByQuery(session, condition, orderBy, lockMode);
		if (informationResources != null && informationResources.length > 0)
			return informationResources[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateInformationResourceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateInformationResourceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInformationResourceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateInformationResourceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInformationResourceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.InformationResource as InformationResource");
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
	
	public static java.util.Iterator iterateInformationResourceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.InformationResource as InformationResource");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("InformationResource", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource createInformationResource() {
		return new businesslogic.distribution.resource.InformationResource();
	}
	
	public static boolean save(businesslogic.distribution.resource.InformationResource informationResource) throws PersistentException {
		try {
			OODPersistentManager.instance().saveObject(informationResource);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(businesslogic.distribution.resource.InformationResource informationResource) throws PersistentException {
		try {
			OODPersistentManager.instance().deleteObject(informationResource);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(businesslogic.distribution.resource.InformationResource informationResource)throws PersistentException {
		if (informationResource instanceof businesslogic.distribution.resource.Project) {
			return businesslogic.distribution.resource.ProjectDAO.deleteAndDissociate((businesslogic.distribution.resource.Project) informationResource);
		}
		
		if (informationResource instanceof businesslogic.distribution.resource.System) {
			return businesslogic.distribution.resource.SystemDAO.deleteAndDissociate((businesslogic.distribution.resource.System) informationResource);
		}
		
		if (informationResource instanceof businesslogic.distribution.resource.Subsystem) {
			return businesslogic.distribution.resource.SubsystemDAO.deleteAndDissociate((businesslogic.distribution.resource.Subsystem) informationResource);
		}
		
		if (informationResource instanceof businesslogic.distribution.resource.Module) {
			return businesslogic.distribution.resource.ModuleDAO.deleteAndDissociate((businesslogic.distribution.resource.Module) informationResource);
		}
		
		try {
			if (informationResource.getProjectManagement() != null) {
				informationResource.getProjectManagement().informationResources.remove(informationResource);
			}
			
			return delete(informationResource);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(businesslogic.distribution.resource.InformationResource informationResource, org.orm.PersistentSession session)throws PersistentException {
		if (informationResource instanceof businesslogic.distribution.resource.Project) {
			return businesslogic.distribution.resource.ProjectDAO.deleteAndDissociate((businesslogic.distribution.resource.Project) informationResource, session);
		}
		
		if (informationResource instanceof businesslogic.distribution.resource.System) {
			return businesslogic.distribution.resource.SystemDAO.deleteAndDissociate((businesslogic.distribution.resource.System) informationResource, session);
		}
		
		if (informationResource instanceof businesslogic.distribution.resource.Subsystem) {
			return businesslogic.distribution.resource.SubsystemDAO.deleteAndDissociate((businesslogic.distribution.resource.Subsystem) informationResource, session);
		}
		
		if (informationResource instanceof businesslogic.distribution.resource.Module) {
			return businesslogic.distribution.resource.ModuleDAO.deleteAndDissociate((businesslogic.distribution.resource.Module) informationResource, session);
		}
		
		try {
			if (informationResource.getProjectManagement() != null) {
				informationResource.getProjectManagement().informationResources.remove(informationResource);
			}
			
			try {
				session.delete(informationResource);
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
	
	public static boolean refresh(businesslogic.distribution.resource.InformationResource informationResource) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().refresh(informationResource);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(businesslogic.distribution.resource.InformationResource informationResource) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().evict(informationResource);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationResource loadInformationResourceByCriteria(InformationResourceCriteria informationResourceCriteria) {
		InformationResource[] informationResources = listInformationResourceByCriteria(informationResourceCriteria);
		if(informationResources == null || informationResources.length == 0) {
			return null;
		}
		return informationResources[0];
	}
	
	public static InformationResource[] listInformationResourceByCriteria(InformationResourceCriteria informationResourceCriteria) {
		return informationResourceCriteria.listInformationResource();
	}
}
