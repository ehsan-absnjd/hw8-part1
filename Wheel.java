package interfaces;

public class Wheel implements Turner{
    @Override
    public void turn() {
        System.out.println("rotating...");
    }
}
