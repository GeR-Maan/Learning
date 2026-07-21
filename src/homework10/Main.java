package homework10;

public class Main {

    public static void main(String[] args) {
        Role admin = new Role("Administrator");
        User user1 = new User("Tom",22, admin);
        User user2 = new User("Tom",22,admin);
        User user3 = new User("Tomas",22,admin);

        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user3));

        try{
            User user4 = user1.clone();
            user4.toString();


        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
