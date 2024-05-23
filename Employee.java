import java.util.Arrays;

//task 1 solution
public class Employee {

    private String firstName;
    private String lastName;
    private String middleName;
    private String jobTitle;
    private String email;
    private int mobileNumber;
    private int salary;
    private int age;

    public Employee(String firstName, String lastName, String middleName, String jobTitle, String email, int mobileNumber, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{"
                + "firstName='" + firstName + '\''
                + "lastName='" + lastName + '\''
                + "middleName='" + middleName + '\''
                + "jobTitle='" + jobTitle + '\''
                + "email='" + email + '\''
                + "mobileNumber='" + mobileNumber + '\''
                + ", salary=" + salary + '\''
                + ", age=" + age
                + '}';
    }

    public void showMeEmployee() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        //task 2 solution
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivan", "Petrov", "Ivanovich", "QA", "test@test.com", +712345678, 25000, 20);
        empArray[1] = new Employee("Petr", "Chaikovskyi", "Ilich", "Composer", "music@music.com", +111111111, 10000000, 100);
        empArray[2] = new Employee("Jack", "Black", "Noot", "Singer", "jack@music.com", +1948304847, 30000000, 50);
        empArray[3] = new Employee("Steve", "Jobs", "Apple", "Head of Apple", "Apple@Apple.com", +1000000000, 300000, 60);
        empArray[4] = new Employee("Bill", "Gates", "Windows", "ex Windows manager", "windows@windows.com", +2342342, 100500, 55);

        empArray[4].showMeEmployee();
    }


}
