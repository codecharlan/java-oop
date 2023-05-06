public class SpeedConverter {
    public static void main(String[] args) {
        toMilesPerHour(3456);
        printConversion(3645);
    }
    public static long toMilesPerHour(double kiloMetersPerHour) {
        final double km_m_rate = 1.609344;
        long converted = Math.round(kiloMetersPerHour / km_m_rate);

        if (kiloMetersPerHour < 0) {
            return -1;
        }
        System.out.println(converted);
        return converted;
    }

    public static void printConversion(double kiloMetersPerHour) {
        final double km_m_rate = 1.609344;
        long toMilePerHour = Math.round(kiloMetersPerHour / km_m_rate);
        if (kiloMetersPerHour < 0){
            System.out.println("Invalid Value");
        } else System.out.println(kiloMetersPerHour + " km/h" + " = " + toMilePerHour + " mi/h");
    }
}

