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
public class Doctor extends User {
    @Column(nullable = false)
    private String specialization;


}
