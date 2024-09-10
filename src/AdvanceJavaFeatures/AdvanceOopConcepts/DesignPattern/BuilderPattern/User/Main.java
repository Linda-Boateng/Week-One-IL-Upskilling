package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.BuilderPattern.User;

/*
Builder Design Pattern
Builder Pattern says that "construct a complex object from simple objects using step-by-step approach"
It is mostly used when object can't be created in single
step like in the de-serialization of a complex object.
 */
public class Main {
  public static void main(String[] args) {
    User user = new User.UserBuilder("John", "Doe").age(30).address("123 Main St").build();

    System.out.println(user);
  }
}
