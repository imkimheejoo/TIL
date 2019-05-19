# 람다식
- 람다식은 메소드 내부에서 주로 작성됨
- 람다식의 내부,외부(람다식을 쓰는 메소드)에서 매개변수,로컬변수는 final 이기 때문에 재할당(수정)이 안됨! (UsingLocalVariable.java)
# 컬렉션 프레임워크
- 주요 인터페이스 : List,Set,Map
- ArrayList<>(30); 하면 기본으로 길이가 30인 어레이리스트가 생성됨
## List
- ArrayList,Vector,LinkedList
- 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList보다 LinekedList를 사용하는것이 좋다.
- 인덱스 검색이나 맨마지막에 객체를 추가하는건 ArrayList가 더 좋은 성능
## Set
- HashSet,TreeSet
- Set 컬렉션은 저장순서가 유지되지 않는다.
- Map에서 keySet하면 순서가 뒤죽박죽되는데 이를 방지 하려면 LinkedHashMap을 쓰면 됨
- Set에 사용자가 생성한 generic 타입의 똑같은 값을 넣으면 중복처리가 되지 않는다.
    - 중복처리를 하기 위해서 equals를 Override해야 값이 같으면 같은객체임을 판단할 수 있다. (HashSetExample.java)
## Map
- HashMap,HashTable,TreeMap,Properties
- Set<Map.Entry<K,V>> entrySet() : 키와 값의 쌍으로 구성된 Map.Entry 객체를 Set에 담아서 리턴
- HashMap에서 Key값이 동일한게 나오면 가장 마지막에 넣은 키의 값으로 대체 된다.
- LinkedHashMap에서 keySet과 entrySet은 순서가 보장된다. (MapExample.java)
- HashTable
    - 구조는 HashMap과 동일
    - HashTable은 동기화된 메소드이기 때문에 a쓰레드에서 쓰고 있으면 b쓰레드에서는 쓸 수 없음
    - 따라서 멀티스레드에서 안전하게 객체 추가,삭제 가능 ( == thread safe)

## Comparable & Comparator
- Comparable은 compareTo()가 내장되어있음
- 내 객체가 비교하는 객체보다 적으면 -1 , 같으면 0 크면 1 리턴
- Comparator는 compare()가 내장되어있음 (ComparatorExample.java)
- compare()에서 if문 안쓰고 정렬하는 방법은 객체타입.compare(o1.get변수(),o2.get변수()) (ComparatorExample.java)
    - o1이 o2보다 앞에 오게 하려면 음수를 리턴
    - o1이 o2보다 뒤에 오게하려면 양수를 리턴
    
