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

import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import orm.OODPersistentManager;

public class ProjectManagementDAO {
	public static ProjectManagement loadProjectManagementByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadProjectManagementByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement getProjectManagementByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getProjectManagementByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement loadProjectManagementByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadProjectManagementByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement getProjectManagementByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return getProjectManagementByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement loadProjectManagementByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ProjectManagement) session.load(businesslogic.accounting.job.ProjectManagement.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement getProjectManagementByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ProjectManagement) session.get(businesslogic.accounting.job.ProjectManagement.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement loadProjectManagementByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ProjectManagement) session.load(businesslogic.accounting.job.ProjectManagement.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement getProjectManagementByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ProjectManagement) session.get(businesslogic.accounting.job.ProjectManagement.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProjectManagement(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryProjectManagement(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProjectManagement(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return queryProjectManagement(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement[] listProjectManagementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listProjectManagementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement[] listProjectManagementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return listProjectManagementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProjectManagement(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.job.ProjectManagement as ProjectManagement");
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
	
	public static List queryProjectManagement(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.job.ProjectManagement as ProjectManagement");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ProjectManagement", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement[] listProjectManagementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProjectManagement(session, condition, orderBy);
			return (ProjectManagement[]) list.toArray(new ProjectManagement[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement[] listProjectManagementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProjectManagement(session, condition, orderBy, lockMode);
			return (ProjectManagement[]) list.toArray(new ProjectManagement[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement loadProjectManagementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadProjectManagementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement loadProjectManagementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return loadProjectManagementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement loadProjectManagementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ProjectManagement[] projectManagements = listProjectManagementByQuery(session, condition, orderBy);
		if (projectManagements != null && projectManagements.length > 0)
			return projectManagements[0];
		else
			return null;
	}
	
	public static ProjectManagement loadProjectManagementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ProjectManagement[] projectManagements = listProjectManagementByQuery(session, condition, orderBy, lockMode);
		if (projectManagements != null && projectManagements.length > 0)
			return projectManagements[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProjectManagementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateProjectManagementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProjectManagementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = OODPersistentManager.instance().getSession();
			return iterateProjectManagementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProjectManagementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.job.ProjectManagement as ProjectManagement");
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
	
	public static java.util.Iterator iterateProjectManagementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From businesslogic.accounting.job.ProjectManagement as ProjectManagement");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ProjectManagement", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement createProjectManagement() {
		return new businesslogic.accounting.job.ProjectManagement();
	}
	
	public static boolean save(businesslogic.accounting.job.ProjectManagement projectManagement) throws PersistentException {
		try {
			OODPersistentManager.instance().saveObject(projectManagement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(businesslogic.accounting.job.ProjectManagement projectManagement) throws PersistentException {
		try {
			OODPersistentManager.instance().deleteObject(projectManagement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(businesslogic.accounting.job.ProjectManagement projectManagement)throws PersistentException {
		try {
			businesslogic.distribution.resource.InformationResource[] lInformationResourcess = projectManagement.informationResources.toArray();
			for(int i = 0; i < lInformationResourcess.length; i++) {
				lInformationResourcess[i].setProjectManagement(null);
			}
			return delete(projectManagement);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(businesslogic.accounting.job.ProjectManagement projectManagement, org.orm.PersistentSession session)throws PersistentException {
		try {
			businesslogic.distribution.resource.InformationResource[] lInformationResourcess = projectManagement.informationResources.toArray();
			for(int i = 0; i < lInformationResourcess.length; i++) {
				lInformationResourcess[i].setProjectManagement(null);
			}
			try {
				session.delete(projectManagement);
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
	
	public static boolean refresh(businesslogic.accounting.job.ProjectManagement projectManagement) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().refresh(projectManagement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(businesslogic.accounting.job.ProjectManagement projectManagement) throws PersistentException {
		try {
			OODPersistentManager.instance().getSession().evict(projectManagement);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProjectManagement loadProjectManagementByCriteria(ProjectManagementCriteria projectManagementCriteria) {
		ProjectManagement[] projectManagements = listProjectManagementByCriteria(projectManagementCriteria);
		if(projectManagements == null || projectManagements.length == 0) {
			return null;
		}
		return projectManagements[0];
	}
	
	public static ProjectManagement[] listProjectManagementByCriteria(ProjectManagementCriteria projectManagementCriteria) {
		return projectManagementCriteria.listProjectManagement();
	}
}
