public class StudentRoutine extends TemplateRoutine {
    @Override
    protected void getup() {
	System.out.println("起床");
    }

    @Override
    protected void go() {
	System.out.println("通学");
    }

    @Override
    protected void work() {
	System.out.println("勉強");
    }

    @Override
    protected void return_to_home() {
	System.out.println("帰宅");
    }

    @Override
    protected void sleep() {
	System.out.println("就寝");
    }

}
