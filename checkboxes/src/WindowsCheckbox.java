public class WindowsCheckbox {

    package refactoring_guru.abstract_factory.example.checkboxes;

    /**
     * All products families have the same varieties (MacOS/Windows).
     *
     * This is a variant of a checkbox.
     */
    public class WindowsCheckbox implements Checkbox {
        @Override
        public void paint() {
            System.out.println("You have created WindowsCheckbox.");
        }
    }
}
