# JavaSpring_Project

## 스프링부트 공부

[ mycontact ]
스프링 부트 프로젝트 (지인 정보 관리 시스템)

- JPA

  [JPA시작하기](https://github.com/Leeseonha/JavaSpring_Project/commit/f824e875ebe6ea1c87eb33a77c9f4a3a4e1a8227)

  ```
  @Entity : 해당 클래스가 Domain Entity로 사용할 것이라는 Annotation이다.
  @Id : 해당 컬럼이 Domain Entity의 Pk임을 명시하는 것이다.
  @GeneratedValue : 해당 컬럼의 값은 자동으로 생성되는 값임을 명시하는 것이다.
  ```

- Lombok1

  [Lombok1](https://github.com/Leeseonha/JavaSpring_Project/commit/dce2bf261639a0d8a861d9cc79b14a816c68e147)

  - @Getter

    ```
    - @Getter를 선언하면 기본 getter를 생성해준다.
    - getter는 class의 field variable의 값에 접근할 수 있는 메소드이다.
    ```

  - @Setter

    ```
    - @Setter를 선언하면 기본 setter를 생성해준다.
    - setter는 class의 field variable의 값을 저장할 수 있는 메소드이다.
    ```

  - @ToString

    ```
    - @ToString을 사용하면 일반적으로 사용하는 방식의 toString()을 자동으로 생성해준다.
    - toString()을 override하여 자신이 원하는 값을 출력할 수 있도록 커스터마이징 할 수 있다.
    - toString()은 기본적으로 해당 객체를 출력할 수 있도록 최상위 Object 객체에 선언되어 있다.
    ```

- Lombok2

  [Lombok2](https://github.com/Leeseonha/JavaSpring_Project/commit/f16cc4853568f139da1c31b0c76e95d56d4dfa42)

  - @Constructor

    ```
    - @NoArgsConstructor : 아무런 파라미터를 가지지 않은 생성자를 생성해준다.
    - @AllArgsConstructor : 전체 field variable을 파라미터로 가지는 생성자를 생성해준다.
    - @RequiredArgsConstructor : 필요한 field variable을 @NonNull로 선언하고, 해당 파라미터를 가지는 생성자를 생성해준다.
    ```

  - @EqualsAndHashCode

    ```
    - HashCode : 해시코드가 동일하면, 같은 객체라는 것을 의미한다.
    - Equal : 해당 객체가 같은 값을 가지고 있다는 것을 의미한다.
    ```

  - @Data

    ```
    @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode를 한꺼번에 선언해주는 역할이다.
    ```

- JPA-Relation

  [JPA-Relation1,2](https://github.com/Leeseonha/JavaSpring_Project/commit/e4eef59394ae634cfb1557aa296bbe70f62a4e30 )

  [JPA-Relation3](https://github.com/Leeseonha/JavaSpring_Project/commit/a34913a81b0adc38c99e9171d24135b44891e27c)

  [JPA QueryMethod](https://github.com/Leeseonha/JavaSpring_Project/commit/5c7819c6998eebd50534776e7e3bd296a57040b1)

  [@Query](https://github.com/Leeseonha/JavaSpring_Project/commit/51bfb2ddb73f25445136d861eb822909210013af )

  [JPA data.sql사용](https://github.com/Leeseonha/JavaSpring_Project/commit/5d62c9924df325ee6f8c556d22cd68e692ff00d2 )

  - @OneToOne Relation

    ```
    @OneToOne : Entity를 1:1 관계로 연결해주는 어노테이션이다.
    - optional=false이면 inner join으로 쿼리가 생성된다.
    - optional=true로 하면 left outer join으로 쿼리가 생성된다.
    ```

    - CascadeType

      ```
      cascade : 관련된 entity의 영속성을 함께 관리할 수 있도록 해준다
      - CascadeType.PERSIST : insert할 경우 관련 entity도 함께 insert한다.
      - CascadeType.MERGE : update할 경우 관련 entity도 함께 update한다.
      - CascadeType.REMOVE : delete할 경우 관련 entity도 함께 delete한다.
      - CascadeType.ALL : 모든 케이스에 대해 영속성을 함께 관리한다.
      ```

    - FetchType

      ```
      - FetchType.EAGER : 항상 relation이 있는 entity를 join하여 값을 함께 가져온다.
      - FetchType.LAZY : 해당 객체가 필요한 시점에 id를 통해 새로 select해서 값을 가져온다.
      ```

    - Optional, orphanRemoval

      ```
      orphanRemoval : 관련 entity의 relation이 사라질 때, entity를 함께 삭제해준다.
      ```

  - QueryMethod

    ```
    - @Embedded : 다른 객체를 Entity의 속성으로 가져온다.
    - @Embeddable : 자기 객체를 다른 Entity의 속성으로 사용할 수 있다.
    - @Valid : 해당 객체의 유효성을 검토하겠다는 것을 의미한다.
    - @Min : 숫자관련 필드에서 최소값은 얼마인지 정의한다.()안에 숫자 넣기
    - @Max : 숫자관련 필드에서 최대값은 얼마인지 정의한다.()안에 숫자 넣기
    ```

- Controller

  - [@GetMapping](https://github.com/Leeseonha/JavaSpring_Project/commit/fe6c6e3055ab673611bcece7f928b4cb595eeb3e)

    ```
    Get 메소드의 Http 요청을 받을 수 있는 메소드임을 명시하는 어노테이션이다.
    - @PathVariable : Rest의 Url의 값을 읽어서 메소드의 파라미터로 매핑시킬 수 있도록 도와준다. {id}로 표기하면, 해당 위치에 들어오는 문자열을 id 파라미터에 할당해준다.
    ```

  - [@PostMapping](https://github.com/Leeseonha/JavaSpring_Project/commit/bf504d5793cb4f274c76903070a9e4bf4895cfe7)

    ```
    Post 메소드의 Http 요청을 받을 수 있는 메소드임을 명시하는 어노테이션이다.
    - @RequestBody : Request Body에 있는 데이터를 읽어서 파라미터로 매핑할 수 있도록 도와준다.
    - @ResponseStatus : http 응답에 대한 코드값을 지정한 값으로 변경할 수 있다.
    ```

  - [@PutMapping](https://github.com/Leeseonha/JavaSpring_Project/commit/ca0d124feed549849ba2cfe9f720801f18dc5a50)

    ```
    @PutMapping : Put 메소드의 Http 요청을 받을 수 있는 메소드임을 명시하는 어노테이션이다.
    @PatchMapping : Patch 메소드의 Http 요청을 받을 수 있는 메소드임을 명시하는 어노테이션이다.
    ```

  - [@DeleteMapping](https://github.com/Leeseonha/JavaSpring_Project/commit/363a7816bebd68dc245ba22119330b898a4385d0)

    ```
    Delete 메소드의 Http 요청을 받을 수 있는 메소드임을 명시하는 어노테이션이다.
    ```

- Refactoring

  - [리팩토링 도메인코드1](https://github.com/Leeseonha/JavaSpring_Project/commit/5463603ac21d76884f46e04f5682a2626f52933e)
  - [리팩토링 도메인코드2](https://github.com/Leeseonha/JavaSpring_Project/commit/326a6a73b7ada7ece4dcca01342cb292ee1e6f92)

- Controller-Test

  - [Controller-Test1](https://github.com/Leeseonha/JavaSpring_Project/commit/18ec737719a5156980d93ff873300f47e88f8fb2)

  - [Controller-Test2](https://github.com/Leeseonha/JavaSpring_Project/commit/c83937dbf9d03e21ed3cc2d9498ef827aa282b7d)

    - jsonPath

      ```
      $ : 객체를 의미한다.
      .name : 객체의 name attribute를 가져온다, getName()을 사용한다고 생각하면 된다.
      . 체이닝을 통해서 recursive하게 데이터 추출이 가능하다.
      ```

    - value(A) : 값이 A와 동일한지 검증한다.

    - imEmpty() : 값이 빈 값인지 검증한다.

    - isNumber() : 값이 숫자값인지 검증한다.

    - isBoolean() : true/false 값인지 검증한다.

    - JsonSerializer

    - @Configuration : Spring의 Configuration Bean임을 표시하는 어노테이션이다.

    - MappingJackson2HttpMessageConverter : Spring의 Controller에서 반환하는 결과를 Json으로 만드는데, 해당 포맷을 커스터마이징할 수 있게 해준다.

    - SimpleModule : 커스텀으로 만든 Serializer를 Converter에 등록하기 위해서 모듈화를 해준다.

  - [Controller-Test3](https://github.com/Leeseonha/JavaSpring_Project/commit/4542c667ec39c4f42dfa98c140a001267e8d3e09) , [3보충완료](https://github.com/Leeseonha/JavaSpring_Project/commit/55794b320934d1b8556629b644f99c16b91b6793)

- [Repository-Test](https://github.com/Leeseonha/JavaSpring_Project/commit/f5540db5782f4279eb1720def3446fdf138b6317)

- Mock-Test

  ```
  [Mock 테스트의 장점]
  : 테스트를 더 빠르게 실행할 수 있다.
  : 테스트를 더 구체적이고 세밀하게 할 수 있다.
  ```

  - [Mock_Service-Test1](https://github.com/Leeseonha/JavaSpring_Project/commit/1e1c8ddaac885eb4c0c0c410795ae5e49ba15251)

    ```
    - @ExtendWith : 테스트를 진행할 컨테이너를 별도로 지정해준다.
    - MockitoExtension : Mockito를 사용할 수 있도록 처리해준다.
    - @InjectMocks : @Mock으로 지정된 객체들을 생성해서, 테스트의 주체가 되는 클래스에 주입(Autowired)까지 해준다.
    - @Mock : 실제 Bean이 아니라 가짜 객체(Mock)를 만들어서 실제 Bean을 대체한다.
    - when...thenReturn : Mock의 어떤 메소드와 파라미터가 매핑되는 경우, 결과값에 대해서 지정해줄 수 있다.
    ```

  - [Mock_Service-Test2](https://github.com/Leeseonha/JavaSpring_Project/commit/0ea77544df458b763ef32924c1e8c9f5a054daba)

    ```
    verify : Mock의 액션에 대해서 별도로 검증할 수 있다. 주로 return값이 없는 void 타입의 메소드나, 반복문을 테스트해야 하는 경우에 사용한다.
    ```

  - [Mock_Service-Test3](https://github.com/Leeseonha/JavaSpring_Project/commit/65a2156a308d2c98bb7c295462878b75b9215437)

    - argThat

      ```
      ArgumentMatcher class를 이용해서 결과를 검증하겠다는 의미이다.
      ```

    - ArgumentMatcher

      ```
      테스트 결과값을 검증하는 matcher를 custom하게 개발할 수 있도록 제공하는 인터페이스이다.
      - matches() : 해당 method를 override하여 값을 검증할 수 있다. 검증 후 결과를 boolean으로 리턴하여 테스트를 검증할 수 있도록 한다.
      ```

  - [Mock_Service-Test4](https://github.com/Leeseonha/JavaSpring_Project/commit/35c44779c71562d96dc8200d6b534d1590000580)

- Exception

  - [Exception-Handling1](https://github.com/Leeseonha/JavaSpring_Project/commit/af166786e575ff83d8cf01242f6fabae31d01160)
  - [Exception-Handling2](https://github.com/Leeseonha/JavaSpring_Project/commit/2551540786a827360c27c153a978bbbeddb60b22)
  - [Exception-Handling3](https://github.com/Leeseonha/JavaSpring_Project/commit/acd3df2e08c0e3b52095b4eaec37639709279971)

- 

- Validator

- Paging

- 

- 