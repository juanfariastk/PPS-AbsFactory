package model;

import interfaces.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Windows checkbox Checked!");
    }
}
