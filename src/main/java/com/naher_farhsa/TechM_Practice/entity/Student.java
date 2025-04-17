package com.naher_farhsa.TechM_Practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {


    private String sName;
    @Id
    private String sId;
    private String sAddress;
    @ManyToOne()
    private Course sCourse;
    private String sYear;
}
