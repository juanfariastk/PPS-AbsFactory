package model;

import interfaces.TextArea;

public class WindowsTextArea implements TextArea {
    @Override
    public void setText(String text) {
        System.out.println("Textarea windows: "+ text);
    }
}
