/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.OODPersistentManager;
import businesslogic.accounting.job.ResourceManagement;
import businesslogic.accounting.job.ResourceManagementCriteria;
import businesslogic.accounting.job.ResourceManagementDAO;
import businesslogic.distribution.Allocation;

public class RetrieveAndUpdateOODData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = OODPersistentManager.instance().getSession().beginTransaction();
		try {
			businesslogic.accounting.user.User businessLogicAccountingUserUser = businesslogic.accounting.user.UserDAO.loadUserByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.accounting.user.UserDAO.save(businessLogicAccountingUserUser);
			businesslogic.accounting.job.Job businessLogicAccountingJobJob = businesslogic.accounting.job.JobDAO.loadJobByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.accounting.job.JobDAO.save(businessLogicAccountingJobJob);
			businesslogic.distribution.resource.Resource businessLogicDistributionResourceResource = businesslogic.distribution.resource.ResourceDAO.loadResourceByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.distribution.resource.ResourceDAO.save(businessLogicDistributionResourceResource);
			businesslogic.distribution.resource.InformationResource businessLogicDistributionResourceInformationResource = businesslogic.distribution.resource.InformationResourceDAO.loadInformationResourceByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.distribution.resource.InformationResourceDAO.save(businessLogicDistributionResourceInformationResource);
			businesslogic.distribution.resource.Project businessLogicDistributionResourceProject = businesslogic.distribution.resource.ProjectDAO.loadProjectByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.distribution.resource.ProjectDAO.save(businessLogicDistributionResourceProject);
			businesslogic.distribution.resource.System businessLogicDistributionResourceSystem = businesslogic.distribution.resource.SystemDAO.loadSystemByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.distribution.resource.SystemDAO.save(businessLogicDistributionResourceSystem);
			businesslogic.distribution.resource.Subsystem businessLogicDistributionResourceSubsystem = businesslogic.distribution.resource.SubsystemDAO.loadSubsystemByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.distribution.resource.SubsystemDAO.save(businessLogicDistributionResourceSubsystem);
			businesslogic.distribution.resource.Module businessLogicDistributionResourceModule = businesslogic.distribution.resource.ModuleDAO.loadModuleByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.distribution.resource.ModuleDAO.save(businessLogicDistributionResourceModule);
			businesslogic.accounting.job.Specialty businessLogicAccountingJobSpecialty = businesslogic.accounting.job.SpecialtyDAO.loadSpecialtyByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.accounting.job.SpecialtyDAO.save(businessLogicAccountingJobSpecialty);
			businesslogic.distribution.resource.HumanResource businessLogicDistributionResourceHumanResource = businesslogic.distribution.resource.HumanResourceDAO.loadHumanResourceByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.distribution.resource.HumanResourceDAO.save(businessLogicDistributionResourceHumanResource);
			businesslogic.distribution.requirement.Requirement businessLogicDistributionRequirementRequirement = businesslogic.distribution.requirement.RequirementDAO.loadRequirementByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.distribution.requirement.RequirementDAO.save(businessLogicDistributionRequirementRequirement);
			businesslogic.distribution.resource.FinancialResource businessLogicDistributionResourceFinancialResource = businesslogic.distribution.resource.FinancialResourceDAO.loadFinancialResourceByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.distribution.resource.FinancialResourceDAO.save(businessLogicDistributionResourceFinancialResource);
			businesslogic.distribution.resource.PhysicalResource businessLogicDistributionResourcePhysicalResource = businesslogic.distribution.resource.PhysicalResourceDAO.loadPhysicalResourceByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.distribution.resource.PhysicalResourceDAO.save(businessLogicDistributionResourcePhysicalResource);
			businesslogic.accounting.user.Admin businessLogicAccountingUserAdmin = businesslogic.accounting.user.AdminDAO.loadAdminByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.accounting.user.AdminDAO.save(businessLogicAccountingUserAdmin);
			businesslogic.accounting.user.Manager businessLogicAccountingUserManager = businesslogic.accounting.user.ManagerDAO.loadManagerByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.accounting.user.ManagerDAO.save(businessLogicAccountingUserManager);
			businesslogic.accounting.user.MiddleLevelManager businessLogicAccountingUserMiddleLevelManager = businesslogic.accounting.user.MiddleLevelManagerDAO.loadMiddleLevelManagerByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.accounting.user.MiddleLevelManagerDAO.save(businessLogicAccountingUserMiddleLevelManager);
			businesslogic.accounting.user.Employee businessLogicAccountingUserEmployee = businesslogic.accounting.user.EmployeeDAO.loadEmployeeByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.accounting.user.EmployeeDAO.save(businessLogicAccountingUserEmployee);
			businesslogic.accounting.job.ProjectManagement businessLogicAccountingJobProjectManagement = businesslogic.accounting.job.ProjectManagementDAO.loadProjectManagementByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.accounting.job.ProjectManagementDAO.save(businessLogicAccountingJobProjectManagement);
			ResourceManagement businessLogicAccountingResourceManagement = ResourceManagementDAO.loadResourceManagementByQuery(null, null);
			// Update the properties of the persistent object
			ResourceManagementDAO.save(businessLogicAccountingResourceManagement);
			businesslogic.accounting.job.Programming businessLogicAccountingJobProgramming = businesslogic.accounting.job.ProgrammingDAO.loadProgrammingByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.accounting.job.ProgrammingDAO.save(businessLogicAccountingJobProgramming);
			businesslogic.distribution.resource.ModuleChange businessLogicDistributionResourceModuleChange = businesslogic.distribution.resource.ModuleChangeDAO.loadModuleChangeByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.distribution.resource.ModuleChangeDAO.save(businessLogicDistributionResourceModuleChange);
			businesslogic.support.SystemConfiguration businessLogicSupportSystemConfiguration = businesslogic.support.SystemConfigurationDAO.loadSystemConfigurationByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.support.SystemConfigurationDAO.save(businessLogicSupportSystemConfiguration);
			Allocation businessLogicDistributionAllocation_ = businesslogic.distribution.Allocation_DAO.loadAllocation_ByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.distribution.Allocation_DAO.save(businessLogicDistributionAllocation_);
			businesslogic.accounting.user.HighLevelManager businessLogicAccountingUserHighLevelManager = businesslogic.accounting.user.HighLevelManagerDAO.loadHighLevelManagerByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.accounting.user.HighLevelManagerDAO.save(businessLogicAccountingUserHighLevelManager);
			businesslogic.utility.Notification businessLogicUtilityNotification = businesslogic.utility.NotificationDAO.loadNotificationByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.utility.NotificationDAO.save(businessLogicUtilityNotification);
			// Update the properties of the persistent object
			network.Email networkEmail = network.EmailDAO.loadEmailByQuery(null, null);
			// Update the properties of the persistent object
			network.EmailDAO.save(networkEmail);
			businesslogic.accounting.job.UserJob businessLogicAccountingJobUserJob = businesslogic.accounting.job.UserJobDAO.loadUserJobByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.accounting.job.UserJobDAO.save(businessLogicAccountingJobUserJob);
			businesslogic.distribution.ResourceAllocation businessLogicDistributionResourceAllocation = businesslogic.distribution.ResourceAllocationDAO.loadResourceAllocationByQuery(null, null);
			// Update the properties of the persistent object
			businesslogic.distribution.ResourceAllocationDAO.save(businessLogicDistributionResourceAllocation);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving User by UserCriteria");
		businesslogic.accounting.user.UserCriteria businessLogicAccountingUserUserCriteria = new businesslogic.accounting.user.UserCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicAccountingUserUserCriteria.ID.eq();
		System.out.println(businessLogicAccountingUserUserCriteria.uniqueUser());
		
		System.out.println("Retrieving Job by JobCriteria");
		businesslogic.accounting.job.JobCriteria businessLogicAccountingJobJobCriteria = new businesslogic.accounting.job.JobCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicAccountingJobJobCriteria.ID.eq();
		System.out.println(businessLogicAccountingJobJobCriteria.uniqueJob());
		
		System.out.println("Retrieving Resource by ResourceCriteria");
		businesslogic.distribution.resource.ResourceCriteria businessLogicDistributionResourceResourceCriteria = new businesslogic.distribution.resource.ResourceCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicDistributionResourceResourceCriteria.ID.eq();
		System.out.println(businessLogicDistributionResourceResourceCriteria.uniqueResource());
		
		System.out.println("Retrieving InformationResource by InformationResourceCriteria");
		businesslogic.distribution.resource.InformationResourceCriteria businessLogicDistributionResourceInformationResourceCriteria = new businesslogic.distribution.resource.InformationResourceCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicDistributionResourceInformationResourceCriteria.ID.eq();
		System.out.println(businessLogicDistributionResourceInformationResourceCriteria.uniqueInformationResource());
		
		System.out.println("Retrieving Project by ProjectCriteria");
		businesslogic.distribution.resource.ProjectCriteria businessLogicDistributionResourceProjectCriteria = new businesslogic.distribution.resource.ProjectCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicDistributionResourceProjectCriteria.ID.eq();
		System.out.println(businessLogicDistributionResourceProjectCriteria.uniqueProject());
		
		System.out.println("Retrieving System by SystemCriteria");
		businesslogic.distribution.resource.SystemCriteria businessLogicDistributionResourceSystemCriteria = new businesslogic.distribution.resource.SystemCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicDistributionResourceSystemCriteria.ID.eq();
		System.out.println(businessLogicDistributionResourceSystemCriteria.uniqueSystem());
		
		System.out.println("Retrieving Subsystem by SubsystemCriteria");
		businesslogic.distribution.resource.SubsystemCriteria businessLogicDistributionResourceSubsystemCriteria = new businesslogic.distribution.resource.SubsystemCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicDistributionResourceSubsystemCriteria.ID.eq();
		System.out.println(businessLogicDistributionResourceSubsystemCriteria.uniqueSubsystem());
		
		System.out.println("Retrieving Module by ModuleCriteria");
		businesslogic.distribution.resource.ModuleCriteria businessLogicDistributionResourceModuleCriteria = new businesslogic.distribution.resource.ModuleCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicDistributionResourceModuleCriteria.ID.eq();
		System.out.println(businessLogicDistributionResourceModuleCriteria.uniqueModule());
		
		System.out.println("Retrieving Specialty by SpecialtyCriteria");
		businesslogic.accounting.job.SpecialtyCriteria businessLogicAccountingJobSpecialtyCriteria = new businesslogic.accounting.job.SpecialtyCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicAccountingJobSpecialtyCriteria.ID.eq();
		System.out.println(businessLogicAccountingJobSpecialtyCriteria.uniqueSpecialty());
		
		System.out.println("Retrieving HumanResource by HumanResourceCriteria");
		businesslogic.distribution.resource.HumanResourceCriteria businessLogicDistributionResourceHumanResourceCriteria = new businesslogic.distribution.resource.HumanResourceCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicDistributionResourceHumanResourceCriteria.ID.eq();
		System.out.println(businessLogicDistributionResourceHumanResourceCriteria.uniqueHumanResource());
		
		System.out.println("Retrieving Requirement by RequirementCriteria");
		businesslogic.distribution.requirement.RequirementCriteria businessLogicDistributionRequirementRequirementCriteria = new businesslogic.distribution.requirement.RequirementCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicDistributionRequirementRequirementCriteria.ID.eq();
		System.out.println(businessLogicDistributionRequirementRequirementCriteria.uniqueRequirement());
		
		System.out.println("Retrieving FinancialResource by FinancialResourceCriteria");
		businesslogic.distribution.resource.FinancialResourceCriteria businessLogicDistributionResourceFinancialResourceCriteria = new businesslogic.distribution.resource.FinancialResourceCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicDistributionResourceFinancialResourceCriteria.ID.eq();
		System.out.println(businessLogicDistributionResourceFinancialResourceCriteria.uniqueFinancialResource());
		
		System.out.println("Retrieving PhysicalResource by PhysicalResourceCriteria");
		businesslogic.distribution.resource.PhysicalResourceCriteria businessLogicDistributionResourcePhysicalResourceCriteria = new businesslogic.distribution.resource.PhysicalResourceCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicDistributionResourcePhysicalResourceCriteria.ID.eq();
		System.out.println(businessLogicDistributionResourcePhysicalResourceCriteria.uniquePhysicalResource());
		
		System.out.println("Retrieving Admin by AdminCriteria");
		businesslogic.accounting.user.AdminCriteria businessLogicAccountingUserAdminCriteria = new businesslogic.accounting.user.AdminCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicAccountingUserAdminCriteria.ID.eq();
		System.out.println(businessLogicAccountingUserAdminCriteria.uniqueAdmin());
		
		System.out.println("Retrieving Manager by ManagerCriteria");
		businesslogic.accounting.user.ManagerCriteria businessLogicAccountingUserManagerCriteria = new businesslogic.accounting.user.ManagerCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicAccountingUserManagerCriteria.ID.eq();
		System.out.println(businessLogicAccountingUserManagerCriteria.uniqueManager());
		
		System.out.println("Retrieving MiddleLevelManager by MiddleLevelManagerCriteria");
		businesslogic.accounting.user.MiddleLevelManagerCriteria businessLogicAccountingUserMiddleLevelManagerCriteria = new businesslogic.accounting.user.MiddleLevelManagerCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicAccountingUserMiddleLevelManagerCriteria.ID.eq();
		System.out.println(businessLogicAccountingUserMiddleLevelManagerCriteria.uniqueMiddleLevelManager());
		
		System.out.println("Retrieving Employee by EmployeeCriteria");
		businesslogic.accounting.user.EmployeeCriteria businessLogicAccountingUserEmployeeCriteria = new businesslogic.accounting.user.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicAccountingUserEmployeeCriteria.ID.eq();
		System.out.println(businessLogicAccountingUserEmployeeCriteria.uniqueEmployee());
		
		System.out.println("Retrieving ProjectManagement by ProjectManagementCriteria");
		businesslogic.accounting.job.ProjectManagementCriteria businessLogicAccountingJobProjectManagementCriteria = new businesslogic.accounting.job.ProjectManagementCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicAccountingJobProjectManagementCriteria.ID.eq();
		System.out.println(businessLogicAccountingJobProjectManagementCriteria.uniqueProjectManagement());
		
		System.out.println("Retrieving ResourceManagement by ResourceManagementCriteria");
		ResourceManagementCriteria businessLogicAccountingResourceManagementCriteria = new ResourceManagementCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicAccountingResourceManagementCriteria.ID.eq();
		System.out.println(businessLogicAccountingResourceManagementCriteria.uniqueResourceManagement());
		
		System.out.println("Retrieving Programming by ProgrammingCriteria");
		businesslogic.accounting.job.ProgrammingCriteria businessLogicAccountingJobProgrammingCriteria = new businesslogic.accounting.job.ProgrammingCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicAccountingJobProgrammingCriteria.ID.eq();
		System.out.println(businessLogicAccountingJobProgrammingCriteria.uniqueProgramming());
		
		System.out.println("Retrieving ModuleChange by ModuleChangeCriteria");
		businesslogic.distribution.resource.ModuleChangeCriteria businessLogicDistributionResourceModuleChangeCriteria = new businesslogic.distribution.resource.ModuleChangeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicDistributionResourceModuleChangeCriteria.ID.eq();
		System.out.println(businessLogicDistributionResourceModuleChangeCriteria.uniqueModuleChange());
		
		System.out.println("Retrieving SystemConfiguration by SystemConfigurationCriteria");
		businesslogic.support.SystemConfigurationCriteria businessLogicSupportSystemConfigurationCriteria = new businesslogic.support.SystemConfigurationCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicSupportSystemConfigurationCriteria.ID.eq();
		System.out.println(businessLogicSupportSystemConfigurationCriteria.uniqueSystemConfiguration());
		
		System.out.println("Retrieving Allocation by Allocation_Criteria");
		businesslogic.distribution.Allocation_Criteria businessLogicDistributionAllocation_Criteria = new businesslogic.distribution.Allocation_Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicDistributionAllocation_Criteria.ID.eq();
		System.out.println(businessLogicDistributionAllocation_Criteria.uniqueAllocation_());
		
		System.out.println("Retrieving HighLevelManager by HighLevelManagerCriteria");
		businesslogic.accounting.user.HighLevelManagerCriteria businessLogicAccountingUserHighLevelManagerCriteria = new businesslogic.accounting.user.HighLevelManagerCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicAccountingUserHighLevelManagerCriteria.ID.eq();
		System.out.println(businessLogicAccountingUserHighLevelManagerCriteria.uniqueHighLevelManager());

		System.out.println("Retrieving Notification by NotificationCriteria");
		businesslogic.utility.NotificationCriteria businessLogicUtilityNotificationCriteria = new businesslogic.utility.NotificationCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicUtilityNotificationCriteria.ID.eq();
		System.out.println(businessLogicUtilityNotificationCriteria.uniqueNotification());
		
		System.out.println("Retrieving Email by EmailCriteria");
		network.EmailCriteria networkEmailCriteria = new network.EmailCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//networkEmailCriteria.ID.eq();
		System.out.println(networkEmailCriteria.uniqueEmail());
		
		System.out.println("Retrieving UserJob by SpecCriteria");
		businesslogic.accounting.job.UserJobCriteria businessLogicAccountingJobUserJobCriteria = new businesslogic.accounting.job.UserJobCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicAccountingJobUserJobCriteria.ID.eq();
		System.out.println(businessLogicAccountingJobUserJobCriteria.uniqueUserJob());
		
		System.out.println("Retrieving ResourceAllocation by ResourceAllocationCriteria");
		businesslogic.distribution.ResourceAllocationCriteria businessLogicDistributionResourceAllocationCriteria = new businesslogic.distribution.ResourceAllocationCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//businessLogicDistributionResourceAllocationCriteria.ID.eq();
		System.out.println(businessLogicDistributionResourceAllocationCriteria.uniqueResourceAllocation());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateOODData retrieveAndUpdateOODData = new RetrieveAndUpdateOODData();
			try {
				retrieveAndUpdateOODData.retrieveAndUpdateTestData();
				//retrieveAndUpdateOODData.retrieveByCriteria();
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
