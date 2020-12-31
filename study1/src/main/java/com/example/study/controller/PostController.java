package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    // post는 HTML <Form> , ajax 검색할 때 사용됨
    // post는 http post 통신을 할 때 body에 data를 집어넣어서 보내겠다라는 뜻이어서 @RequestBody에 값을 매칭함
    // request할 때 여러가지 값이 있음 // json, xml, multipart-form / text-plain

    // @RequestMapping(method = RequestMethod.POST , path = "/postMethod") =>아래 PostMapping과 동일한 동작
    @PostMapping("/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }

    @PutMapping("/putMethod")
    public void put(){

    }

    @PatchMapping("/patchMethod")
    public void patch(){

    }

}
