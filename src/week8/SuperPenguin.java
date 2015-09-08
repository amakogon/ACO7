package week8;

import java.awt.*;
import java.io.IOException;

public class SuperPenguin extends Penguin {
    public SuperPenguin(String name) {
        super(name);
    }

    public String hello() throws IOException, AWTException{
        return "I am super penguin";
    }

    @Override
    public SuperPenguin getFriend() {
        return null;
    }
}
