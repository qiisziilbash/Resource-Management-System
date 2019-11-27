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

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;
import businesslogic.distribution.resource.Resource;
import businesslogic.distribution.resource.ResourceDAO;

public class Allocation_DAO {
	public static Allocation loadAllocation_ByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadAllocation_ByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static void fetchResources(Allocation allocation) {
		//This method can be called after allocation and resourceAllocation are saved to db
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			List<Integer> resourceIDs = session
					.createSQLQuery("SELECT ResourceID2 FROM ResourceAllocation WHERE [Allocation ID] = "+ allocation.getID()).list();
			ArrayList<Resource> result = new ArrayList<>();
			for(Integer id : resourceIDs) {
				result.add(ResourceDAO.getResourceByORMID(id));
			}
			allocation.setResources(result.toArray(new Resource[result.size()]));
		}
		catch (PersistentException ex) {
			ex.printStackTrace();
		}
		allocation.setResources(new Resource[0]);
	}
	
	public static Allocation getAllocation_ByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getAllocation_ByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Allocation loadAllocation_ByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadAllocation_ByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Allocation getAllocation_ByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getAllocation_ByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Allocation loadAllocation_ByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Allocation) session.load(Allocation.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Allocation getAllocation_ByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Allocation) session.get(Allocation.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Allocation loadAllocation_ByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Allocation) session.load(Allocation.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Allocation getAllocation_ByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Allocation) session.get(Allocation.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAllocation_(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryAllocation_(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAllocation_(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryAllocation_(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Allocation[] listAllocation_ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listAllocation_ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Allocation[] listAllocation_ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listAllocation_ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAllocation_(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.Allocation as Allocation");
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
	
	public static List queryAllocation_(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.Allocation as Allocation");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Allocation", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Allocation[] listAllocation_ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAllocation_(session, condition, orderBy);
			return (Allocation[]) list.toArray(new Allocation[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Allocation[] listAllocation_ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAllocation_(session, condition, orderBy, lockMode);
			return (Allocation[]) list.toArray(new Allocation[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Allocation loadAllocation_ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadAllocation_ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Allocation loadAllocation_ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadAllocation_ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Allocation loadAllocation_ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Allocation[] allocation_s = listAllocation_ByQuery(session, condition, orderBy);
		if (allocation_s != null && allocation_s.length > 0)
			return allocation_s[0];
		else
			return null;
	}
	
	public static Allocation loadAllocation_ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Allocation[] allocation_s = listAllocation_ByQuery(session, condition, orderBy, lockMode);
		if (allocation_s != null && allocation_s.length > 0)
			return allocation_s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAllocation_ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateAllocation_ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAllocation_ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateAllocation_ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAllocation_ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.Allocation as Allocation");
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
	
	public static java.util.Iterator iterateAllocation_ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.Allocation as Allocation");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Allocation", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Allocation createAllocation_() {
		return new Allocation();
	}
	
	public static boolean save(Allocation allocation_) throws PersistentException {
		try {
			OODPersistentManager.instance().saveObject(allocation_);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Allocation allocation_) throws PersistentException {
		try {
			OODPersistentManager.instance().deleteObject(allocation_);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Allocation allocation_) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().refresh(allocation_);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Allocation allocation_) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().evict(allocation_);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Allocation loadAllocation_ByCriteria(Allocation_Criteria allocation_Criteria) {
		Allocation[] allocation_s = listAllocation_ByCriteria(allocation_Criteria);
		if(allocation_s == null || allocation_s.length == 0) {
			return null;
		}
		return allocation_s[0];
	}
	
	public static Allocation[] listAllocation_ByCriteria(Allocation_Criteria allocation_Criteria) {
		return allocation_Criteria.listAllocation_();
	}
}
