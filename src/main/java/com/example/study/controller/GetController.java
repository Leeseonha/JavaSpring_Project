package com.example.study.controller;

import com.example.study.model.SearchParam;
import com.example.study.model.network.Header;
import org.springframework.web.bind.annotation.*;

@RestController // 이곳은 controller를 활용한다고 알려주는거
@RequestMapping("/api") // 이곳으로 들어올 api를 매핑하기 위해 // localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") // localhost:8080/api/getMethod =>호출하면 사용자의 요청이 getRequest로 들어오게 됨
    public String getRequest(){

        return "Hi getMethod";
    }

    @GetMapping("/getParameter") // localhost:8080/api/getParameter?id=1234&password=abcd  // RequestMapping과 다르게 메소드를 지정하지 않아도되고, 주소만 설정하면 됨
    public String getParameter(@RequestParam String id, @RequestParam String password){
        System.out.println("id : " + id);
        System.out.println("password : " + password);

        return id+password;
    }

    // localhost:8080:api/multiParameter?account=abcd&email=study.gamil.com&page=10
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){ // json형태로 바꿔주려면 public SearchParam getMultiParameter(SearchParam searchParam) 하고
                                                                // return SearchParam;으로 바꾸면 된다
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        // { "account" : "" , "email" : "" , "page" : 0 }
        return searchParam;
    }

    @GetMapping("/header")
    public Header getHeader(){

        // {"resultCode:"OK", "description":"OK"}
        return Header.builder().resultCode("OK").description("OK").build();
    }
}
