### 필기

- 변하지 않는 파일 : static 파일
- static파일을 어떻게 관리할거냐 -> 기본은 src/main/resources
- static file의 로케이션은 지정 가능

- 정적인 웹( ex. form.html)이아니라 동적인(데이터를 디비에서 가져옴,사용자에 따라 다른 웹페이지를 보여주는것) 웹
- 동적인 웹을 만들기 위해 쓰는것이 template engine

- template engine 을 써야하는 이유 -> HelloWorld의 post에 필기
-template engine 중 handlebar engine 이 있음(mustache 같은 것)
- 동적인 웹은 spark에서 static이 아니라 templates라는 디렉토리에 파일이 위치해야 템플릿 엔진이 작동됨
