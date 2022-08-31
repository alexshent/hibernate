package ua.alexshent.crm;

import ua.alexshent.crm.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Demo {
    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;

    Demo() {
        entityManagerFactory = Persistence.createEntityManagerFactory("crm-pu");
        entityManager = entityManagerFactory.createEntityManager();
    }

    void createEntities() {
        EnumerationCache enumerationCache = new EnumerationCache(entityManager);
        TelephoneNumberBuilder telephoneNumberBuilder = new TelephoneNumberBuilder();
        EmailAddressBuilder emailAddressBuilder = new EmailAddressBuilder();
        AddressBuilder addressBuilder = new AddressBuilder();

        // create boss

        Employee bossEmployee = new Employee();
        entityManager.persist(bossEmployee);

        bossEmployee.setFirstName("Босс");
        bossEmployee.setLastName("Большой");
        bossEmployee.setJobTitle("умывальников начальник и мочалок командир");
        bossEmployee.setDepartment("отдел перекладывания бумажек из левого ящика в правый");
        bossEmployee.setNotes("очень солидный дядька");

        bossEmployee.setStatus(enumerationCache.getEmployeeStatuses().get("Active"));

        telephoneNumberBuilder.withNumber("12345");
        bossEmployee.setOfficePhone(telephoneNumberBuilder.build());
        entityManager.persist(bossEmployee.getOfficePhone());

        telephoneNumberBuilder.withNumber("123450");
        bossEmployee.setMobilePhone(telephoneNumberBuilder.build());
        entityManager.persist(bossEmployee.getMobilePhone());

        emailAddressBuilder.withEmail("big.boss@mycompany.com");
        bossEmployee.setPrimaryEmail(emailAddressBuilder.build());
        entityManager.persist(bossEmployee.getPrimaryEmail());

        addressBuilder.withCountry("Ukraine").withState("Kyiv").withCity("Kyiv").withStreet("Azovska street, 12")
                .withPostalCode("03037");
        bossEmployee.setPrimaryAddress(addressBuilder.build());
        entityManager.persist(bossEmployee.getPrimaryAddress());

        // create worker that reports to the boss

        Employee workerEmployee = new Employee();
        entityManager.persist(workerEmployee);

        workerEmployee.setFirstName("Лох");
        workerEmployee.setLastName("Большой");
        workerEmployee.setJobTitle("умывальников работник и сортиров лучший друг");
        workerEmployee.setDepartment("отдел перекладывания бумажек из левого ящика в правый");
        workerEmployee.setNotes("лошара");

        workerEmployee.setStatus(enumerationCache.getEmployeeStatuses().get("On Leave"));

        telephoneNumberBuilder.withNumber("000888");
        workerEmployee.setOfficePhone(telephoneNumberBuilder.build());
        entityManager.persist(workerEmployee.getOfficePhone());

        telephoneNumberBuilder.withNumber("000999");
        workerEmployee.setMobilePhone(telephoneNumberBuilder.build());
        entityManager.persist(workerEmployee.getMobilePhone());

        emailAddressBuilder.withEmail("big.loh@mycompany.com");
        workerEmployee.setPrimaryEmail(emailAddressBuilder.build());
        entityManager.persist(workerEmployee.getPrimaryEmail());

        addressBuilder.withCountry("Ukraine").withState("Kyiv").withCity("Kyiv").withStreet("Azovska street, 12")
                .withPostalCode("03037");
        workerEmployee.setPrimaryAddress(addressBuilder.build());
        entityManager.persist(workerEmployee.getPrimaryAddress());

        workerEmployee.setReportsTo(bossEmployee);

        // create contact

        Contact contact = new Contact();
        entityManager.persist(contact);

        contact.setFirstName("Контактей");
        contact.setLastName("Контактов");
        contact.setJobTitle("старший копытщик");
        contact.setDepartment("отдел покраски копыт");

        telephoneNumberBuilder.withNumber("1234567890");
        contact.setOfficePhone(telephoneNumberBuilder.build());
        entityManager.persist(contact.getOfficePhone());

        telephoneNumberBuilder.withNumber("123456789000");
        contact.setMobilePhone(telephoneNumberBuilder.build());
        entityManager.persist(contact.getMobilePhone());

        contact.setCreatedAt(LocalDateTime.now());
        contact.setUpdatedAt(LocalDateTime.now());
        contact.setAssignedTo(bossEmployee);
        contact.setDescription("Очень громко разговаривает по телефону, даже кричит. Сил уже нет никаких.");
        contact.setLeadSource(enumerationCache.getLeadSources().get("Cold Call"));
        contact.setBirthday(LocalDate.of(1975, 3, 11));
        contact.setAssistantName("Вова Булкин");

        telephoneNumberBuilder.withNumber("998877");
        contact.setAssistantPhone(telephoneNumberBuilder.build());
        entityManager.persist(contact.getAssistantPhone());

        // create account

        Account account = new Account();
        entityManager.persist(account);

        Set<Contact> contacts = new HashSet<>();
        contacts.add(contact);
        account.setContacts(contacts);

        account.setName("ООО Рога и копыта");
        account.setWebsite("roga.com.ua");
        account.setDescription("надежная компания");

        EmailAddress primaryEmail3 = new EmailAddress();
        primaryEmail3.setEmail("hello@roga.com.ua");
        entityManager.persist(primaryEmail3);
        account.setPrimaryEmail(primaryEmail3);

        telephoneNumberBuilder.withNumber("45678");
        account.setOfficePhone(telephoneNumberBuilder.build());
        entityManager.persist(account.getOfficePhone());

        account.setType(enumerationCache.getAccountTypes().get("Reseller"));
        account.setAnnualRevenue(9999);
        account.setHeadcount(33);
        account.setCreatedAt(LocalDateTime.now());
        account.setUpdatedAt(LocalDateTime.now());
        account.setAssignedTo(bossEmployee);

        // create lead

        Lead lead = new Lead();
        entityManager.persist(lead);
        lead.setFirstName("Иван");
        lead.setLastName("Базаров");
        lead.setDepartment("отдел базарных дел");
        lead.setJobTitle("базарник");
        lead.setStatus(enumerationCache.getLeadStatuses().get("New"));
        lead.setOpportunityAmount(12345);
        lead.setAssignedTo(bossEmployee);
        lead.setAccount(account);

        // create opportunity

        Opportunity opportunity = new Opportunity();
        entityManager.persist(opportunity);
        opportunity.setName("Сделка 1");
        opportunity.setAccount(account);
        opportunity.setAmount(55678);
        opportunity.setProbability(60);
        opportunity.setSalesStage(enumerationCache.getSalesStages().get("Prospecting"));
        opportunity.setType(enumerationCache.getOpportunityTypes().get("Existing Business"));
    }
}
