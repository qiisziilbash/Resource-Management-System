/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.OODPersistentManager;
import businesslogic.accounting.job.ResourceManagement;
import businesslogic.accounting.job.ResourceManagementDAO;
import businesslogic.distribution.Allocation;

public class CreateOODData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = OODPersistentManager.instance().getSession().beginTransaction();
		try {
			businesslogic.accounting.user.User businessLogicAccountingUserUser = businesslogic.accounting.user.UserDAO.createUser();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : userJobs, emails, approved, user
			businesslogic.accounting.user.UserDAO.save(businessLogicAccountingUserUser);
			businesslogic.accounting.job.Job businessLogicAccountingJobJob = businesslogic.accounting.job.JobDAO.createJob();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : userJobs
			businesslogic.accounting.job.JobDAO.save(businessLogicAccountingJobJob);
			businesslogic.distribution.resource.Resource businessLogicDistributionResourceResource = businesslogic.distribution.resource.ResourceDAO.createResource();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : resourceAllocations, uniqueIdentifier, resourceState
			businesslogic.distribution.resource.ResourceDAO.save(businessLogicDistributionResourceResource);
			businesslogic.distribution.resource.InformationResource businessLogicDistributionResourceInformationResource = businesslogic.distribution.resource.InformationResourceDAO.createInformationResource();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : requirements, allocation_s
			businesslogic.distribution.resource.InformationResourceDAO.save(businessLogicDistributionResourceInformationResource);
			businesslogic.distribution.resource.Project businessLogicDistributionResourceProject = businesslogic.distribution.resource.ProjectDAO.createProject();
			// Initialize the properties of the persistent object here
			businesslogic.distribution.resource.ProjectDAO.save(businessLogicDistributionResourceProject);
			businesslogic.distribution.resource.System businessLogicDistributionResourceSystem = businesslogic.distribution.resource.SystemDAO.createSystem();
			// Initialize the properties of the persistent object here
			businesslogic.distribution.resource.SystemDAO.save(businessLogicDistributionResourceSystem);
			businesslogic.distribution.resource.Subsystem businessLogicDistributionResourceSubsystem = businesslogic.distribution.resource.SubsystemDAO.createSubsystem();
			// Initialize the properties of the persistent object here
			businesslogic.distribution.resource.SubsystemDAO.save(businessLogicDistributionResourceSubsystem);
			businesslogic.distribution.resource.Module businessLogicDistributionResourceModule = businesslogic.distribution.resource.ModuleDAO.createModule();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : moduleChanges, specialties
			businesslogic.distribution.resource.ModuleDAO.save(businessLogicDistributionResourceModule);
			businesslogic.accounting.job.Specialty businessLogicAccountingJobSpecialty = businesslogic.accounting.job.SpecialtyDAO.createSpecialty();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : proficiencyLevel
			businesslogic.accounting.job.SpecialtyDAO.save(businessLogicAccountingJobSpecialty);
			businesslogic.distribution.resource.HumanResource businessLogicDistributionResourceHumanResource = businesslogic.distribution.resource.HumanResourceDAO.createHumanResource();
			// Initialize the properties of the persistent object here
			businesslogic.distribution.resource.HumanResourceDAO.save(businessLogicDistributionResourceHumanResource);
			businesslogic.distribution.requirement.Requirement businessLogicDistributionRequirementRequirement = businesslogic.distribution.requirement.RequirementDAO.createRequirement();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : requirementPriority
			businesslogic.distribution.requirement.RequirementDAO.save(businessLogicDistributionRequirementRequirement);
			businesslogic.distribution.resource.FinancialResource businessLogicDistributionResourceFinancialResource = businesslogic.distribution.resource.FinancialResourceDAO.createFinancialResource();
			// Initialize the properties of the persistent object here
			businesslogic.distribution.resource.FinancialResourceDAO.save(businessLogicDistributionResourceFinancialResource);
			businesslogic.distribution.resource.PhysicalResource businessLogicDistributionResourcePhysicalResource = businesslogic.distribution.resource.PhysicalResourceDAO.createPhysicalResource();
			// Initialize the properties of the persistent object here
			businesslogic.distribution.resource.PhysicalResourceDAO.save(businessLogicDistributionResourcePhysicalResource);
			businesslogic.accounting.user.Admin businessLogicAccountingUserAdmin = businesslogic.accounting.user.AdminDAO.createAdmin();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : systemConfigurations
			businesslogic.accounting.user.AdminDAO.save(businessLogicAccountingUserAdmin);
			businesslogic.accounting.user.Manager businessLogicAccountingUserManager = businesslogic.accounting.user.ManagerDAO.createManager();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : users, jobs
			businesslogic.accounting.user.ManagerDAO.save(businessLogicAccountingUserManager);
			businesslogic.accounting.user.MiddleLevelManager businessLogicAccountingUserMiddleLevelManager = businesslogic.accounting.user.MiddleLevelManagerDAO.createMiddleLevelManager();
			// Initialize the properties of the persistent object here
			businesslogic.accounting.user.MiddleLevelManagerDAO.save(businessLogicAccountingUserMiddleLevelManager);
			businesslogic.accounting.user.Employee businessLogicAccountingUserEmployee = businesslogic.accounting.user.EmployeeDAO.createEmployee();
			// Initialize the properties of the persistent object here
			businesslogic.accounting.user.EmployeeDAO.save(businessLogicAccountingUserEmployee);
			businesslogic.accounting.job.ProjectManagement businessLogicAccountingJobProjectManagement = businesslogic.accounting.job.ProjectManagementDAO.createProjectManagement();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : notification, requirements, specialties
			businesslogic.accounting.job.ProjectManagementDAO.save(businessLogicAccountingJobProjectManagement);
			ResourceManagement businessLogicAccountingResourceManagement = ResourceManagementDAO.createResourceManagement();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : allocation_s, resources
			ResourceManagementDAO.save(businessLogicAccountingResourceManagement);
			businesslogic.accounting.job.Programming businessLogicAccountingJobProgramming = businesslogic.accounting.job.ProgrammingDAO.createProgramming();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : moduleChanges
			businesslogic.accounting.job.ProgrammingDAO.save(businessLogicAccountingJobProgramming);
			businesslogic.distribution.resource.ModuleChange businessLogicDistributionResourceModuleChange = businesslogic.distribution.resource.ModuleChangeDAO.createModuleChange();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : date
			businesslogic.distribution.resource.ModuleChangeDAO.save(businessLogicDistributionResourceModuleChange);
			businesslogic.support.SystemConfiguration businessLogicSupportSystemConfiguration = businesslogic.support.SystemConfigurationDAO.createSystemConfiguration();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : backupPreiodDays
			businesslogic.support.SystemConfigurationDAO.save(businessLogicSupportSystemConfiguration);
			Allocation businessLogicDistributionAllocation_ = businesslogic.distribution.Allocation_DAO.createAllocation_();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : resourceAllocations, allocated
			businesslogic.distribution.Allocation_DAO.save(businessLogicDistributionAllocation_);
			businesslogic.accounting.user.HighLevelManager businessLogicAccountingUserHighLevelManager = businesslogic.accounting.user.HighLevelManagerDAO.createHighLevelManager();
			// Initialize the properties of the persistent object here
			businesslogic.accounting.user.HighLevelManagerDAO.save(businessLogicAccountingUserHighLevelManager);
			businesslogic.utility.Notification businessLogicUtilityNotification = businesslogic.utility.NotificationDAO.createNotification();
			// Initialize the properties of the persistent object here
			businesslogic.utility.NotificationDAO.save(businessLogicUtilityNotification);
			// Initialize the properties of the persistent object here
			network.Email networkEmail = network.EmailDAO.createEmail();
			// Initialize the properties of the persistent object here
			network.EmailDAO.save(networkEmail);
			businesslogic.accounting.job.UserJob businessLogicAccountingJobUserJob = businesslogic.accounting.job.UserJobDAO.createUserJob();
			// Initialize the properties of the persistent object here
			businesslogic.accounting.job.UserJobDAO.save(businessLogicAccountingJobUserJob);
			businesslogic.distribution.ResourceAllocation businessLogicDistributionResourceAllocation = businesslogic.distribution.ResourceAllocationDAO.createResourceAllocation();
			// Initialize the properties of the persistent object here
			businesslogic.distribution.ResourceAllocationDAO.save(businessLogicDistributionResourceAllocation);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateOODData createOODData = new CreateOODData();
			try {
				createOODData.createTestData();
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
