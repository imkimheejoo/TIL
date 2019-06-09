### 필기

- 변하지 않는 파일 : static 파일
- static파일을 어떻게 관리할거냐 -> 기본은 src/main/resources
- static file의 로케이션은 지정 가능

- 정적인 웹( ex. form.html)이아니라 동적인(데이터를 디비에서 가져옴,사용자에 따라 다른 웹페이지를 보여주는것) 웹
- 동적인 웹을 만들기 위해 쓰는것이 template engine

- template engine 을 써야하는 이유 -> HelloWorld의 post에 필기
-template engine 중 handlebar engine 이 있음(mustache 같은 것)
- 동적인 웹은 spark에서 static이 아니라 templates라는 디렉토리에 파일이 위치해야 템플릿 엔진이 작동됨


- 데이터를 낱개로 받는것이 아니라 자바 클래스에 데이터를 한 묶음으로 담아서 전달 한뒤 템플릿(html파일)에서 사용하는 법
    - java bean : 인스턴스 변수와 getter,setter가 있는 클래스 , 생성자는 기본생성자가 반드시 존재해야함
    - 데이터를 담을때 생성자를 통해 혹은 setter메서드를 써서 담을 수있음
    -웹에서 {{user.name}}은 그냥 클래스의 변수로 바로 접근한것 처럼 보이지만 변수의 접근제어자가 private이므로 그렇게 가져오는것이 아님
        - 내부로직은 getter로 데이터 꺼냄 -> 그래서 getter가 클래스내에 없으면 아무것도 안나옴!

#### mustach 문법

- mustach에서 중괄호 세개 {{{}}}이면 값에 태그가 적용 가능 -> <b>내용</b>이렇게 오면 내용이 강조(b 태그역할은 강조)됨!
