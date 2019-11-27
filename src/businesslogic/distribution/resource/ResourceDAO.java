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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;
import businesslogic.distribution.Allocation_DAO;
import businesslogic.distribution.requirement.Requirement;

public class ResourceDAO {
	public static Resource loadResourceByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadResourceByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static void fetchResourceState(Resource resource) {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();

			//Can be done easier with join
			List<Integer> allocationIDs = session
					.createSQLQuery("SELECT [Allocation ID] FROM ResourceAllocation WHERE ResourceID2 = " + resource.getID()).list();


			java.util.Date currentDate = new java.util.Date();
			for (Integer allocationID : allocationIDs) {
				Requirement requirement = Allocation_DAO.getAllocation_ByORMID(allocationID).getRequirement();

				DateFormat df = new SimpleDateFormat("dd/mm/yy");

				java.util.Date reqStartDate = null;
				java.util.Date reqEndDate = null;
				try {
					reqStartDate = df.parse(requirement.getStartDate());
					reqEndDate = df.parse(requirement.getEndDate());
				} catch (ParseException e) {
					resource.setResourceState(ResourceStateEnum.UNALLOCATED.ordinal());
				}

				if (reqStartDate.before(currentDate) && reqEndDate.after(currentDate)) {
					resource.setResourceState(ResourceStateEnum.ALLOCATED.ordinal());
				}
			}

		}catch(PersistentException e){
		}
		resource.setResourceState(ResourceStateEnum.UNALLOCATED.ordinal());
	}
	
	public static Resource getResourceByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getResourceByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resource loadResourceByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadResourceByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resource getResourceByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getResourceByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resource loadResourceByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Resource) session.load(businesslogic.distribution.resource.Resource.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resource getResourceByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Resource) session.get(businesslogic.distribution.resource.Resource.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resource loadResourceByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Resource) session.load(businesslogic.distribution.resource.Resource.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resource getResourceByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Resource) session.get(businesslogic.distribution.resource.Resource.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryResource(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryResource(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryResource(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryResource(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resource[] listResourceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listResourceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resource[] listResourceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listResourceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryResource(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.Resource as Resource");
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
	
	public static List queryResource(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.Resource as Resource");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Resource", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resource[] listResourceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryResource(session, condition, orderBy);
			return (Resource[]) list.toArray(new Resource[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resource[] listResourceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryResource(session, condition, orderBy, lockMode);
			return (Resource[]) list.toArray(new Resource[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resource loadResourceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadResourceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resource loadResourceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadResourceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resource loadResourceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Resource[] resources = listResourceByQuery(session, condition, orderBy);
		if (resources != null && resources.length > 0)
			return resources[0];
		else
			return null;
	}
	
	public static Resource loadResourceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Resource[] resources = listResourceByQuery(session, condition, orderBy, lockMode);
		if (resources != null && resources.length > 0)
			return resources[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateResourceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateResourceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateResourceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateResourceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateResourceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.Resource as Resource");
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
	
	public static java.util.Iterator iterateResourceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.resource.Resource as Resource");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Resource", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resource createResource() {
		return new businesslogic.distribution.resource.Resource();
	}
	
	public static boolean save(businesslogic.distribution.resource.Resource resource) throws PersistentException {
		try {
			OODPersistentManager.instance().saveObject(resource);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(businesslogic.distribution.resource.Resource resource) throws PersistentException {
		try {
			OODPersistentManager.instance().deleteObject(resource);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(businesslogic.distribution.resource.Resource resource) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().refresh(resource);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(businesslogic.distribution.resource.Resource resource) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().evict(resource);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resource loadResourceByCriteria(ResourceCriteria resourceCriteria) {
		Resource[] resources = listResourceByCriteria(resourceCriteria);
		if(resources == null || resources.length == 0) {
			return null;
		}
		return resources[0];
	}
	
	public static Resource[] listResourceByCriteria(ResourceCriteria resourceCriteria) {
		return resourceCriteria.listResource();
	}
}
