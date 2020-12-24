package com.example.study.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // 모든 argument를 가지는 변수에 대해 생성자를 추가하려면
public class SearchParam {

    private String account;
    private String email;
    private int page;

}
    
    // { "account" : "" , "email" : "" , "page" : 0 } =>json형태

// lombok을 설정하려면 밑에를 지우고 public class SearchParam위에 @Data를 쓰면 됨(lombok은 간결하게 해줌)
//    public SearchParam(){
//
//    }
//    public SearchParam(String account, String email, int page){
//        this.account = account;
//        this.email = email;
//        this.page = page;
//    }
//
//    public String getAccount() {
//        return account;
//    }
//
//    public void setAccount(String account) {
//        this.account = account;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getPage() {
//        return page;
//    }
//
//    public void setPage(int page) {
//        this.page = page;
//    }

