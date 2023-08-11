package com.example.demo.entite;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Getter
@Setter
@Table
@NoArgsConstructor
public class Patient extends User{
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    @Pattern(regexp = "\\d{8}", message = "Le numéro de téléphone doit contenir exactement 8 chiffres.")
    private String numTel;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    public Patient() {
        super(id);
    }
}






