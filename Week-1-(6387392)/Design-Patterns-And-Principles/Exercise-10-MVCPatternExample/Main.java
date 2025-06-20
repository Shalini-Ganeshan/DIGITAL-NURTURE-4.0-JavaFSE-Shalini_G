public class Main {
    public static void main(String[] args) {
        Student model = new Student("Shalini", "S123", "A+");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("G");
        controller.setStudentGrade("A");

        controller.updateView();
    }
}
