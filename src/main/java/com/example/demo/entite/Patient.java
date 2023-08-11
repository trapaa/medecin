package com.example.demo.entite;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table
@NoArgsConstructor
public class Patient extends User{
    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String numTel;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private String dateOfBirth;
}






