package factory;

import interfaces.Button;
import interfaces.CheckBox;
import interfaces.GUIFactory;
import interfaces.TextArea;
import model.MacButton;
import model.MacCheckBox;
import model.MacTextArea;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        Button macButton = new MacButton();
        return macButton;
    }

    @Override
    public CheckBox createCheckBox() {
        CheckBox macCheckBox = new MacCheckBox();
        return macCheckBox;
    }

    @Override
    public TextArea createTextArea() {
        TextArea macTextArea = new MacTextArea();
        return macTextArea;
    }
}
