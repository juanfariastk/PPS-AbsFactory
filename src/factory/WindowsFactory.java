package factory;

import interfaces.Button;
import interfaces.CheckBox;
import interfaces.GUIFactory;
import interfaces.TextArea;
import model.WindowsButton;
import model.WindowsCheckBox;
import model.WindowsTextArea;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        Button winButton = new WindowsButton();
        return winButton;
    }

    @Override
    public CheckBox createCheckBox() {
        CheckBox winCheckBox = new WindowsCheckBox();
        return winCheckBox;
    }

    @Override
    public TextArea createTextArea() {
        TextArea winTextArea = new WindowsTextArea();
        return winTextArea;
    }
}
