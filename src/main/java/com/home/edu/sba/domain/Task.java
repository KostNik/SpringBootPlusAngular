package com.home.edu.sba.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    private Long      id;
    private String    name;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate dueTime;
    private Boolean   completed;

}
