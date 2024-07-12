import factory.MacFactory;
import factory.WindowsFactory;
import interfaces.Button;
import interfaces.GUIFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GUIFactory macFactory = new MacFactory();
        GUIFactory winFactory = new WindowsFactory();

        Button winButton = winFactory.createButton();
        Button macButton = macFactory.createButton();

        winButton.click();
        macButton.click();;
    }
}