package model;

import interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Button windows click");
    }
}
