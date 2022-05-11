package ro.ase.cts.design.template;

public class InsuranceProcedure extends ATemplateProcedure{

    @Override
    public void getProcedurePapers() {
        System.out.println("Getting the papers");
    }

    @Override
    public void getOfficerApprovalProcedure() {
        System.out.println("Get the approval");
    }

    @Override
    public void identifyDamages() {
        System.out.println("Identify damages");
    }

    @Override
    public void evaluateHouse() {
        System.out.println("Evaluate house");
    }

    @Override
    public void sentEvaluation() {
        System.out.println("Send the evaluation");
    }
}
