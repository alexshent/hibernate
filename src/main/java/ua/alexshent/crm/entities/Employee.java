package ua.alexshent.crm.entities;

import ua.alexshent.crm.entities.enumerations.EmployeeStatus;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private UUID id;

    private String firstName;

    private String lastName;

    private String jobTitle;

    private String department;

    private String notes;

    @ManyToOne
    private EmployeeStatus status;

    @OneToOne
    private TelephoneNumber officePhone;

    @OneToOne
    private TelephoneNumber mobilePhone;

    @ManyToOne
    private Employee reportsTo;

    @OneToOne
    private EmailAddress primaryEmail;

    @OneToMany
    private Set<EmailAddress> alternateEmails;

    @OneToOne
    private Address primaryAddress;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public TelephoneNumber getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(TelephoneNumber officePhone) {
        this.officePhone = officePhone;
    }

    public TelephoneNumber getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(TelephoneNumber mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Employee getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Employee reportsTo) {
        this.reportsTo = reportsTo;
    }

    public EmailAddress getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(EmailAddress primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public Set<EmailAddress> getAlternateEmails() {
        return alternateEmails;
    }

    public void setAlternateEmails(Set<EmailAddress> alternateEmails) {
        this.alternateEmails = alternateEmails;
    }

    public Address getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(Address primaryAddress) {
        this.primaryAddress = primaryAddress;
    }
}
