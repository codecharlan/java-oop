import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Ooplesson;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int principal = 0;
        float rates = 0;
        int years = 0;
        float monthly_rate = 0;
        int period = 0;
        final int month_in_year = 12;
        final int percent = 100;


        while (true) {
            System.out.print("Principal: ");
        principal = input.nextInt();
            if (principal >= 1_000 && principal <= 100_000_000)
            {break;}
            System.out.println("Enter a value between 1000 - 100000000");
        }

        while (true){
            System.out.print("rates: ");
        rates = input.nextFloat();
        if (rates >= 0 && rates <= 30){
            monthly_rate = rates/percent/month_in_year;
        break;}
            System.out.println("Enter a value between 0 - 30");
        }


        while (true){
            System.out.print("years: ");
            years = input.nextInt();
        if (years >= 2 && years <= 12){
            period = years * month_in_year;
        break;}
            System.out.println("Enter a value between 2 - 12");
        }


        if (principal >= 1000 && principal <= 10000000){

        }

        double mortgage = principal * (monthly_rate * Math.pow(1 + monthly_rate, period))/ Math.pow(1 + monthly_rate, period) - 1;
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Morgage Balance: " + formattedMortgage);


        Ooplesson event = new Ooplesson();
        System.out.println(events.length);
    }
}