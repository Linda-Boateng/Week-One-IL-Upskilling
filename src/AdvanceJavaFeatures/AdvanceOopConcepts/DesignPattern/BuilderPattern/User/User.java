package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.BuilderPattern.User;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;
    private String email;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
        this.email = builder.email;
    }

    public static class UserBuilder{
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;
        private String email;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return STR."User{firstName='\{firstName}', lastName='\{lastName}', age=\{age}, phone='\{phone}', address='\{address}', email='\{email}'}";
    }
}
