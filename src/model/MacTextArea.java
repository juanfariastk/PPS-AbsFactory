package model;

import interfaces.TextArea;

public class MacTextArea implements TextArea {
    @Override
    public void setText(String text) {
        System.out.println("MacTextarea text: "+text);
    }
}
