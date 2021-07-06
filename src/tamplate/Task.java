package tamplate;

public abstract class Task {
    private AuditTrail auditTrail;

     // Setting a default constructor, instead of creating one on each task
    public Task(){
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail){
        this.auditTrail = auditTrail;
    }

    public void execute(){
        /*
        * This happens with all the tasks, so we are basically
        * creating a skeleton for every task.
        * */

        auditTrail.record();

        /*
        * The subclasses will define what this execute method will do
        * by the doExecute method.
        * */
        doExecute();

    }

    // Its protected so i cant call it directly
    protected abstract void doExecute();
}
