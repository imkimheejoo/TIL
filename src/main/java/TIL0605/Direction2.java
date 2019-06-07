package TIL0605;

class Direction2 {
    //static상수 EAST,SOUTH,WEST,NORTH  는 객체의 조소이고 이 값은 바뀌지 않는 값이므로 ==로 비교가 가능한 것이다.
    static final Direction2 EAST = new Direction2("EAST");
    static final Direction2 SOUTH = new Direction2("SOUTH");
    static final Direction2 WEST = new Direction2("WEST");
    static final Direction2 NORTH = new Direction2("NORTH");

    private String name;

    private Direction2(String name) {
        this.name = name;
    }
}