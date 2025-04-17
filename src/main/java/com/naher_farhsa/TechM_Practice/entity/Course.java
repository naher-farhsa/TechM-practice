package com.naher_farhsa.TechM_Practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    private String cId;
    private String cTitle;
    private int  cCredit;
    private String cType;
    @OneToMany(mappedBy = "sCourse")
    private List<Student>cStudent;

}
