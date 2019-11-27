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
package businesslogic.distribution;

import java.util.List;

import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;

public class ResourceAllocationDAO {
	public static ResourceAllocation loadResourceAllocationByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadResourceAllocationByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation getResourceAllocationByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getResourceAllocationByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation loadResourceAllocationByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadResourceAllocationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation getResourceAllocationByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getResourceAllocationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation loadResourceAllocationByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ResourceAllocation) session.load(businesslogic.distribution.ResourceAllocation.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation getResourceAllocationByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ResourceAllocation) session.get(businesslogic.distribution.ResourceAllocation.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation loadResourceAllocationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ResourceAllocation) session.load(businesslogic.distribution.ResourceAllocation.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation getResourceAllocationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ResourceAllocation) session.get(businesslogic.distribution.ResourceAllocation.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryResourceAllocation(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryResourceAllocation(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryResourceAllocation(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryResourceAllocation(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation[] listResourceAllocationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listResourceAllocationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation[] listResourceAllocationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listResourceAllocationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryResourceAllocation(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.ResourceAllocation as ResourceAllocation");
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
	
	public static List queryResourceAllocation(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.ResourceAllocation as ResourceAllocation");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ResourceAllocation", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation[] listResourceAllocationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryResourceAllocation(session, condition, orderBy);
			return (ResourceAllocation[]) list.toArray(new ResourceAllocation[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation[] listResourceAllocationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryResourceAllocation(session, condition, orderBy, lockMode);
			return (ResourceAllocation[]) list.toArray(new ResourceAllocation[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation loadResourceAllocationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadResourceAllocationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation loadResourceAllocationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadResourceAllocationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation loadResourceAllocationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ResourceAllocation[] resourceAllocations = listResourceAllocationByQuery(session, condition, orderBy);
		if (resourceAllocations != null && resourceAllocations.length > 0)
			return resourceAllocations[0];
		else
			return null;
	}
	
	public static ResourceAllocation loadResourceAllocationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ResourceAllocation[] resourceAllocations = listResourceAllocationByQuery(session, condition, orderBy, lockMode);
		if (resourceAllocations != null && resourceAllocations.length > 0)
			return resourceAllocations[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateResourceAllocationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateResourceAllocationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateResourceAllocationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateResourceAllocationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateResourceAllocationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.ResourceAllocation as ResourceAllocation");
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
	
	public static java.util.Iterator iterateResourceAllocationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.ResourceAllocation as ResourceAllocation");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ResourceAllocation", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation createResourceAllocation() {
		return new businesslogic.distribution.ResourceAllocation();
	}
	
	public static boolean save(businesslogic.distribution.ResourceAllocation resourceAllocation) throws PersistentException {
		try {
			OODPersistentManager.instance().saveObject(resourceAllocation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(businesslogic.distribution.ResourceAllocation resourceAllocation) throws PersistentException {
		try {
			OODPersistentManager.instance().deleteObject(resourceAllocation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(businesslogic.distribution.ResourceAllocation resourceAllocation) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().refresh(resourceAllocation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(businesslogic.distribution.ResourceAllocation resourceAllocation) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().evict(resourceAllocation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ResourceAllocation loadResourceAllocationByCriteria(ResourceAllocationCriteria resourceAllocationCriteria) {
		ResourceAllocation[] resourceAllocations = listResourceAllocationByCriteria(resourceAllocationCriteria);
		if(resourceAllocations == null || resourceAllocations.length == 0) {
			return null;
		}
		return resourceAllocations[0];
	}
	
	public static ResourceAllocation[] listResourceAllocationByCriteria(ResourceAllocationCriteria resourceAllocationCriteria) {
		return resourceAllocationCriteria.listResourceAllocation();
	}
}
