import Patient.Patient;

public class PartS extends Patient {
    // 산부인과

    private boolean pregnant;

    public PartS()
    {
        pregnant = false;
        System.out.println("PartS() - constructor");
    }

    public boolean isPregnant() {
        return this.pregnant;
    }

    public boolean getPregnant() {
        return this.pregnant;
    }

    public void setPregnant(boolean pregnant) {
        this.pregnant = pregnant;
    }

}
