package com.example.demo.dto;

import com.example.demo.entite.Doctor;
import com.example.demo.entite.MedicalRecord;
import com.example.demo.entite.Patient;

import java.util.Date;

public class MedicalRecordDto {
    private Long id;
    private Long doctorId;
    private Long patientId;
    private Date date;
    private String diagnosis;

    public MedicalRecordDto(MedicalRecord medicalRecord) {
        id= medicalRecord.getId();
        doctorId=medicalRecord.getDoctor().getId();
        patientId=medicalRecord.getPatient().getId();
        date=medicalRecord.getDate();
        diagnosis=medicalRecord.getDiagnosis();
    }

    public MedicalRecord convertToEntity() {
        MedicalRecord medicalRecord = new MedicalRecord();
        medicalRecord.setId(id);
        return medicalRecord;
    }

}
