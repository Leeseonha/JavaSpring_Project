package kr.co.fastcampus.eatgo.utils;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public String createToken(long l, String john) {
        return "header.payload.signature";
    }
}
