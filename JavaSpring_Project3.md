# JavaSpring_Project3

## 스프링부트 공부

[ eatgo ] 스프링 부트 프로젝트 (레스토랑 예약 시스템)



###### <고객/가게/관리자 계획>

- 고객은 뭘 먹고 싶은지 발견할 수 있도록 가게 목록을 볼 수 있다
- 고객은 정확히 먹고 싶은 게 뭔지 확인하기 위해 가게의 메뉴를 볼 수 있다
- 고객은 좋은 가게인지 알 수 있도록 평점을 확인할 수 있다
- 고객은 선택의 폭을 좁히기 위해 가게 목록을 분류에 따라 볼 수 있다
- 고객은 나와 남을 위해 가게에 평점과 리뷰를 남길 수 있다
- 고객은 나중에 찾아보기 쉽도록 가게를 즐겨찾기에 추가할 수 있다
- 고객은 가게에서 기다리지 않기 위해 가게에 인원, 메뉴를 예약할 수 있다
- 가게는 관심 있는 고객을 받기 위해 예약 요청을 볼 수 있다
- 가게는 더 나은 고객 서비스를 위해 예약 요청에 응답할 수 있다
- 관리자는 고객이 서비스를 쓸 수 있도록 가게 정보를 등록할 수 있다
- 기타 등등,,,



| REST API  |                          |
| --------- | ------------------------ |
| 가게 목록 | GET /restaurants         |
| 가게 상세 | GET / restaurants/{id}   |
| 가게 추가 | POST / restaurants       |
| 가게 수정 | PATCH /restaurants/{id}  |
| 가게 삭제 | DELETE /restaurants/{id} |

- [Test Driven Development](https://github.com/Leeseonha/JavaSpring_Project/commit/edcb0a13773d5cbc0671705fc1004a1c698d0cb4)

- [가게 목록](https://github.com/Leeseonha/JavaSpring_Project/commit/846e67400ea564662aa836f6ca750a6b5be5b706)

- [가게 상세 1](https://github.com/Leeseonha/JavaSpring_Project/commit/1878aac06b257170febdcf643601f76264540c09) / [가게 상세2](https://github.com/Leeseonha/JavaSpring_Project/commit/892ad44320bd370a5556cdc1056e88394cae9764)

- [의존성 주입](https://github.com/Leeseonha/JavaSpring_Project/commit/0e5ace0b8c9970b10360b466bca4f51574d1e0cd)

  - @Component
  - @Autowired

- [레이어 분리1](https://github.com/Leeseonha/JavaSpring_Project/commit/7298791b1a44d71e18746b51623c9d5bb913c949) / [레이어 분리2](https://github.com/Leeseonha/JavaSpring_Project/commit/4122e0fe0b49f2a4c0f2c280258edb78228c8e03)

- [Mock  (가짜객체)](https://github.com/Leeseonha/JavaSpring_Project/commit/6167c3e277b22eafe6a1902a3e293cc99dc7d5dc)

- [가게 추가 1](https://github.com/Leeseonha/JavaSpring_Project/commit/4907f7a0f3c4fd72678e0d9fee0ea6933e996918) / [가게 추가2](https://github.com/Leeseonha/JavaSpring_Project/commit/dc23b698373a9f5fcae69bae7baa8d5880cf58b7)

- [JPA](https://github.com/Leeseonha/JavaSpring_Project/commit/bedbc606b9c6e69004027610650654dd57be69e4)

  - @Entity

- 프론트엔드

  - [프론트엔드 설정](https://github.com/Leeseonha/JavaSpring_Project/commit/7e7af2d7c3a646fd59f2b657ca6fae0307d6064c) / [프론트엔드 완료](https://github.com/Leeseonha/JavaSpring_Project/commit/371cf8d80fd64544598d2033a83a28c46c242523)

  - ```
    [Terminal]
    cd eatgo-web
    node (노드가 올바르게 설치된것을 확인할 수 있다)
    npm init
    	package name: (eatgo-web) (이렇게 되어있으면 넘어감_엔터)
    	version: (1.0.0) (이렇게 되어있으면 넘어감_엔터)
    	description: EatGo Web Project
    	entry point: (index.js) src/index.js
    	test command: jest (이 프로젝트에서는 쓰지 않는다)
    	git repository: (그냥 넘어감_엔터)
    	keywords: (그냥 넘어감_엔터)
    	author: sh
    	license: (ISC) (기본으로 가기위해 그냥 넘어감_엔터)
    Is this OK? (yes) yes
    하면 package.json이 만들어지는 것을 확인할 수 있다.
    ```

  - ```
    [Terminal]
    npm install --save-dev webpack webpack-cli webpack-dev-server
    설치완료되면 package.json파일에 의존성이 추가된 것을 확인할 수 있다.
    ```

  - ```
    서버를 실행하기 위한 스크립트를 package.json파일에
    "scripts"부분에 "start":"webpack-dev-server"을 추가한다.
    [Terminal]
    npm start
    만약 버전이 달라서 에러가 뜨면,
    "start": "webpack serve --mode development --env development --hot --port 3000"
    
    "webpack": "^5.10.0",
    "webpack-cli": "^4.2.0",
    이렇게 바꾸고 다시 npm start 하면 실행된다.
    ```

  - @CrossOrigin

- [가게 수정](https://github.com/Leeseonha/JavaSpring_Project/commit/b6815199d33a2300a5659a4d3a33ba5f6a9ac7c8)

  - @Transactional

- [Lombok](https://github.com/Leeseonha/JavaSpring_Project/commit/0ff73ee4328ebdd0e3c18b2d80fe3ade31077058)

  - @Setter
  - @Getter
  - @Builder
  - @NoArgsConstructor
  - @AllArgsConstructor

- [validation](https://github.com/Leeseonha/JavaSpring_Project/commit/d446afbfdbcfe75d5f58bab53c33058dd2b3ef54)

  - @Valid
  - @NotNull
  - @NotEmpty
  - @Size(max=10)

- [에러 처리](https://github.com/Leeseonha/JavaSpring_Project/commit/bcb19d2a8db9ded0654e26d60ac2ea54f442240c)

  - @ControllerAdvice

- [메뉴 관리1](https://github.com/Leeseonha/JavaSpring_Project/commit/5c5e79016a335915331e784adf532664cd7396a4) / [메뉴 관리2](https://github.com/Leeseonha/JavaSpring_Project/commit/7daf0d38f75c07122f04805c52324a2907689d73) / [메뉴 관리3](https://github.com/Leeseonha/JavaSpring_Project/commit/208ebf9c1f4bb462a5d87f28f23cedec411d6baa)

  - MenuItem 추가 / 수정 / 삭제 => 메뉴 관리
  - Bulk Update : 한꺼번에 여러개를 업데이트 하는 것
  - PATCH /restaurants/{id}/menuitems

- [리뷰 작성1](https://github.com/Leeseonha/JavaSpring_Project/commit/3760346058446841931d1634b3b4990bc7d9dabb) / [리뷰 작성2](https://github.com/Leeseonha/JavaSpring_Project/commit/11688658381ac6ebf903e992ebfdb76216cffc60) / [리뷰 작성3](https://github.com/Leeseonha/JavaSpring_Project/commit/63a2c5601e628bb8642d0cb4f59430b43d0500f2)

  - POST /restaurants/{id}/reviews

- 프로젝트 분리

  - common / admin-api / customer-api
  - [프로젝트 분리1](https://github.com/Leeseonha/JavaSpring_Project/commit/4f84c0e2e60c1bbfb531f49be8c39a1ccf335105)
    - eatgo-admin-api 만들기, eatgo-common 만들기
  - [프로젝트 분리2](https://github.com/Leeseonha/JavaSpring_Project/commit/e6f37e365f1c477922584479cc54c30339fe5771)
    - eatgo-customer-api 만들기
  - [프로젝트 분리3](https://github.com/Leeseonha/JavaSpring_Project/commit/5f2bae98665b6a28f9bec3510eacfe28443c333f)
    - admin-api 정리
  - [프로젝트 분리4](https://github.com/Leeseonha/JavaSpring_Project/commit/7a693ffffe8318f7a15679c20fb73cfb00c0c7c2)
    - customer-api 정리
  
- [진짜 영속화](https://github.com/Leeseonha/JavaSpring_Project/commit/99a61b646f4e74f50082838bfca113e180eb3965)

  - H2는 Memory와 File을 모두 지원한다.

  - H2 Database에서 Memory를 활용하고 있었는데, Memory에서 File에 저장하여 활용하기

  - Profiles

    ```
    [Terminal]
    C:\eatgo> set SPRING_PROFILES_ACTIVE=test
    C:\eatgo> gradlew.bat test
    하면 모든 테스트가 실행된다.
    ```

- 가게 목록 필터링

  - 지역 / 분류로 나누어서 가게 목록 필터링( Region / Category )

  - | Region       | Address<br />: findAllByAddressContainig<br />: findAllByAddressStartingWith |
    | ------------ | ------------------------------------------------------------ |
    | admin-api    | GET /regions<br />POST /regions                              |
    | customer-api | GET /regions                                                 |

  - | Category     |                                        |
    | ------------ | -------------------------------------- |
    | admin-api    | GET / categories<br />POST /categories |
    | customer-api | GET /categories                        |

  - [가게 목록 필터링1,2](https://github.com/Leeseonha/JavaSpring_Project/commit/6ea40bbff4dfb8527eade992cdb5f0e58d790d50)

  - [가게 목록 필터링3](https://github.com/Leeseonha/JavaSpring_Project/commit/57847da8547e6a44f406347254f126b9289674eb)

    - 가게 목록 필터링1,2,3 : Region에 관한 목록 필터링

  - [가게 목록 필터링4](https://github.com/Leeseonha/JavaSpring_Project/commit/878fea8c9730f566582e56e8211e7d10ccb286c2)

  - [가게 목록 필터링5](https://github.com/Leeseonha/JavaSpring_Project/commit/c6e618a9c60fc32c2d4ea92f6fb4732915e04172)

  - [가게 목록 필터링6](https://github.com/Leeseonha/JavaSpring_Project/commit/4dafd560c77fe4c59604cceba47e1fef548c5c23)

    - 가게 목록 필터링 4,5,6 : Category에 관한 목록 필터링

- 사용자 관리 : admin-api

  - 사용자 관리할때 받을 값 : email , name , level(사용자 권한)
  - [사용자 관리1](https://github.com/Leeseonha/JavaSpring_Project/commit/3250cd614a98bfbb65813355590aa954b6e04626)
  - [사용자 관리2](https://github.com/Leeseonha/JavaSpring_Project/commit/4b9d4c3108e463058f1505017284e2fd170c6af1)
  - [사용자 관리3](https://github.com/Leeseonha/JavaSpring_Project/commit/33ed47681fb4b426a757590600e6687d04840e29)
  - [사용자 관리4](https://github.com/Leeseonha/JavaSpring_Project/commit/930f7aa77f39e8cced1fc37e03885cca8e6c0985)

- 회원가입 : customer-api

  - Password : Hashing을 한다.

  - Hashing 방법 : BCrypt => 쓸 수 있는 방법: Spring Security =>기본설정: HttpSecurity

  - 회원가입할때 받을 값 : E-mail , Name , Password

  - ```
    build.gradle에 
    implementation 'org.springframework.boot:spring-boot-starter-security' 추가하면
    기존 로컬호스트로 접속하면 로그인 페이지가 뜨게 된다.
    ```

  - [회원가입1](https://github.com/Leeseonha/JavaSpring_Project/commit/39781f082279dbf2c5715dcfef17e22b5bc7cb4f)  ,   [회원가입1-build.gradle](https://github.com/Leeseonha/JavaSpring_Project/commit/000d5375852fd7502fae060cd0461f318d23c8a9)

    - 기존 로컬호스트에 로그인 페이지가 나타나지 않도록 수정한다.

  - [회원가입2](https://github.com/Leeseonha/JavaSpring_Project/commit/3f471213771029a5ffef8f8b7c979cf86a7241a2)

    - Spring Security를 이용하여 회원가입api를 만드는 작업

  - [회원가입3](https://github.com/Leeseonha/JavaSpring_Project/commit/a3e29310070ca904cc60b43a23b90f7809d02ef2)

    - 평문으로 저장된 password를 암호화하여 안전하게 관리하는 작업

- 인증 (Authentication)

  - POST /session
  - 세션이 올바르게 만들어졌다면 accessToken을 활용한다.
  - [인증1](https://github.com/Leeseonha/JavaSpring_Project/commit/20c684ff5ab1f44e5d5e5e736adf18e6c2a9a06e)
  - [인증2](https://github.com/Leeseonha/JavaSpring_Project/commit/82c1612dc3e4ad1e6c8eabe588c699dfa7211eb4)
    - 성공했을 때/실패했을 때를 만드는 작업
  - [인증3](https://github.com/Leeseonha/JavaSpring_Project/commit/b9bdf177ad8b6d411c347c8856b99473eca866ca)
  - [인증4](https://github.com/Leeseonha/JavaSpring_Project/commit/ab74fb6d14962a00de7ef4d5fd40ac7090a9fb2f)

- [JWT_1](https://github.com/Leeseonha/JavaSpring_Project/commit/6dbc11fc5fe3720e46f19f5d29618275a51615c1) / [JWT_2](https://github.com/Leeseonha/JavaSpring_Project/commit/da5fdcf9f7ab7fa50a5b5600a752837485c30372)

  - JWT (JSON Web Tokens) : JSON포맷을 이용해서 웹에서 활용할 수 있는 토큰을 다루는 표준이다. 

  - ```
    - JWT는 3부분으로 나누어져있다.
    - 3 Parts : Header / Payload / Signature
    - Header (헤더) : 어떤 타입인지, 어떤 알고리즘을 가지고 있는지 등이 들어가 있다.
    - Payload (정보) : 실제로 어떤 데이터가 담겨있는지 다루게 된다. 주의할점은 Payload에 담긴 데이터는 실제로 암호화가 되지 않기 때문에 웹으로 노출하면 안되는 데이터를 Payload에 담아서는 안된다.
    - Signature (서명) : 헤더의 인코딩값과 정보의 인코딩값을 합친후 주어진 비밀키로 해쉬를 하여 생성한다.
    ```

  - Header. / Payload. / Signature각각은 마침표를 이용해서 연결이 된다. 이 데이터는 JSON포맷으로 되어있지만, 실제로 JSON포맷으로 그냥 나가면안되기 때문에 Base64 URL Encoding 이라는 방법을 이용해서 JSON데이터를 일정하게 문자열로 바꿔준다.

  - ```
    Claims : Payload에 담기는 데이터
    : 실제로 우리가 사용하게 될 유저아이디, 사용자이름 등이 들어가게 된다.
    : 만약 이메일도 노출이 되도 괜찮으면, 이메일도 들어가게 된다.
    : 가능하면 Claims에 많은 데이터가 담지않는것이 좋다.
    ```

  - ```
    Signature : HMAC-SHA256 방식을 활용한다.
    : 비밀키는 노출되지 않도록 잘 관리해줘야 한다.
    ```

- [인가_1](https://github.com/Leeseonha/JavaSpring_Project/commit/4f14326d29e0b4e261769d67b4107dea0df0b596) , [인가 _2](https://github.com/Leeseonha/JavaSpring_Project/commit/b5f7c475930f0fa598d74518c42220f817d1d27f)

  - Stateless : 상태를 따로 관리하지 않는다. 요청을 받을 때마다 accessToken을 받아서 사용자를 식별하고 처리하는 작업을 한다. => Header를 이용
  - Authorization: Bearer
  - Filter : 모든 요청에 대해 토큰을 분석 => BasicAuthenticationFilter
  - AuthenticationToken : 스프링내부에서만 사용한다. => UsernamePasswordAuthenticationToken
  - 인가_2 : 리뷰에 사용자가 자신의 이름을 직접 쓰게 되어있는데 직접 쓰지않고, 인증된 사용자의 이름으로 처리하도록 한다.

- 로그인API 분리 : eatgo-login-api

  - Stateless : 상태를 가지고있지않은 서버를 만들었기 때문에 eatgo-login-api로 나누는 것이 가능하다.
  - User에 restaurantId 추가
  - [로그인API 분리1](https://github.com/Leeseonha/JavaSpring_Project/commit/5d41083723d48934425cd28804c06f1e084d7638)
  - [로그인API 분리2](https://github.com/Leeseonha/JavaSpring_Project/commit/17be77b5ad261d8240e4f62b2452b9e35e4eac59)
    - access토큰을 만들어주는 로그인API를 분리하였고, 분리된 API를 customer-api에서 활용할 수 있다.
    - customer-api에서 올바른 정보를 얻을 수 있도록 Jwt에 restaurantId를 추가하였다.
  
- 테이블 예약 (Table Reservation) : eatgo-customer-api , eatgo-restaurant-api

  - POST /restaurants/{id}/reservations
  - GET /restaurants/{id}/reservations
  - eatgo-customer-api : 테이블 예약을 리뷰로 작성하듯이 예약을 하는 방식으로 한다.
  - eatgo-restaurant-api : restaurant-api를 만들어서 가게 사장님들이 이 api를 사용하여 주문이 들어왔는지, 예약이 있는지 확인할 수 있는 방식으로 한다.
  - Reservation 도메인 모델에는 userId, name, date, time, partySize 등 정보가 들어간다.
  - [테이블 예약1](https://github.com/Leeseonha/JavaSpring_Project/commit/a2fc257ec9268810f94a9ce7e364b6623afa9ea6)
  - [테이블 예약2](https://github.com/Leeseonha/JavaSpring_Project/commit/85c312687f4fd0624a8b3c801e9eaf8b8d654f55)
  - [테이블 예약3](https://github.com/Leeseonha/JavaSpring_Project/commit/b14f48896b541337b16c9c853b4e433dba0b1ab4)

- 한꺼번에 실행하기 - (구현 안함)

  - Container : 여러개의 서버를 동시에 실행하고 사용할 수 있도록 하는것. => Docker 활용 , Docker Compose 활용
    - Multi API servers
    - Front-end까지 같이 작업
    - h2데이터베이스를 사용했는데 여기에서 파일을 사용하여 동시에 여러개의 API를 띠울수없어서 MySQL 등 기존의 RDBMS를 활용하여 디비 서버 구축
  
