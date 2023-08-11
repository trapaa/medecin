package com.example.demo.dto;
import com.example.demo.entite.Patient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class PatientDto {
    private Long id;
    private String username;
    private String email;
    private String address;
    private String numTel;
    private String gender;
    private Date dateOfBirth;

    public PatientDto(Patient patient) {
     id= patient.getId();
     username= patient.getUsername();
     email= patient.getEmail();
     address= patient.getAddress();
     numTel= patient.getNumTel();
     gender=patient.getGender();
     dateOfBirth=patient.getDateOfBirth();
    }

    public Patient convertToEntity() {
        Patient patient = new Patient();
        patient.setId(id);
        patient.setUsername(username);
        patient.setEmail(email);
        patient.setAddress(address);
        patient.setNumTel(numTel);
        patient.setGender(gender);
        patient.setDateOfBirth(dateOfBirth);
        return patient;
    }
}
