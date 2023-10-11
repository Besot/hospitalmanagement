package com.hospitalmanagement.medicals.entities;

import java.time.LocalDate;
import java.util.List;

public class Patient {
    private String weight;
    private String height;
    private LocalDate dateOfApp;
    private LocalDate dateOfDischarge;
    private String nextOfKin;
    private List<Allergies> allergies;
    private String  address;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public LocalDate getDateOfApp() {
        return dateOfApp;
    }

    public void setDateOfApp(LocalDate dateOfApp) {
        this.dateOfApp = dateOfApp;
    }

    public LocalDate getDateOfDischarge() {
        return dateOfDischarge;
    }

    public void setDateOfDischarge(LocalDate dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public List<Allergies> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<Allergies> allergies) {
        this.allergies = allergies;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
