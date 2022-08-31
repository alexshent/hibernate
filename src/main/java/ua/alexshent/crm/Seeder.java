package ua.alexshent.crm;

import ua.alexshent.crm.entities.enumerations.*;

import javax.persistence.EntityManager;

public class Seeder {
    EntityManager entityManager;

    public Seeder(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    void createEmployeeStatuses() {
        long count = (long) entityManager.createQuery("SELECT COUNT(e) FROM EmployeeStatus e").getSingleResult();
        if (count > 0) {
            return;
        }

        EmployeeStatus employeeStatus = new EmployeeStatus();
        employeeStatus.setName("Active");
        entityManager.persist(employeeStatus);

        employeeStatus = new EmployeeStatus();
        employeeStatus.setName("Dismissed");
        entityManager.persist(employeeStatus);

        employeeStatus = new EmployeeStatus();
        employeeStatus.setName("On Leave");
        entityManager.persist(employeeStatus);
    }

    void createLeadSources() {
        long count = (long) entityManager.createQuery("SELECT COUNT(e) FROM LeadSource e").getSingleResult();
        if (count > 0) {
            return;
        }

        LeadSource leadSource = new LeadSource();
        leadSource.setName("Cold Call");
        entityManager.persist(leadSource);

        leadSource = new LeadSource();
        leadSource.setName("Existing Customer");
        entityManager.persist(leadSource);

        leadSource = new LeadSource();
        leadSource.setName("Self Generated");
        entityManager.persist(leadSource);

        leadSource = new LeadSource();
        leadSource.setName("Employee");
        entityManager.persist(leadSource);

        leadSource = new LeadSource();
        leadSource.setName("Partner");
        entityManager.persist(leadSource);

        leadSource = new LeadSource();
        leadSource.setName("Public Relations");
        entityManager.persist(leadSource);

        leadSource = new LeadSource();
        leadSource.setName("Direct Mail");
        entityManager.persist(leadSource);

        leadSource = new LeadSource();
        leadSource.setName("Conference");
        entityManager.persist(leadSource);

        leadSource = new LeadSource();
        leadSource.setName("Trade Show");
        entityManager.persist(leadSource);

        leadSource = new LeadSource();
        leadSource.setName("Web Site");
        entityManager.persist(leadSource);

        leadSource = new LeadSource();
        leadSource.setName("Word Of Mouth");
        entityManager.persist(leadSource);

        leadSource = new LeadSource();
        leadSource.setName("Email");
        entityManager.persist(leadSource);

        leadSource = new LeadSource();
        leadSource.setName("Campaign");
        entityManager.persist(leadSource);

        leadSource = new LeadSource();
        leadSource.setName("Other");
        entityManager.persist(leadSource);
    }

    void createLeadStatuses() {
        long count = (long) entityManager.createQuery("SELECT COUNT(e) FROM LeadStatus e").getSingleResult();
        if (count > 0) {
            return;
        }

        LeadStatus leadStatus = new LeadStatus();
        leadStatus.setName("New");
        entityManager.persist(leadStatus);

        leadStatus = new LeadStatus();
        leadStatus.setName("Assigned");
        entityManager.persist(leadStatus);

        leadStatus = new LeadStatus();
        leadStatus.setName("In Process");
        entityManager.persist(leadStatus);

        leadStatus = new LeadStatus();
        leadStatus.setName("Converted");
        entityManager.persist(leadStatus);

        leadStatus = new LeadStatus();
        leadStatus.setName("Recycled");
        entityManager.persist(leadStatus);

        leadStatus = new LeadStatus();
        leadStatus.setName("Dead");
        entityManager.persist(leadStatus);
    }

    void createAccountTypes() {
        long count = (long) entityManager.createQuery("SELECT COUNT(e) FROM AccountType e").getSingleResult();
        if (count > 0) {
            return;
        }

        AccountType accountType = new AccountType();
        accountType.setName("Analyst");
        entityManager.persist(accountType);

        accountType = new AccountType();
        accountType.setName("Competitor");
        entityManager.persist(accountType);

        accountType = new AccountType();
        accountType.setName("Customer");
        entityManager.persist(accountType);

        accountType = new AccountType();
        accountType.setName("Integrator");
        entityManager.persist(accountType);

        accountType = new AccountType();
        accountType.setName("Investor");
        entityManager.persist(accountType);

        accountType = new AccountType();
        accountType.setName("Partner");
        entityManager.persist(accountType);

        accountType = new AccountType();
        accountType.setName("Press");
        entityManager.persist(accountType);

        accountType = new AccountType();
        accountType.setName("Prospect");
        entityManager.persist(accountType);

        accountType = new AccountType();
        accountType.setName("Reseller");
        entityManager.persist(accountType);

        accountType = new AccountType();
        accountType.setName("Other");
        entityManager.persist(accountType);
    }

    void createIndustries() {
        long count = (long) entityManager.createQuery("SELECT COUNT(e) FROM Industry e").getSingleResult();
        if (count > 0) {
            return;
        }

        Industry industry = new Industry();
        industry.setName("Apparel");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Banking");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Biotechnology");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Chemicals");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Communications");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Construction");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Consulting");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Education");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Electronics");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Energy");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Engineering");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Entertainment");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Environmental");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Finance");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Government");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Healthcare");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Hospitality");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Insurance");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Machinery");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Manufacturing");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Media");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Not For Profit");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Recreation");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Retail");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Shipping");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Technology");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Telecommunications");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Transportation");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Utilities");
        entityManager.persist(industry);

        industry = new Industry();
        industry.setName("Other");
        entityManager.persist(industry);
    }

    void createSalesStages() {
        long count = (long) entityManager.createQuery("SELECT COUNT(e) FROM SalesStage e").getSingleResult();
        if (count > 0) {
            return;
        }

        SalesStage salesStage = new SalesStage();
        salesStage.setName("Prospecting");
        entityManager.persist(salesStage);

        salesStage = new SalesStage();
        salesStage.setName("Qualification");
        entityManager.persist(salesStage);

        salesStage = new SalesStage();
        salesStage.setName("Needs Analysis");
        entityManager.persist(salesStage);

        salesStage = new SalesStage();
        salesStage.setName("Value Proposition");
        entityManager.persist(salesStage);

        salesStage = new SalesStage();
        salesStage.setName("Identifying Decision Makers");
        entityManager.persist(salesStage);

        salesStage = new SalesStage();
        salesStage.setName("Perception Analysis");
        entityManager.persist(salesStage);

        salesStage = new SalesStage();
        salesStage.setName("Proposal/Price Quote");
        entityManager.persist(salesStage);

        salesStage = new SalesStage();
        salesStage.setName("Negotiation/Review");
        entityManager.persist(salesStage);

        salesStage = new SalesStage();
        salesStage.setName("Closed Won");
        entityManager.persist(salesStage);

        salesStage = new SalesStage();
        salesStage.setName("Closed Lost");
        entityManager.persist(salesStage);
    }

    void createOpportunityTypes() {
        long count = (long) entityManager.createQuery("SELECT COUNT(e) FROM OpportunityType e").getSingleResult();
        if (count > 0) {
            return;
        }

        OpportunityType opportunityType = new OpportunityType();
        opportunityType.setName("Existing Business");
        entityManager.persist(opportunityType);

        opportunityType = new OpportunityType();
        opportunityType.setName("New Business");
        entityManager.persist(opportunityType);
    }

    void seed() {
        createEmployeeStatuses();
        createLeadSources();
        createLeadStatuses();
        createAccountTypes();
        createIndustries();
        createSalesStages();
        createOpportunityTypes();
    }
}
