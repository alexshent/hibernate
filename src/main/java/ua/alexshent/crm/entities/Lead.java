package ua.alexshent.crm.entities;

import ua.alexshent.crm.entities.enumerations.LeadStatus;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Lead extends Individual {

    @ManyToOne
    private LeadStatus status;

    private int opportunityAmount;

    public LeadStatus getStatus() {
        return status;
    }

    public void setStatus(LeadStatus status) {
        this.status = status;
    }

    public int getOpportunityAmount() {
        return opportunityAmount;
    }

    public void setOpportunityAmount(int opportunityAmount) {
        this.opportunityAmount = opportunityAmount;
    }
}
