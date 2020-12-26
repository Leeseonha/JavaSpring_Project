package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(exclude = {"orderDetailList","partner"})
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    private String name;

    private String title;

    private String content;

    private Integer price;

    private String brandName;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;

    // Item N : 1 Partner
    @ManyToOne
    private Partner partner;

    // Item 1 : N OrderDetail
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
    private List<OrderDetail> orderDetailList;

    // 1:N
    // LAZY = 지연로딩(메소드를 호출하지 않는 이상, 연관관계가 설정된 테이블에 대해서 셀렉트하지 않겠다) => 추천하는 타입은 LAZY
    // EAGER = 즉시로딩(연관관계가 설정된 모든 테이블에 대해서 조인이 일어난다) => 1:1일 때 추천

    // LAZY = SELECT * FROM item where id = ?

    // EAGER =
    // item_id = order_detail.item_id
    // user_id = order_detail.user_id
    // where item.id = ?

    //연관관계는 잠시 주석(연관관계는 공부용)
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
//    private List<OrderDetail> orderDetailList;
}
