public class Bicycle1 {
    String name;
    int age;
    String address;

    public Bicycle1(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }

    public String sentence(){
        return "The Student Name is " + this.getName() + ";" + "Age is " + this.getAge() + ";" + "and his Address is " + this.getAddress();
    }

    public static void main (String[] args){
        Bicycle1 Eben = new Bicycle1("Eben", 24, "Lagos Island");
        System.out.println(Eben.getAddress());
        System.out.println(Eben.getAge());
        System.out.println(Eben.getName());
        System.out.println(Eben.sentence());
    }
}
