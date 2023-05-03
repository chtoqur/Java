public class memo {
    public static void main(String[] args) {
        String url = "www.codechobo.com";
        float f1 = .10f; // 0.10, 1.0e-1
        float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
        float f3 = 3.14e3f; // 3140.0
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); // 0.100000, 1.000000e-01, %g
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); // 10.000000, 1.000000e+01, 
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3); // 3140.000000, 3.140000e+03
        System.out.printf("d=%f%n", d); // 1.234567
        System.out.printf("d=%14.10f%n", d); // 총 14자리중 소숫점 아래 10자리 1.2345678900 0000
        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
    }
}
