## 5월 26일 TIL : Stream이란?
### 스트림
- 컬렉션(배열 포함)의 저장요소를 하나씩 꺼내서 람다식으로 처리하게 해주는 도구

### 스트림 특징
- 스트림은 내부에서 데이터를 접근하게 해주기 때문에 우리는 데이터 처리 로직만 구현하면 된다.(iterator 와의 차이)
- 병렬처리가 가능함 -> 순차 처리 시스템은 우리가 알고있는 stream(), 병렬처리 시스템은 parallelStream()
    -cf) 병렬 : *한가지* 작업량을 여러 서브로 나눠서 작업 함 -> 순차적으로 나누지 않음 (랜덤)
- 스트림은 내가 구현한 로직 내용을 매개값으로 전달 할 수 있다. ex) LambdaExpressionsExample.java
- 스트림은 중건 처리와 최종 처리를 할 수 있다.
    -중간 처리:매핑,필터링,정렬
    -최종 처리:반복,카운팅,평균,총합

### 스트림 종류
- Stream 은 객체요소를 처리하는 스트림
- IntStream은 int요소를 처리하는 스트림
- LongStream은 long요소를 처리하는 스트림
- DouleStream은 double요소를 처리하는 스트림

### 배열로부터 스트림 얻기
- Stream<T> stream = Arrays.stream(배열이름);
- IntStream intStream = Arrays.stream(int배열이름);

### 숫자 범위로 부터 스트림 얻기
- ex) 1~100까지의 합 구하기 -> FromIntRangeExample.java
