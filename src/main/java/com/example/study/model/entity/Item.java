package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer price;

    private String content;

    // 1:N
    // LAZY = 지연로딩(메소드를 호출하지 않는 이상, 연관관계가 설정된 테이블에 대해서 셀렉트하지 않겠다) => 추천하는 타입은 LAZY
    // EAGER = 즉시로딩(연관관계가 설정된 모든 테이블에 대해서 조인이 일어난다) => 1:1일 때 추천

    // LAZY = SELECT * FROM item where id = ?

    // EAGER =
    // item_id = order_detail.item_id
    // user_id = order_detail.user_id
    // where item.id = ?

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
    private List<OrderDetail> orderDetailList;
}
