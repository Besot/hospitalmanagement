package com.hospitalmanagement.medicals.services;

import com.hospitalmanagement.medicals.entities.MedicalStaff;

public interface MedicalServices {
    void admit(MedicalStaff patient);
    void discharge (MedicalStaff patient);
    void treatment (MedicalStaff patient);
    void consultation (MedicalStaff patient);
}
