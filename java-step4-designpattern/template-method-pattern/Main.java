public class Main {
    public static void main(String[] args) {
	TemplateRoutine student = new StudentRoutine();
	TemplateRoutine worker = new WorkerRoutine();

	System.out.println("student");
	student.routine();

	System.out.println("worker");
	worker.routine();

    }
}
