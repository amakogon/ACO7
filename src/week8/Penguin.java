package week8;

import java.awt.*;
import java.io.IOException;

public class Penguin {

    private String name;
    private SuperPenguin friend;

    public void setFriend(SuperPenguin friend) {
        this.friend = friend;
    }

    public Penguin(String name) {
        this.name = name;
    }

    protected String hello() throws AWTException, IOException {
        return "Hello! I am " + name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void fly() throws FlyNotSupportedException{
        throw new FlyNotSupportedException();
    }

    public Penguin getFriend() {
        return friend;
    }

    @Override
    public boolean equals(Object something) {
        return super.equals(something);
    }
}
