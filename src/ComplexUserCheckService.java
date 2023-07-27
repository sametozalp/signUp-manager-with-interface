public class ComplexUserCheckService implements IUserCheckService{

    @Override
    public boolean checkUser(User user) {
        if (user.getAge() >= 18 && user.getName().startsWith("Ah")) {
            return true;
        }
        return false;
    }
}
