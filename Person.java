package reflectionAPI;

import java.io.Serializable;

public final class Person implements Serializable, Cloneable {
  private String name;
  private Integer age;
  private String address;

  private Person() {
    super();
    System.out.println("Runnning Private Constructor");
  }

  public Person(String name, Integer age, String address) {
    super();
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age){
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  private void validation() {
  }

  public void validate(int age) {
  }
}