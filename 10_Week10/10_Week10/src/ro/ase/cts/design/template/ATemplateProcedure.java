package ro.ase.cts.design.template;

public abstract class ATemplateProcedure {
    public abstract void getProcedurePapers();
    public abstract void getOfficerApprovalProcedure();
    public abstract void identifyDamages();
    public abstract void evaluateHouse();
    public abstract void sentEvaluation();

    public void getInsurance() {
        getProcedurePapers();
        getOfficerApprovalProcedure();
        identifyDamages();
        evaluateHouse();
        sentEvaluation();
        //return ...here you can return something
    }
}
