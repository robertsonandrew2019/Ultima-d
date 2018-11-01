public class Main {

    public static void main(String[] args) {

        timeCalculator(168260271);
        timeCalculator(27364375);
        timeCalculator(67294091);

        //168260271 27364375 67294091
    }

    public static void timeCalculator(int worldTime) {
        int minutes;
        int minYear = 365 * 1440;
        int year = (worldTime / minYear) + 1;
        minutes = worldTime % minYear;
        int days = (minutes / 1440) + 1;
        minutes = minutes % 1440;
        int hours = minutes / 60;
        minutes = minutes % 60;

        System.out.printf("\nworldTime = %d\n", worldTime);
        System.out.printf("It is %d:%02d on day %d of the year %d.\n", hours, minutes, days, year);

        int moonDays = worldTime / 1440;
        int trammel = (moonDays % 9) + 1;
        int felluca = (moonDays % 14) + 1;

        System.out.printf("Trammel is in day %d of its 9 day phase.\n", trammel);
        System.out.printf("Felluca is in day %d of its 14 day phase\n", felluca);
    }
}
