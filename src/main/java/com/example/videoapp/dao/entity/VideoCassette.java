package com.example.videoapp.dao.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
@Getter
@Setter
public class VideoCassette {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private LocalDate productionYear;

    public VideoCassette(){

    }

    public VideoCassette(Long id, String title, LocalDate productionYear){
        this.id = id;
        this.title = title;
        this.productionYear = productionYear;
    }

}
