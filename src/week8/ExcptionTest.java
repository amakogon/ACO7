package week8;

public class ExcptionTest {
    public static void main(String[] args) throws CloneNotSupportedException, FlyNotSupportedException {
        Penguin penguin = new Penguin("Chilli");

        try {
            penguin.clone();
        } finally {
            penguin.fly();
        }

    }
}
