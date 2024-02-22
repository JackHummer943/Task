package other.polymorphism.computer;

public class Monoblock extends Computer {
    public Monoblock() {

    }
    @Override
    public void calculation() {
        System.out.println(toString() + "Произвожу вычисления");
    }
}
