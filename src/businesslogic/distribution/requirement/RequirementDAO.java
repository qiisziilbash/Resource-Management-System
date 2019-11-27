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
package businesslogic.distribution.requirement;

import java.util.List;

import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;
import businesslogic.accounting.job.ProjectManagementDAO;
import businesslogic.distribution.resource.InformationResourceDAO;

public class RequirementDAO {
	public static Requirement loadRequirementByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadRequirementByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement getRequirementByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getRequirementByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement loadRequirementByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadRequirementByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement getRequirementByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getRequirementByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement loadRequirementByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Requirement) session.load(businesslogic.distribution.requirement.Requirement.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement getRequirementByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Requirement) session.get(businesslogic.distribution.requirement.Requirement.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement loadRequirementByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Requirement) session.load(businesslogic.distribution.requirement.Requirement.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement getRequirementByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Requirement) session.get(businesslogic.distribution.requirement.Requirement.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static void fetchProjectManager(Requirement requirement) {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			Integer jobID = (Integer) session.createSQLQuery("SELECT JobID FROM Requirement WHERE ID = " + requirement.getID()).list().get(0);
			requirement.setProjectManagement(ProjectManagementDAO.getProjectManagementByORMID(jobID));
		}
		catch (PersistentException ex) {
			ex.printStackTrace();
		}
	}
	
	public static List queryRequirement(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryRequirement(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRequirement(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryRequirement(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement[] listRequirementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listRequirementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement[] listRequirementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listRequirementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRequirement(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.requirement.Requirement as Requirement");
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
	
	public static List queryRequirement(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.requirement.Requirement as Requirement");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Requirement", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement[] listRequirementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRequirement(session, condition, orderBy);
			return (Requirement[]) list.toArray(new Requirement[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement[] listRequirementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryRequirement(session, condition, orderBy, lockMode);
			return (Requirement[]) list.toArray(new Requirement[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement loadRequirementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadRequirementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement loadRequirementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadRequirementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement loadRequirementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Requirement[] requirements = listRequirementByQuery(session, condition, orderBy);
		if (requirements != null && requirements.length > 0)
			return requirements[0];
		else
			return null;
	}
	
	public static Requirement loadRequirementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Requirement[] requirements = listRequirementByQuery(session, condition, orderBy, lockMode);
		if (requirements != null && requirements.length > 0)
			return requirements[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRequirementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateRequirementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRequirementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateRequirementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRequirementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.requirement.Requirement as Requirement");
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
	
	public static java.util.Iterator iterateRequirementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.distribution.requirement.Requirement as Requirement");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Requirement", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement createRequirement() {
		return new businesslogic.distribution.requirement.Requirement();
	}
	
	public static boolean save(businesslogic.distribution.requirement.Requirement requirement) throws PersistentException {
		try {
			OODPersistentManager.instance().saveObject(requirement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(businesslogic.distribution.requirement.Requirement requirement) throws PersistentException {
		try {
			OODPersistentManager.instance().deleteObject(requirement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(businesslogic.distribution.requirement.Requirement requirement) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().refresh(requirement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(businesslogic.distribution.requirement.Requirement requirement) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().evict(requirement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Requirement loadRequirementByCriteria(RequirementCriteria requirementCriteria) {
		Requirement[] requirements = listRequirementByCriteria(requirementCriteria);
		if(requirements == null || requirements.length == 0) {
			return null;
		}
		return requirements[0];
	}
	
	public static Requirement[] listRequirementByCriteria(RequirementCriteria requirementCriteria) {
		return requirementCriteria.listRequirement();
	}

	public static void updateProjectManager(Requirement requirement) {
		requirement.getProjectManagement().addRequirement(requirement);
	}
	

	public static void fetchInformationResource(Requirement requirement) {
		try{
			PersistentSession session = OODPersistentManager.instance().getSession();
			Integer irID = (Integer) session.createSQLQuery("SELECT ResourceID2 FROM Requirement WHERE ID = "
					+ requirement.getID()).uniqueResult();
			requirement.setInformationResource(InformationResourceDAO.getInformationResourceByORMID(irID));
		}
		catch (PersistentException ex){
		}
	}

	public static void updateInformationResource(Requirement requirement) {
		fetchInformationResource(requirement);
		requirement.getInformationResource().addRequirement(requirement);
	}
}
