public class SignUpManager {

    private IUserCheckService iUserCheckService;

    public SignUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }

    public void SignUp(User user) {

        /*
         * //bunu burda newlersek bir sorun çıktığında tek tek alakalı olan yerleri
         * değiştirmek durumunda kalırız.
         * AgeUserCheckService ageUserCheckService = new AgeUserCheckService();
         * 
         * if (ageUserCheckService.checkUser(user)) {
         * System.out.println("Kullanıcı kayıt oldu: " + user.getName());
         * } else {
         * System.out.println("Kullanıcı kayıt olamadı");
         * }
         */

        if (iUserCheckService.checkUser(user)) {
            System.out.println("Kullanıcı kayıt oldu: " + user.getName());
        } else {
            System.out.println("Kullanıcı kayıt olamadı");
        }
    }
}
