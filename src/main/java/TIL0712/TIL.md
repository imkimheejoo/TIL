### 0712 TIL 깊은복사
### 깊은복사가 되게 하는 방법들

1. Cloneable
    - ArrayList<Integer> 타입이나, HashMap이나 ArrayList 같은 Collection framework들은 내부에 clone() method가 구현되어 있다. 
    - 만약 다른 사용자 정의 클래스를 변수로 갖는 클래스라면 내부의 클래스를 마찬가지로 Cloneable로 구현하여 clone() method로 복사를 하던가, 아니면 내부 클래스의 값들을 직접 탐색하여 복사하는 방법이 있다.
2. Collection 깊은 복사: 복사될객체.addAll(복사할 객체)
    - ex) List의 경우 : new ArrayList<>(객체); 

### @Bean vs @Component

#### @Bean

   - @Bean의 경우 개발자가 컨트롤이 불가능한 외부 라이브러리들을 Bean으로 등록하고 싶은 경우에 사용된다.     
   
   
#### @Component

  - 개발자가 직접 컨트롤이 가능한 Class들의 경우엔 @Component를 사용한다.
     
     
### Servlet Container , DI Container
   #### Servlet Container
   - Java로 웹을 개발하기 위해 여러 Servlet들이 필요하게 되는데, 이러한 Servlet들의 Life Cycle (생명주기) 관리, 
   - 멀티쓰레드 지원 등을 하고 있는 것이 Servlet Container이다. 
   - 우리가 알고 있는 대표적인 Servlet Container가 Tomcat 이다.      
    - cf) Servlet: 자바에서 정의한 웹서버 모델,웹에서 오는 요청을 받아 처리하는 개체
   - Spring MVC 역시 Servlet Container가 관리하고 있는 Servlet이다. 
    - 그래서 Servlet 없이 Spring MVC만 있으면 된다고 하는것은 비지니스 로직을 Spring을 통해 처리하겠다는것이지 Servlet이 필요없다는 얘기가 아니다. 
   -  Spring MVC로의 모든 요청과 응답은 DispatcherServlet이 관리하고 있다.
     - URL요청이 오면 이를 가로채서 HandlerMapping (@RequestMapping으로 봐도 무방) 에게 해당 요청을 처리할 수 있는 Controller를 찾아내어 요청을 Controller에게 보내고 결과값을 리턴해준다. 
     
    
  #### DI Container
   - 
    
    
   