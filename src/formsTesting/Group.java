package formsTesting;

import java.util.ArrayList;

public class Group {

    private ArrayList<Form> forms;

    public Group() {
        this.forms = new ArrayList<>();
    }

    // Getter + Setter
    public ArrayList<Form> getForms() {
        return forms;
    }

    public void setForms(ArrayList<Form> forms) {
        this.forms = forms;
    }

    // Methoden

    /**
     * adds a form to this group.
     * @param form
     */
    public void addForm(Form form) {
        this.forms.add(form);
    }

    /**
     * removes a form from this group.
     * @param form
     */
    public double calculateArea() {
        double sum = 0;
        for (Form f : this.forms) {
            sum += f.calculateArea();
        }
        return sum;
    }

    /**
     * calculates the circumference of this group.
     * @return circumference
     */
    public double calculateCircumference() {
        double sum = 0;
        for (Form f : this.forms) {
            sum += f.calculateCircumference();
        }
        return sum;
    }

    /**
     * prints all forms in this group.
     */
    public void printForms() {
        for (Form f : this.forms) {
            System.out.println(f);
        }
    }

    /**
     * finds the biggest form in this group.
     * @return biggestForm
     */
    public Form findBiggestForm() {
        Form biggestForm = null;
        double maxArea = 0;

        for (Form f : this.forms) {
            if (f.calculateArea() > maxArea) {
                maxArea = f.calculateArea();
                biggestForm = f;
            }
        }

        if (biggestForm == null) {
            System.out.println("No Forms!");
        } else {
            System.out.println("BiggestForm: " + biggestForm);
        }

        return biggestForm;
    }

}
