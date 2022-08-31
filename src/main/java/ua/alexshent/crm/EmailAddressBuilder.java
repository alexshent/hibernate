package ua.alexshent.crm;

import ua.alexshent.crm.entities.EmailAddress;

public class EmailAddressBuilder {
    private String email;
    private boolean optOut;
    private boolean invalid;

    public EmailAddressBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public EmailAddressBuilder withOptOUt(boolean optOut) {
        this.optOut = optOut;
        return this;
    }

    public EmailAddressBuilder withInvalid(boolean invalid) {
        this.invalid = invalid;
        return this;
    }

    public EmailAddress build() {
        EmailAddress emailAddress = new EmailAddress();
        emailAddress.setEmail(email);
        emailAddress.setOptOut(optOut);
        emailAddress.setInvalid(invalid);
        return emailAddress;
    }
}
