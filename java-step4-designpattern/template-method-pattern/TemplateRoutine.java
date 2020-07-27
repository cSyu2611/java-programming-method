public abstract class TemplateRoutine {
    public void routine() {
	getup();
	go();
	work();
	return_to_home();
	sleep();
    }

    protected abstract void getup();

    protected abstract void go();

    protected abstract void work();

    protected abstract void return_to_home();

    protected abstract void sleep();

}


