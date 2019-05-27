## 5월 27일 TIL : Stream 중간처리,최종처리 종류
###  스트림은 재사용이 불가능하다!!!!!!!!!!!!!
### 필터링
- distinct() -> 중복제거
- filter(파라미터) -> 조건 필터링
- FilteringExample.java 참고

### 매핑
- 매핑은 중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 작업을 말한다.
- flatMapXXX() -> 요소를 대체하는 복수 개의 요소들로 구성된 새로운 스트림을 리턴한다. (flatMapExample.java)
- mapXXX() -> 요소를 대체하는 요소로 구성된 새로운 스트림을 리턴한다. 
- asDoubleStream() -> IntStream의 int요소 또는 LongStream의 long요소를 double요소 타입 변환해서 DoubleStream을 생성한다.
- asLongStream() -> IntStream의 int요소를 long요소로 타입 변환해서 LongStream을 생성한다.
- boxed() -> int,long,double 요소를 Integer,Long,Double요소로 박싱해서 Stream을 생성한다.

### 정렬
- sorted() -> 객체를 Comparable 구현 방법에 따라 정렬 (리턴은 요소의 타입에 따라 IntStream,DoubleStream,LongStream)
- sorted(Comparator<T>) -> 객체를 주어진 Comparator에 따라 정렬
- 만약 객체요소가 Comparable을 구현하고 있지만 기본 비교 방법과 정반대 방법으로 정렬하고 싶다면 
    - 1) sorted( (a,b) -> b.compateTo(a));
    - 2) sorted(Comparator.reverseOrder());
- Comparator로 구현하려면 sorted( (a,b) -> {...}) 이렇게 하면 됨

### 루핑
- 루핑은 요소 전체를 반복하는 것을 말한다.
- peek() -> 중간처리 메서드
- forEach() -> 최종처리 메서드