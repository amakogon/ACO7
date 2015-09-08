package week8;

public class BlockClass {

    static {
        System.out.println("Static C");
    }

    private static BlockClass field = new BlockClass();

    public BlockClass() {
        System.out.println("constructed");
    }

    {
        System.out.println("A");
    }

    {
        System.out.println("B");
    }


}
