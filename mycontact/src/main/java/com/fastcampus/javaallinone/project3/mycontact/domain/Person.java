package com.fastcampus.javaallinone.project3.mycontact.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
//@Getter
//@Setter
//@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
//@EqualsAndHashCode
@Data
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private int age;

    private String hobby;

    private String bloodType;

    private String address;

    private LocalDateTime birthday;

    private String job;

    // @ToString.Exclude : 결과창에 개인정보라 로그에 남으면 안될 때 쓰면 결과창에 안보임
    private String phoneNumber;

    // 밑에 코드 대신 @EqualsAndHashCode을 한줄 쓰면 됨
    // 같은지 비교하는 코드
//    public boolean equals(Object object){
//        if(object == null){
//            return false;
//        }
//
//        Person person = (Person) object;
//
//        if(!person.getName().equals(this.getName())){
//            return false;
//        }
//
//        if(person.getAge() != this.getAge()){
//            return false;
//        }
//        return true;
//    }
//
//    public int hashCode(){
//        return (name+age).hashCode();
//    }

    // 밑에 코드 대신 @ToString을 한줄 쓰면 됨
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
