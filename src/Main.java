public class Main {
    public static void main(String[] args) throws Exception {

        //SignUpManager signUpManager = new SignUpManager(new ComplexUserCheckService());
        SignUpManager signUpManager = new SignUpManager(new AgeUserCheckService());

        signUpManager.SignUp(new User(1, "Samet", 20));

    }
}
