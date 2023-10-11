package com.hospitalmanagement;

import com.hospitalmanagement.medicals.entities.MedicalStaff;
import com.hospitalmanagement.medicals.entities.Patient;

public class Main {
    public static void main(String[] args) {
        MedicalStaff medicare = new MedicalStaff( "A1", "Surgeon", "Optician", 40.0);

        System.out.println("Mr Samson, a " +medicare);

        Patient kg = new Patient();
        kg.setWeight("67kg");

    }
}