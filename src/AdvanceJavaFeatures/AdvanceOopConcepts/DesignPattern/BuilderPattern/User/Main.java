package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.BuilderPattern.User;

public class Main {
  public static void main(String[] args) {
    User user = new User.UserBuilder("John", "Doe").age(30).address("123 Main St").build();

    System.out.println(user);
  }
}
