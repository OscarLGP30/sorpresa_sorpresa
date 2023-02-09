import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create a new window
        Window window = new Window("Buttons");
        // Create a new button
        Button button = new Button("Click me!");
        // Add the button to the window
        window.add(button);
        // Show the window
        window.show();
    }
}