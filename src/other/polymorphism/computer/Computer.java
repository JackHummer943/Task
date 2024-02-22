package other.polymorphism.computer;

public class Computer {
    private String name;

    public Computer () {
        this.name = name;
    }

    public void calculation() {
        System.out.println(toString() + "Произвожу вычисления");
    }
    @Override
    public String toString() {
        return name;
    }
}
