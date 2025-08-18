package Head12_Lambda.example02_Capture;

public class LambdaCaptureDemo {
    private String memeberField = "Outer Field";

    public void testLambda (){
        String localVar = "Local variable";

        Runnable r = () -> {
            System.out.println("memberField: " +  memeberField);
            System.out.println("localVar: " + localVar);
        };

        r.run();
    }

    public static void main(String[] args) {
        new LambdaCaptureDemo().testLambda();
    }
}
