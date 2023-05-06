public class Main {
    public static void main(String[] args) {
        Employee ernest = new Employee("Ernest", "28/05/1992",908765,"01/06/2023");
        System.out.println(ernest);
        System.out.println("Age: " + ernest.getAge() );
        System.out.println("Pay: " + ernest.collectPay());

    }
}