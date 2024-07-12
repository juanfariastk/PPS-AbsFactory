package model;

import interfaces.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Mac checkbox Checked!");
    }
}
