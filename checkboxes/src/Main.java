import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create a new window
        Window window = new Window("Checkboxes");
        // Create a new button
        Checkbox checkbox = new Checkbox("Click me!");
        // Add the button to the window
        window.add(checkbox);
        // Show the window
        window.show();
    }
}