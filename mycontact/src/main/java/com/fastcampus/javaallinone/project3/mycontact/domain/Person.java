package com.fastcampus.javaallinone.project3.mycontact.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int age;

    private String hobby;

    private String bloodType;

    private String address;

    private LocalDateTime birthday;

    private String job;

    // @ToString.Exclude : 결과창에 개인정보라 로그에 남으면 안될 때 쓰면 결과창에 안보임
    private String phoneNumber;

//    @Override
//    public String toString(){
//        return "Person{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", hobby='" + hobby + '\'' +
//                ", bloodType='" + bloodType + '\'' +
//                ", address='" + address + '\'' +
//                ", birthday='" + birthday + '\'' +
//                ", job='" + job + '\'' +
//                '}';
//    }
}
