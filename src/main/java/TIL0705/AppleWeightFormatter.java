package TIL0705;

public class AppleWeightFormatter implements PrintStrategy{
    @Override
    public String toString(Apple apple) {
        return "이 시과의 무게는 " + apple.getWeight() + "g 입니다";
    }
}
