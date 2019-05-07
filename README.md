# springboot_example
Example of Spring Boot with SpringMVC, JPA...etc

이 Repository는 스프링부트 기반의 예제이다.
이 예제는 기본적인 구현을 담고 있으며 향후 여러가지 실험과 공부에 사용될 것이다. (아마도...)

### 이 예제로 볼 수 있는 것들
- H2DB의 셋팅 (remote 설정은 실패. 현재는 web console만 가능.)
- ORM Entity 기본 설정

### 이 예제로 확인하고자 하는 것들
- H2DB의 셋팅과 remote 접근
- ORM Entity 기본 설정
- Hibernate의 Lazy-loading
- Hibernate 2nd Level cache (w. ehcache)
- Thymeleaf 기본 사용법

### 하나씩 적어가기
- https://start.spring.io
- h2db? hsqldb 제작사에서 개발한 java로 작성된 가벼운 embedded rdb. 스프링부트에서 개발용으로 사용하기에 적합하다.
- 스프링부트 메이븐으로 실행하기 : mvn spring-boot:run
- h2 web console 접속하기 : http://localhost:8080/h2-console