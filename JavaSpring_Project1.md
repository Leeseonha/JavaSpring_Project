# JavaSpring_Project1

## 스프링부트 공부

[ study1 ] 스프링 부트 프로젝트 (어드민페이지 만들기)

- [HTTP Method](https://github.com/Leeseonha/JavaSpring_Project/commit/9b6b348d2541a0155f922f02fb6de6bba4416434)
  - GetController.java에 35번째줄 return "OK";가 아니고 return searchParam;이 맞는 방식
- [POST](https://github.com/Leeseonha/JavaSpring_Project/commit/ace583a74f7b063be670aac2082f2a0a26b3a05f)
  - HTTP Method에는 POST와 마찮가지로 BODY에 데이터가 들어 있으며, 주로 업데이트에 사용한다.
- REST의 개념
  - HTTP 프로토콜에 있는 Method를 활용한 아키텍처 스타일이다.
  - HTTP Method를 통해서 Resource를 처리한다.
  - CRUD를 통한 Resource 조작을 할 때 사용한다.

| HTTP Method | 동작                 | URL 형태   |
| ----------- | -------------------- | ---------- |
| GET         | 조회(SELECT * READ)  | /user/{id} |
| POST        | 생성(CREATE)         | /user      |
| PUT / PATCH | 수정(UPDATE) *CREATE | /user      |
| DELETE      | 삭제(DELETE)         | /user/{1}  |



- Lombok