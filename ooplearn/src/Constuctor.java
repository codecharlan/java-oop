public class Constuctor {
    private int number;
    private String name;
    private double balance;

    public Constuctor(){
        this("eben", 12389);
    }

    public Constuctor(int number, double balance) {
        this(number, "Omoh e too sure",balance);
    }

    public Constuctor(int number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }
}
