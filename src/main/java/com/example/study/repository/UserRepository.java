package com.example.study.repository;

import com.example.study.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Page<User> findAll(Pageable pageable);


    //쿼리메소드는 잠시 주석(공부용)
    // select * from user where account = ? << test03, test04
//    Optional<User> findByAccount(String account);
//
//    Optional<User> findByEmail(String email);

    // select * from user where account = ? and email = ?
//    Optional<User> findByAccountAndEmail(String account, String email);
}
