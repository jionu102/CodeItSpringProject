package Head04_OOP_Core.example02_inheritance;

class User {
    protected String userId;
    protected String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void printUserInfo() {
        System.out.println("ID: " + userId + ", 이름: " + name);
    }
}

class PersonalUser extends User {
    private String email;

    public PersonalUser(String id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("이메일: " + email);
    }
}

class BusinessUser extends User {
    private String address;

    public BusinessUser(String id, String name, String address) {
        super(id, name);
        this.address = address;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("address: " + address);
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        User u = new PersonalUser("U001", "Alice", "alice@example.com");
        u.printUserInfo();

        System.out.println("-----------------------------");

        User businessUser = new BusinessUser("UOO2", "JinWoo", "Busan");
        businessUser.printUserInfo();
    }
}