package interfaces;

public class Page implements Turner{
    @Override
    public void turn() {
        System.out.println("going to the next page...");
    }
}
