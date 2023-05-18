package Patient;

public class Patient {
    // 이름, 성별, 몸무게, 혈액형

    private String name;
    private String gender;
    private double weight;
    private String bloodType;

    public Patient()
    {
        name = "";
        gender = "";
        weight = 0;
        bloodType = "";
        System.out.println("Patient() - constructor");
    }

    public Patient(String name, String gender, double weight, String bloodType)
    {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.bloodType = bloodType;
        System.out.println("Patient() - overloaded constructor");
    }

    public String getName() 
    {
        return this.name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getGender() 
    {
        return this.gender;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public double getWeight() 
    {
        return this.weight;
    }

    public void setWeight(double weight) 
    {
        this.weight = weight;
    }

    public String getBloodType() 
    {
        return this.bloodType;
    }

    public void setBloodType(String bloodType) 
    {
        this.bloodType = bloodType;
    }

    public void checkMedical()
    {
        System.out.println("혈액형을 검사합니다.");
        System.out.println("체중을 검사합니다.");

    }
}
