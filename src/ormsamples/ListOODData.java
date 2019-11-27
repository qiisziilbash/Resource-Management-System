/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.PersistentException;

import orm.OODPersistentManager;
import businesslogic.accounting.job.ResourceManagement;
import businesslogic.accounting.job.ResourceManagementCriteria;
import businesslogic.accounting.job.ResourceManagementDAO;
import businesslogic.distribution.Allocation;

public class ListOODData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing User...");
		businesslogic.accounting.user.User[] businessLogicAccountingUserUsers = businesslogic.accounting.user.UserDAO.listUserByQuery(null, null);
		int length = Math.min(businessLogicAccountingUserUsers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicAccountingUserUsers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Job...");
		businesslogic.accounting.job.Job[] businessLogicAccountingJobJobs = businesslogic.accounting.job.JobDAO.listJobByQuery(null, null);
		length = Math.min(businessLogicAccountingJobJobs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicAccountingJobJobs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Resource...");
		businesslogic.distribution.resource.Resource[] businessLogicDistributionResourceResources = businesslogic.distribution.resource.ResourceDAO.listResourceByQuery(null, null);
		length = Math.min(businessLogicDistributionResourceResources.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicDistributionResourceResources[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing InformationResource...");
		businesslogic.distribution.resource.InformationResource[] businessLogicDistributionResourceInformationResources = businesslogic.distribution.resource.InformationResourceDAO.listInformationResourceByQuery(null, null);
		length = Math.min(businessLogicDistributionResourceInformationResources.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicDistributionResourceInformationResources[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Project...");
		businesslogic.distribution.resource.Project[] businessLogicDistributionResourceProjects = businesslogic.distribution.resource.ProjectDAO.listProjectByQuery(null, null);
		length = Math.min(businessLogicDistributionResourceProjects.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicDistributionResourceProjects[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing System...");
		businesslogic.distribution.resource.System[] businessLogicDistributionResourceSystems = businesslogic.distribution.resource.SystemDAO.listSystemByQuery(null, null);
		length = Math.min(businessLogicDistributionResourceSystems.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicDistributionResourceSystems[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Subsystem...");
		businesslogic.distribution.resource.Subsystem[] businessLogicDistributionResourceSubsystems = businesslogic.distribution.resource.SubsystemDAO.listSubsystemByQuery(null, null);
		length = Math.min(businessLogicDistributionResourceSubsystems.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicDistributionResourceSubsystems[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Module...");
		businesslogic.distribution.resource.Module[] businessLogicDistributionResourceModules = businesslogic.distribution.resource.ModuleDAO.listModuleByQuery(null, null);
		length = Math.min(businessLogicDistributionResourceModules.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicDistributionResourceModules[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Specialty...");
		businesslogic.accounting.job.Specialty[] businessLogicAccountingJobSpecialtys = businesslogic.accounting.job.SpecialtyDAO.listSpecialtyByQuery(null, null);
		length = Math.min(businessLogicAccountingJobSpecialtys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicAccountingJobSpecialtys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing HumanResource...");
		businesslogic.distribution.resource.HumanResource[] businessLogicDistributionResourceHumanResources = businesslogic.distribution.resource.HumanResourceDAO.listHumanResourceByQuery(null, null);
		length = Math.min(businessLogicDistributionResourceHumanResources.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicDistributionResourceHumanResources[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Requirement...");
		businesslogic.distribution.requirement.Requirement[] businessLogicDistributionRequirementRequirements = businesslogic.distribution.requirement.RequirementDAO.listRequirementByQuery(null, null);
		length = Math.min(businessLogicDistributionRequirementRequirements.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicDistributionRequirementRequirements[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing FinancialResource...");
		businesslogic.distribution.resource.FinancialResource[] businessLogicDistributionResourceFinancialResources = businesslogic.distribution.resource.FinancialResourceDAO.listFinancialResourceByQuery(null, null);
		length = Math.min(businessLogicDistributionResourceFinancialResources.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicDistributionResourceFinancialResources[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PhysicalResource...");
		businesslogic.distribution.resource.PhysicalResource[] businessLogicDistributionResourcePhysicalResources = businesslogic.distribution.resource.PhysicalResourceDAO.listPhysicalResourceByQuery(null, null);
		length = Math.min(businessLogicDistributionResourcePhysicalResources.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicDistributionResourcePhysicalResources[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Admin...");
		businesslogic.accounting.user.Admin[] businessLogicAccountingUserAdmins = businesslogic.accounting.user.AdminDAO.listAdminByQuery(null, null);
		length = Math.min(businessLogicAccountingUserAdmins.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicAccountingUserAdmins[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Manager...");
		businesslogic.accounting.user.Manager[] businessLogicAccountingUserManagers = businesslogic.accounting.user.ManagerDAO.listManagerByQuery(null, null);
		length = Math.min(businessLogicAccountingUserManagers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicAccountingUserManagers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing MiddleLevelManager...");
		businesslogic.accounting.user.MiddleLevelManager[] businessLogicAccountingUserMiddleLevelManagers = businesslogic.accounting.user.MiddleLevelManagerDAO.listMiddleLevelManagerByQuery(null, null);
		length = Math.min(businessLogicAccountingUserMiddleLevelManagers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicAccountingUserMiddleLevelManagers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Employee...");
		businesslogic.accounting.user.Employee[] businessLogicAccountingUserEmployees = businesslogic.accounting.user.EmployeeDAO.listEmployeeByQuery(null, null);
		length = Math.min(businessLogicAccountingUserEmployees.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicAccountingUserEmployees[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ProjectManagement...");
		businesslogic.accounting.job.ProjectManagement[] businessLogicAccountingJobProjectManagements = businesslogic.accounting.job.ProjectManagementDAO.listProjectManagementByQuery(null, null);
		length = Math.min(businessLogicAccountingJobProjectManagements.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicAccountingJobProjectManagements[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ResourceManagement...");
		ResourceManagement[] businessLogicAccountingResourceManagements = ResourceManagementDAO.listResourceManagementByQuery(null, null);
		length = Math.min(businessLogicAccountingResourceManagements.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicAccountingResourceManagements[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Programming...");
		businesslogic.accounting.job.Programming[] businessLogicAccountingJobProgrammings = businesslogic.accounting.job.ProgrammingDAO.listProgrammingByQuery(null, null);
		length = Math.min(businessLogicAccountingJobProgrammings.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicAccountingJobProgrammings[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ModuleChange...");
		businesslogic.distribution.resource.ModuleChange[] businessLogicDistributionResourceModuleChanges = businesslogic.distribution.resource.ModuleChangeDAO.listModuleChangeByQuery(null, null);
		length = Math.min(businessLogicDistributionResourceModuleChanges.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicDistributionResourceModuleChanges[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing SystemConfiguration...");
		businesslogic.support.SystemConfiguration[] businessLogicSupportSystemConfigurations = businesslogic.support.SystemConfigurationDAO.listSystemConfigurationByQuery(null, null);
		length = Math.min(businessLogicSupportSystemConfigurations.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicSupportSystemConfigurations[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Allocation...");
		Allocation[] businessLogicDistributionAllocation_s = businesslogic.distribution.Allocation_DAO.listAllocation_ByQuery(null, null);
		length = Math.min(businessLogicDistributionAllocation_s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicDistributionAllocation_s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing HighLevelManager...");
		businesslogic.accounting.user.HighLevelManager[] businessLogicAccountingUserHighLevelManagers = businesslogic.accounting.user.HighLevelManagerDAO.listHighLevelManagerByQuery(null, null);
		length = Math.min(businessLogicAccountingUserHighLevelManagers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicAccountingUserHighLevelManagers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Notification...");
		businesslogic.utility.Notification[] businessLogicUtilityNotifications = businesslogic.utility.NotificationDAO.listNotificationByQuery(null, null);
		length = Math.min(businessLogicUtilityNotifications.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicUtilityNotifications[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Email...");
		network.Email[] networkEmails = network.EmailDAO.listEmailByQuery(null, null);
		length = Math.min(networkEmails.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(networkEmails[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UserJob...");
		businesslogic.accounting.job.UserJob[] businessLogicAccountingJobUserJobs = businesslogic.accounting.job.UserJobDAO.listUserJobByQuery(null, null);
		length = Math.min(businessLogicAccountingJobUserJobs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicAccountingJobUserJobs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ResourceAllocation...");
		businesslogic.distribution.ResourceAllocation[] businessLogicDistributionResourceAllocations = businesslogic.distribution.ResourceAllocationDAO.listResourceAllocationByQuery(null, null);
		length = Math.min(businessLogicDistributionResourceAllocations.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(businessLogicDistributionResourceAllocations[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing User by Criteria...");
		businesslogic.accounting.user.UserCriteria businessLogicAccountingUserUserCriteria = new businesslogic.accounting.user.UserCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicAccountingUserUserCriteria.ID.eq();
		businessLogicAccountingUserUserCriteria.setMaxResults(ROW_COUNT);
		businesslogic.accounting.user.User[] businessLogicAccountingUserUsers = businessLogicAccountingUserUserCriteria.listUser();
		int length =businessLogicAccountingUserUsers== null ? 0 : Math.min(businessLogicAccountingUserUsers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicAccountingUserUsers[i]);
		}
		System.out.println(length + " User record(s) retrieved."); 
		
		System.out.println("Listing Job by Criteria...");
		businesslogic.accounting.job.JobCriteria businessLogicAccountingJobJobCriteria = new businesslogic.accounting.job.JobCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicAccountingJobJobCriteria.ID.eq();
		businessLogicAccountingJobJobCriteria.setMaxResults(ROW_COUNT);
		businesslogic.accounting.job.Job[] businessLogicAccountingJobJobs = businessLogicAccountingJobJobCriteria.listJob();
		length =businessLogicAccountingJobJobs== null ? 0 : Math.min(businessLogicAccountingJobJobs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicAccountingJobJobs[i]);
		}
		System.out.println(length + " Job record(s) retrieved."); 
		
		System.out.println("Listing Resource by Criteria...");
		businesslogic.distribution.resource.ResourceCriteria businessLogicDistributionResourceResourceCriteria = new businesslogic.distribution.resource.ResourceCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicDistributionResourceResourceCriteria.ID.eq();
		businessLogicDistributionResourceResourceCriteria.setMaxResults(ROW_COUNT);
		businesslogic.distribution.resource.Resource[] businessLogicDistributionResourceResources = businessLogicDistributionResourceResourceCriteria.listResource();
		length =businessLogicDistributionResourceResources== null ? 0 : Math.min(businessLogicDistributionResourceResources.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicDistributionResourceResources[i]);
		}
		System.out.println(length + " Resource record(s) retrieved."); 
		
		System.out.println("Listing InformationResource by Criteria...");
		businesslogic.distribution.resource.InformationResourceCriteria businessLogicDistributionResourceInformationResourceCriteria = new businesslogic.distribution.resource.InformationResourceCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicDistributionResourceInformationResourceCriteria.ID.eq();
		businessLogicDistributionResourceInformationResourceCriteria.setMaxResults(ROW_COUNT);
		businesslogic.distribution.resource.InformationResource[] businessLogicDistributionResourceInformationResources = businessLogicDistributionResourceInformationResourceCriteria.listInformationResource();
		length =businessLogicDistributionResourceInformationResources== null ? 0 : Math.min(businessLogicDistributionResourceInformationResources.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicDistributionResourceInformationResources[i]);
		}
		System.out.println(length + " InformationResource record(s) retrieved."); 
		
		System.out.println("Listing Project by Criteria...");
		businesslogic.distribution.resource.ProjectCriteria businessLogicDistributionResourceProjectCriteria = new businesslogic.distribution.resource.ProjectCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicDistributionResourceProjectCriteria.ID.eq();
		businessLogicDistributionResourceProjectCriteria.setMaxResults(ROW_COUNT);
		businesslogic.distribution.resource.Project[] businessLogicDistributionResourceProjects = businessLogicDistributionResourceProjectCriteria.listProject();
		length =businessLogicDistributionResourceProjects== null ? 0 : Math.min(businessLogicDistributionResourceProjects.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicDistributionResourceProjects[i]);
		}
		System.out.println(length + " Project record(s) retrieved."); 
		
		System.out.println("Listing System by Criteria...");
		businesslogic.distribution.resource.SystemCriteria businessLogicDistributionResourceSystemCriteria = new businesslogic.distribution.resource.SystemCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicDistributionResourceSystemCriteria.ID.eq();
		businessLogicDistributionResourceSystemCriteria.setMaxResults(ROW_COUNT);
		businesslogic.distribution.resource.System[] businessLogicDistributionResourceSystems = businessLogicDistributionResourceSystemCriteria.listSystem();
		length =businessLogicDistributionResourceSystems== null ? 0 : Math.min(businessLogicDistributionResourceSystems.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicDistributionResourceSystems[i]);
		}
		System.out.println(length + " System record(s) retrieved."); 
		
		System.out.println("Listing Subsystem by Criteria...");
		businesslogic.distribution.resource.SubsystemCriteria businessLogicDistributionResourceSubsystemCriteria = new businesslogic.distribution.resource.SubsystemCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicDistributionResourceSubsystemCriteria.ID.eq();
		businessLogicDistributionResourceSubsystemCriteria.setMaxResults(ROW_COUNT);
		businesslogic.distribution.resource.Subsystem[] businessLogicDistributionResourceSubsystems = businessLogicDistributionResourceSubsystemCriteria.listSubsystem();
		length =businessLogicDistributionResourceSubsystems== null ? 0 : Math.min(businessLogicDistributionResourceSubsystems.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicDistributionResourceSubsystems[i]);
		}
		System.out.println(length + " Subsystem record(s) retrieved."); 
		
		System.out.println("Listing Module by Criteria...");
		businesslogic.distribution.resource.ModuleCriteria businessLogicDistributionResourceModuleCriteria = new businesslogic.distribution.resource.ModuleCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicDistributionResourceModuleCriteria.ID.eq();
		businessLogicDistributionResourceModuleCriteria.setMaxResults(ROW_COUNT);
		businesslogic.distribution.resource.Module[] businessLogicDistributionResourceModules = businessLogicDistributionResourceModuleCriteria.listModule();
		length =businessLogicDistributionResourceModules== null ? 0 : Math.min(businessLogicDistributionResourceModules.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicDistributionResourceModules[i]);
		}
		System.out.println(length + " Module record(s) retrieved."); 
		
		System.out.println("Listing Specialty by Criteria...");
		businesslogic.accounting.job.SpecialtyCriteria businessLogicAccountingJobSpecialtyCriteria = new businesslogic.accounting.job.SpecialtyCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicAccountingJobSpecialtyCriteria.ID.eq();
		businessLogicAccountingJobSpecialtyCriteria.setMaxResults(ROW_COUNT);
		businesslogic.accounting.job.Specialty[] businessLogicAccountingJobSpecialtys = businessLogicAccountingJobSpecialtyCriteria.listSpecialty();
		length =businessLogicAccountingJobSpecialtys== null ? 0 : Math.min(businessLogicAccountingJobSpecialtys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicAccountingJobSpecialtys[i]);
		}
		System.out.println(length + " Specialty record(s) retrieved."); 
		
		System.out.println("Listing HumanResource by Criteria...");
		businesslogic.distribution.resource.HumanResourceCriteria businessLogicDistributionResourceHumanResourceCriteria = new businesslogic.distribution.resource.HumanResourceCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicDistributionResourceHumanResourceCriteria.ID.eq();
		businessLogicDistributionResourceHumanResourceCriteria.setMaxResults(ROW_COUNT);
		businesslogic.distribution.resource.HumanResource[] businessLogicDistributionResourceHumanResources = businessLogicDistributionResourceHumanResourceCriteria.listHumanResource();
		length =businessLogicDistributionResourceHumanResources== null ? 0 : Math.min(businessLogicDistributionResourceHumanResources.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicDistributionResourceHumanResources[i]);
		}
		System.out.println(length + " HumanResource record(s) retrieved."); 
		
		System.out.println("Listing Requirement by Criteria...");
		businesslogic.distribution.requirement.RequirementCriteria businessLogicDistributionRequirementRequirementCriteria = new businesslogic.distribution.requirement.RequirementCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicDistributionRequirementRequirementCriteria.ID.eq();
		businessLogicDistributionRequirementRequirementCriteria.setMaxResults(ROW_COUNT);
		businesslogic.distribution.requirement.Requirement[] businessLogicDistributionRequirementRequirements = businessLogicDistributionRequirementRequirementCriteria.listRequirement();
		length =businessLogicDistributionRequirementRequirements== null ? 0 : Math.min(businessLogicDistributionRequirementRequirements.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicDistributionRequirementRequirements[i]);
		}
		System.out.println(length + " Requirement record(s) retrieved."); 
		
		System.out.println("Listing FinancialResource by Criteria...");
		businesslogic.distribution.resource.FinancialResourceCriteria businessLogicDistributionResourceFinancialResourceCriteria = new businesslogic.distribution.resource.FinancialResourceCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicDistributionResourceFinancialResourceCriteria.ID.eq();
		businessLogicDistributionResourceFinancialResourceCriteria.setMaxResults(ROW_COUNT);
		businesslogic.distribution.resource.FinancialResource[] businessLogicDistributionResourceFinancialResources = businessLogicDistributionResourceFinancialResourceCriteria.listFinancialResource();
		length =businessLogicDistributionResourceFinancialResources== null ? 0 : Math.min(businessLogicDistributionResourceFinancialResources.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicDistributionResourceFinancialResources[i]);
		}
		System.out.println(length + " FinancialResource record(s) retrieved."); 
		
		System.out.println("Listing PhysicalResource by Criteria...");
		businesslogic.distribution.resource.PhysicalResourceCriteria businessLogicDistributionResourcePhysicalResourceCriteria = new businesslogic.distribution.resource.PhysicalResourceCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicDistributionResourcePhysicalResourceCriteria.ID.eq();
		businessLogicDistributionResourcePhysicalResourceCriteria.setMaxResults(ROW_COUNT);
		businesslogic.distribution.resource.PhysicalResource[] businessLogicDistributionResourcePhysicalResources = businessLogicDistributionResourcePhysicalResourceCriteria.listPhysicalResource();
		length =businessLogicDistributionResourcePhysicalResources== null ? 0 : Math.min(businessLogicDistributionResourcePhysicalResources.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicDistributionResourcePhysicalResources[i]);
		}
		System.out.println(length + " PhysicalResource record(s) retrieved."); 
		
		System.out.println("Listing Admin by Criteria...");
		businesslogic.accounting.user.AdminCriteria businessLogicAccountingUserAdminCriteria = new businesslogic.accounting.user.AdminCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicAccountingUserAdminCriteria.ID.eq();
		businessLogicAccountingUserAdminCriteria.setMaxResults(ROW_COUNT);
		businesslogic.accounting.user.Admin[] businessLogicAccountingUserAdmins = businessLogicAccountingUserAdminCriteria.listAdmin();
		length =businessLogicAccountingUserAdmins== null ? 0 : Math.min(businessLogicAccountingUserAdmins.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicAccountingUserAdmins[i]);
		}
		System.out.println(length + " Admin record(s) retrieved."); 
		
		System.out.println("Listing Manager by Criteria...");
		businesslogic.accounting.user.ManagerCriteria businessLogicAccountingUserManagerCriteria = new businesslogic.accounting.user.ManagerCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicAccountingUserManagerCriteria.ID.eq();
		businessLogicAccountingUserManagerCriteria.setMaxResults(ROW_COUNT);
		businesslogic.accounting.user.Manager[] businessLogicAccountingUserManagers = businessLogicAccountingUserManagerCriteria.listManager();
		length =businessLogicAccountingUserManagers== null ? 0 : Math.min(businessLogicAccountingUserManagers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicAccountingUserManagers[i]);
		}
		System.out.println(length + " Manager record(s) retrieved."); 
		
		System.out.println("Listing MiddleLevelManager by Criteria...");
		businesslogic.accounting.user.MiddleLevelManagerCriteria businessLogicAccountingUserMiddleLevelManagerCriteria = new businesslogic.accounting.user.MiddleLevelManagerCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicAccountingUserMiddleLevelManagerCriteria.ID.eq();
		businessLogicAccountingUserMiddleLevelManagerCriteria.setMaxResults(ROW_COUNT);
		businesslogic.accounting.user.MiddleLevelManager[] businessLogicAccountingUserMiddleLevelManagers = businessLogicAccountingUserMiddleLevelManagerCriteria.listMiddleLevelManager();
		length =businessLogicAccountingUserMiddleLevelManagers== null ? 0 : Math.min(businessLogicAccountingUserMiddleLevelManagers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicAccountingUserMiddleLevelManagers[i]);
		}
		System.out.println(length + " MiddleLevelManager record(s) retrieved."); 
		
		System.out.println("Listing Employee by Criteria...");
		businesslogic.accounting.user.EmployeeCriteria businessLogicAccountingUserEmployeeCriteria = new businesslogic.accounting.user.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicAccountingUserEmployeeCriteria.ID.eq();
		businessLogicAccountingUserEmployeeCriteria.setMaxResults(ROW_COUNT);
		businesslogic.accounting.user.Employee[] businessLogicAccountingUserEmployees = businessLogicAccountingUserEmployeeCriteria.listEmployee();
		length =businessLogicAccountingUserEmployees== null ? 0 : Math.min(businessLogicAccountingUserEmployees.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicAccountingUserEmployees[i]);
		}
		System.out.println(length + " Employee record(s) retrieved."); 
		
		System.out.println("Listing ProjectManagement by Criteria...");
		businesslogic.accounting.job.ProjectManagementCriteria businessLogicAccountingJobProjectManagementCriteria = new businesslogic.accounting.job.ProjectManagementCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicAccountingJobProjectManagementCriteria.ID.eq();
		businessLogicAccountingJobProjectManagementCriteria.setMaxResults(ROW_COUNT);
		businesslogic.accounting.job.ProjectManagement[] businessLogicAccountingJobProjectManagements = businessLogicAccountingJobProjectManagementCriteria.listProjectManagement();
		length =businessLogicAccountingJobProjectManagements== null ? 0 : Math.min(businessLogicAccountingJobProjectManagements.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicAccountingJobProjectManagements[i]);
		}
		System.out.println(length + " ProjectManagement record(s) retrieved."); 
		
		System.out.println("Listing ResourceManagement by Criteria...");
		ResourceManagementCriteria businessLogicAccountingResourceManagementCriteria = new ResourceManagementCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicAccountingResourceManagementCriteria.ID.eq();
		businessLogicAccountingResourceManagementCriteria.setMaxResults(ROW_COUNT);
		ResourceManagement[] businessLogicAccountingResourceManagements = businessLogicAccountingResourceManagementCriteria.listResourceManagement();
		length =businessLogicAccountingResourceManagements== null ? 0 : Math.min(businessLogicAccountingResourceManagements.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicAccountingResourceManagements[i]);
		}
		System.out.println(length + " ResourceManagement record(s) retrieved."); 
		
		System.out.println("Listing Programming by Criteria...");
		businesslogic.accounting.job.ProgrammingCriteria businessLogicAccountingJobProgrammingCriteria = new businesslogic.accounting.job.ProgrammingCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicAccountingJobProgrammingCriteria.ID.eq();
		businessLogicAccountingJobProgrammingCriteria.setMaxResults(ROW_COUNT);
		businesslogic.accounting.job.Programming[] businessLogicAccountingJobProgrammings = businessLogicAccountingJobProgrammingCriteria.listProgramming();
		length =businessLogicAccountingJobProgrammings== null ? 0 : Math.min(businessLogicAccountingJobProgrammings.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicAccountingJobProgrammings[i]);
		}
		System.out.println(length + " Programming record(s) retrieved."); 
		
		System.out.println("Listing ModuleChange by Criteria...");
		businesslogic.distribution.resource.ModuleChangeCriteria businessLogicDistributionResourceModuleChangeCriteria = new businesslogic.distribution.resource.ModuleChangeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicDistributionResourceModuleChangeCriteria.ID.eq();
		businessLogicDistributionResourceModuleChangeCriteria.setMaxResults(ROW_COUNT);
		businesslogic.distribution.resource.ModuleChange[] businessLogicDistributionResourceModuleChanges = businessLogicDistributionResourceModuleChangeCriteria.listModuleChange();
		length =businessLogicDistributionResourceModuleChanges== null ? 0 : Math.min(businessLogicDistributionResourceModuleChanges.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicDistributionResourceModuleChanges[i]);
		}
		System.out.println(length + " ModuleChange record(s) retrieved."); 
		
		System.out.println("Listing SystemConfiguration by Criteria...");
		businesslogic.support.SystemConfigurationCriteria businessLogicSupportSystemConfigurationCriteria = new businesslogic.support.SystemConfigurationCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicSupportSystemConfigurationCriteria.ID.eq();
		businessLogicSupportSystemConfigurationCriteria.setMaxResults(ROW_COUNT);
		businesslogic.support.SystemConfiguration[] businessLogicSupportSystemConfigurations = businessLogicSupportSystemConfigurationCriteria.listSystemConfiguration();
		length =businessLogicSupportSystemConfigurations== null ? 0 : Math.min(businessLogicSupportSystemConfigurations.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicSupportSystemConfigurations[i]);
		}
		System.out.println(length + " SystemConfiguration record(s) retrieved."); 
		
		System.out.println("Listing Allocation by Criteria...");
		businesslogic.distribution.Allocation_Criteria businessLogicDistributionAllocation_Criteria = new businesslogic.distribution.Allocation_Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicDistributionAllocation_Criteria.ID.eq();
		businessLogicDistributionAllocation_Criteria.setMaxResults(ROW_COUNT);
		Allocation[] businessLogicDistributionAllocation_s = businessLogicDistributionAllocation_Criteria.listAllocation_();
		length =businessLogicDistributionAllocation_s== null ? 0 : Math.min(businessLogicDistributionAllocation_s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicDistributionAllocation_s[i]);
		}
		System.out.println(length + " Allocation record(s) retrieved.");
		
		System.out.println("Listing HighLevelManager by Criteria...");
		businesslogic.accounting.user.HighLevelManagerCriteria businessLogicAccountingUserHighLevelManagerCriteria = new businesslogic.accounting.user.HighLevelManagerCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicAccountingUserHighLevelManagerCriteria.ID.eq();
		businessLogicAccountingUserHighLevelManagerCriteria.setMaxResults(ROW_COUNT);
		businesslogic.accounting.user.HighLevelManager[] businessLogicAccountingUserHighLevelManagers = businessLogicAccountingUserHighLevelManagerCriteria.listHighLevelManager();
		length =businessLogicAccountingUserHighLevelManagers== null ? 0 : Math.min(businessLogicAccountingUserHighLevelManagers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicAccountingUserHighLevelManagers[i]);
		}
		System.out.println(length + " HighLevelManager record(s) retrieved.");

		
		System.out.println("Listing Notification by Criteria...");
		businesslogic.utility.NotificationCriteria businessLogicUtilityNotificationCriteria = new businesslogic.utility.NotificationCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicUtilityNotificationCriteria.ID.eq();
		businessLogicUtilityNotificationCriteria.setMaxResults(ROW_COUNT);
		businesslogic.utility.Notification[] businessLogicUtilityNotifications = businessLogicUtilityNotificationCriteria.listNotification();
		length =businessLogicUtilityNotifications== null ? 0 : Math.min(businessLogicUtilityNotifications.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicUtilityNotifications[i]);
		}
		System.out.println(length + " Notification record(s) retrieved.");
		
		System.out.println("Listing Email by Criteria...");
		network.EmailCriteria networkEmailCriteria = new network.EmailCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//networkEmailCriteria.ID.eq();
		networkEmailCriteria.setMaxResults(ROW_COUNT);
		network.Email[] networkEmails = networkEmailCriteria.listEmail();
		length =networkEmails== null ? 0 : Math.min(networkEmails.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(networkEmails[i]);
		}
		System.out.println(length + " Email record(s) retrieved."); 
		
		System.out.println("Listing UserJob by Criteria...");
		businesslogic.accounting.job.UserJobCriteria businessLogicAccountingJobUserJobCriteria = new businesslogic.accounting.job.UserJobCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicAccountingJobUserJobCriteria.ID.eq();
		businessLogicAccountingJobUserJobCriteria.setMaxResults(ROW_COUNT);
		businesslogic.accounting.job.UserJob[] businessLogicAccountingJobUserJobs = businessLogicAccountingJobUserJobCriteria.listUserJob();
		length =businessLogicAccountingJobUserJobs== null ? 0 : Math.min(businessLogicAccountingJobUserJobs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicAccountingJobUserJobs[i]);
		}
		System.out.println(length + " UserJob record(s) retrieved."); 
		
		System.out.println("Listing ResourceAllocation by Criteria...");
		businesslogic.distribution.ResourceAllocationCriteria businessLogicDistributionResourceAllocationCriteria = new businesslogic.distribution.ResourceAllocationCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//businessLogicDistributionResourceAllocationCriteria.ID.eq();
		businessLogicDistributionResourceAllocationCriteria.setMaxResults(ROW_COUNT);
		businesslogic.distribution.ResourceAllocation[] businessLogicDistributionResourceAllocations = businessLogicDistributionResourceAllocationCriteria.listResourceAllocation();
		length =businessLogicDistributionResourceAllocations== null ? 0 : Math.min(businessLogicDistributionResourceAllocations.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(businessLogicDistributionResourceAllocations[i]);
		}
		System.out.println(length + " ResourceAllocation record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListOODData listOODData = new ListOODData();
			try {
				listOODData.listTestData();
				//listOODData.listByCriteria();
			}
			finally {
				OODPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
