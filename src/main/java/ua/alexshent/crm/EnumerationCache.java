package ua.alexshent.crm;

import ua.alexshent.crm.entities.enumerations.*;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnumerationCache {
    EntityManager entityManager;
    Map<String, EmployeeStatus> employeeStatuses;
    Map<String, AccountType> accountTypes;
    Map<String, LeadSource> leadSources;
    Map<String, LeadStatus> leadStatuses;
    Map<String, Industry> industries;
    Map<String, SalesStage> salesStages;
    Map<String, OpportunityType> opportunityTypes;

    public EnumerationCache(EntityManager entityManager) {
        this.entityManager = entityManager;

        employeeStatuses = new HashMap<>();
        accountTypes = new HashMap<>();
        leadSources = new HashMap<>();
        leadStatuses = new HashMap<>();
        industries = new HashMap<>();
        salesStages = new HashMap<>();
        opportunityTypes = new HashMap<>();

        List<EmployeeStatus> listEmployeeStatus = entityManager.createQuery("SELECT e FROM EmployeeStatus e").getResultList();
        listEmployeeStatus.forEach(es -> employeeStatuses.put(es.getName(), es));

        List<AccountType> listAccountType = entityManager.createQuery("SELECT e FROM AccountType e").getResultList();
        listAccountType.forEach(entity -> accountTypes.put(entity.getName(), entity));

        List<LeadSource> listLeadSource = entityManager.createQuery("SELECT e FROM LeadSource e").getResultList();
        listLeadSource.forEach(entity -> leadSources.put(entity.getName(), entity));

        List<LeadStatus> listLeadStatus = entityManager.createQuery("SELECT e FROM LeadStatus e").getResultList();
        listLeadStatus.forEach(entity -> leadStatuses.put(entity.getName(), entity));

        List<Industry> listIndustry = entityManager.createQuery("SELECT e FROM Industry e").getResultList();
        listIndustry.forEach(entity -> industries.put(entity.getName(), entity));

        List<SalesStage> listSalesStage = entityManager.createQuery("SELECT e FROM SalesStage e").getResultList();
        listSalesStage.forEach(entity -> salesStages.put(entity.getName(), entity));

        List<OpportunityType> listOpportunityType = entityManager.createQuery("SELECT e FROM OpportunityType e").getResultList();
        listOpportunityType.forEach(entity -> opportunityTypes.put(entity.getName(), entity));
    }

    public Map<String, EmployeeStatus> getEmployeeStatuses() {
        return employeeStatuses;
    }

    public Map<String, AccountType> getAccountTypes() {
        return accountTypes;
    }

    public Map<String, LeadSource> getLeadSources() {
        return leadSources;
    }

    public Map<String, LeadStatus> getLeadStatuses() {
        return leadStatuses;
    }

    public Map<String, Industry> getIndustries() {
        return industries;
    }

    public Map<String, SalesStage> getSalesStages() {
        return salesStages;
    }

    public Map<String, OpportunityType> getOpportunityTypes() {
        return opportunityTypes;
    }
}
