package com.codegym.irregularverbs.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private String code;

    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSSz")
    private Date timeStart;

    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSSz")
    private Date timeEnd;

    @UpdateTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSSz")
    private Date updateTime;

    public Person(Long id, String name, String address, String code, Date timeStart, Date timeEnd) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.code = code;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public Person() {

    }
}
