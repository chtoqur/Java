public class PatientApp {
    public static void main(String[] args) {
        
        // 안과환자
        PartA p1 = new PartA("john", "male", 80.0, "A", 1.2);

        System.out.println(p1.getName());
        System.out.println(p1.getEyeSight());

        p1.checkMedicalforSurgery();
    }
}
