package ua.alexshent.crm;

import ua.alexshent.crm.entities.TelephoneNumber;

public class TelephoneNumberBuilder {
    private String number;
    private boolean invalid;

    public TelephoneNumberBuilder withNumber(String number) {
        this.number = number;
        return this;
    }

    public TelephoneNumberBuilder withInvalid(boolean invalid) {
        this.invalid = invalid;
        return this;
    }

    public TelephoneNumber build() {
        TelephoneNumber telephoneNumber = new TelephoneNumber();
        telephoneNumber.setNumber(number);
        telephoneNumber.setInvalid(invalid);
        return telephoneNumber;
    }
}
