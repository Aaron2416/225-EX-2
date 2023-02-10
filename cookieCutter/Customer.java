import java.util.Scanner;

public class Customer {
  private int customerNumber;
  private String lastName;
  private String firstName;
  private String companyName;
  private String address;
  private String city;
  private String state;
  private String zip;
  private String phone;
  private String designType;
  private int feature1;
  private int feature2;
  private int feature3;
  private int feature4;
  private int feature5;
  private static int customerCounter = 0;

  public Customer(String lastName, String firstName, String companyName, String address, String city,
      String state, String zip, String phone, String designType, int feature1, int feature2, int feature3,
      int feature4, int feature5) {
    customerCounter++;
    this.customerNumber = customerCounter;
    this.lastName = lastName;
    this.firstName = firstName;
    this.companyName = companyName;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.phone = phone;
    this.designType = designType;
    this.feature1 = feature1;
    this.feature2 = feature2;
    this.feature3 = feature3;
    this.feature4 = feature4;
    this.feature5 = feature5;
  }

  public int getCustomerNumber() {
    return customerNumber;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getCompanyName() {
    return companyName;
  }

  public String getAddress() {
    return address;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public String getZip() {
    return zip;
  }

  public String getPhone() {
    return phone;
  }

  public String getDesignType() {
    return designType;
  }

  public int getFeature1() {
    return feature1;
  }

  public int getFeature2() {
    return feature2;
  }

  public int getFeature3() {
    return feature3;
  }

  public int getFeature4() {
    return feature4;
  }

  public int getFeature5() {
    return feature5;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter customer's last name: ");
    String lastName = sc.nextLine();
    System.out.println("Enter customer's first name: ");
    String firstName = sc.nextLine();
    System.out.println("Enter company name: ");
    String companyName = sc.nextLine();
    System.out.println("Enter address: ");
    String address = sc.nextLine();
    System.out.println("Enter city: ");
    String city = sc.nextLine();
}
}