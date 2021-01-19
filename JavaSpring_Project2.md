# JavaSpring_Project

## 스프링부트 공부

[ mycontact ]
스프링 부트 프로젝트 (지인 정보 관리 시스템)

- [JPA]: https://github.com/Leeseonha/JavaSpring_Project/commit/f824e875ebe6ea1c87eb33a77c9f4a3a4e1a8227	"JPA시작하기"

  ```
  @Entity : 해당 클래스가 Domain Entity로 사용할 것이라는 Annotation이다.
  @Id : 해당 컬럼이 Domain Entity의 Pk임을 명시하는 것이다.
  @GeneratedValue : 해당 컬럼의 값은 자동으로 생성되는 값임을 명시하는 것이다.
  ```

- [Lombok1]: https://github.com/Leeseonha/JavaSpring_Project/commit/dce2bf261639a0d8a861d9cc79b14a816c68e147	"Lombok1"

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

  

- [Lombok2]: https://github.com/Leeseonha/JavaSpring_Project/commit/f16cc4853568f139da1c31b0c76e95d56d4dfa42	"Lombok2"

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

  - [JPA-Relation1,2]: https://github.com/Leeseonha/JavaSpring_Project/commit/e4eef59394ae634cfb1557aa296bbe70f62a4e30	"JPA-Relation1,2"

    

  - [JPA-Relation3]: https://github.com/Leeseonha/JavaSpring_Project/commit/a34913a81b0adc38c99e9171d24135b44891e27c	"JPA-Relation3"

    

  - [JPA QueryMethod]: https://github.com/Leeseonha/JavaSpring_Project/commit/5c7819c6998eebd50534776e7e3bd296a57040b1	"JPA Query Method"

    

  - [@Query]: https://github.com/Leeseonha/JavaSpring_Project/commit/51bfb2ddb73f25445136d861eb822909210013af	"JPA @Query"

  - [JPA data.sql사용]: https://github.com/Leeseonha/JavaSpring_Project/commit/5d62c9924df325ee6f8c556d22cd68e692ff00d2	"JPA data.sql사용"

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

  - @GetMapping

    ```
    Get 메소드의 Http 요청을 받을 수 있는 메소드임을 명시하는 어노테이션이다.
    - @PathVariable : Rest의 Url의 값을 읽어서 메소드의 파라미터로 매핑시킬 수 있도록 도와준다. {id}로 표기하면, 해당 위치에 들어오는 문자열을 id 파라미터에 할당해준다.
    ```

  - @PostMapping

    ```
    Post 메소드의 Http 요청을 받을 수 있는 메소드임을 명시하는 어노테이션이다.
    - @RequestBody : Request Body에 있는 데이터를 읽어서 파라미터로 매핑할 수 있도록 도와준다.
    - @ResponseStatus : http 응답에 대한 코드값을 지정한 값으로 변경할 수 있다.
    ```

  - @PutMapping

    ```
    Put 메소드의 Http 요청을 받을 수 있는 메소드임을 명시하는 어노테이션이다.
    ```

  - @PatchMapping

    ```
    Patch 메소드의 Http 요청을 받을 수 있는 메소드임을 명시하는 어노테이션이다.
    ```

  - @DeleteMapping

    ```
    Delete 메소드의 Http 요청을 받을 수 있는 메소드임을 명시하는 어노테이션이다.
    ```

- Refactoring

  - [리팩토링]: https://github.com/Leeseonha/JavaSpring_Project/commit/5463603ac21d76884f46e04f5682a2626f52933e	"리팩토링 도메인코드1"

    

  - [리팩토링]: https://github.com/Leeseonha/JavaSpring_Project/commit/326a6a73b7ada7ece4dcca01342cb292ee1e6f92	"리팩토링 도메인코드2"

    

- Controller-Test

- Repository-Test

- Mock-Test

- Exception

- Validator

- Paging

- Summary