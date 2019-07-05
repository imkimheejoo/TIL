package TIL0705;

public class AppleTotalFormatter implements PrintStrategy{
    @Override
    public String toString(Apple apple) {
        return apple.getColor() + " " + apple.getWeight();
    }
}
