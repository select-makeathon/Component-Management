package com.minosai.compoentmanager.model;

import java.util.List;

public class VerifiedPhoneNumberModel {

    private List<String> verifiedPhoneNumbers;

    public VerifiedPhoneNumberModel(List<String> verifiedPhoneNumbers) {
        this.verifiedPhoneNumbers = verifiedPhoneNumbers;
    }

    public VerifiedPhoneNumberModel() {
    }

    public List<String> getVerifiedPhoneNumbers() {
        return verifiedPhoneNumbers;
    }

    public void setVerifiedPhoneNumbers(List<String> verifiedPhoneNumbers) {
        this.verifiedPhoneNumbers = verifiedPhoneNumbers;
    }

    public void addPhoneNumber(String phoneNumber){
        verifiedPhoneNumbers.add(phoneNumber);
    }
}
