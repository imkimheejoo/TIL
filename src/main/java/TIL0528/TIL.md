### 5월 28일 TIL 스트림이어서..

### 매칭
- 모두 리턴타입이 boolean
- allMatch(조건식) -> 조건이 모두 해당하면 true
- anyMatch(조건식) -> 조건이 하나라도 해당하면 true
- noneMatch(조건식) -> 조건이 모두 해당하지 않으면 true

### 기본집계(Reduction == 대량의 데이터를 가공해서 축소하는 것)
- AggregateExample.java 참고
- sum() returnType int,long,double
- count() returnType = long
- average() returnType OptionalDouble
- max() returnType Optional<T>
- max(Comparator<T>) returnType OptionalXXX
- min(Comparator<T>) returnType Optional<T>
- min() returnType OptionalXXX
- findFirst() returnType OptionalXXX
- OptionalXXX => Optional,OptionalDouble,OptionalInt,OptionalLong 클래스 타입
- OptionalXXX의 객체에서 값을 얻기 위해선 getAsDouble(),getAsInt(),getAsLong()하면 된다.

### Optional 클래스 (Optional, OptionalDouble,OptionalInt,OptionalLong)
- Optional 클래스는 단순히 집계값만 저장하는 것이 아니라, 집계값이 존재하지 않을 경우 디폴트 값을 설정할 수도 있고, 집계값을 처리하는 Consumer도 등록할 수 있다.
- isPresent(여기에 조건식 와도 되고 안와도 되고) return boolean -> 값이 저장되어 있는지 여부
- orElse(T or double or int or long) return T or double or int or long -> 값이 저장되어 있지 않을 경우 Consumer에서 처리
- ifPresent(Consumer or DoubleConsumer or IntConsumer or LongConsumer) return void -> 값이 저장되어 있을 경우 Consumer에서 처리

### 수집
- 스트림은 요소들을 필터링 또는 매핑한 후 요소들을 수집하는 최종 처리 메서드인 collect()
- 이 메소드를 이용하면 필요한 요소만 컬렉션으로 담아 리턴이 가능하고 요소들을 그룹핑한 후 집계할 수 있음
- 매개값인 Collector(수집기)는 어떤 요소를 어떤 컬렉션에 수집할 것인지를 결정한다.
    - Collector의 타입 파라미터
        - T :요소 , A :누적기 , R : 요소가 저장될 컬렉션 -> ** T 요소를 A 누적기가 R에 저장한다. **
        - 메서드의 파라미터에 A가 ? 인경우가 있는데 이것은 Collector가 R에 T를 저장하는 방법을 알고있어 A가 필요없다는 뜻
- Collector에는 많은 정적 메서드 들이 있다.
    - Collectors.toList() -> returnType Collector<T,?,List<T>> : T를 List에 저장
    - Collectors.toSet() -> returnType Collector<T,?,Set<T>> : T를 Set에 저장
    
     
