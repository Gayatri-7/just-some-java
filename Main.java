public class Main {
    public static void main(String[] args) {
        int num = 12345678;
        int evencnt = 0;
        int oddcnt = 0;

        StringBuilder evenDigits = new StringBuilder();
        StringBuilder oddDigits = new StringBuilder();

        while (num > 0) {
            int a = num % 10; // Extract the last digit

            if (a % 2 == 0) {
                evencnt++;
                evenDigits.insert(0, a + " "); // Insert at the beginning for correct order
            } else {
                oddcnt++;
                oddDigits.insert(0, a + " "); // Insert at the beginning for correct order
            }
            num = num / 10; // Remove the last digit
        }

        System.out.println("Even number of digits: " + evencnt);
        System.out.println("Even digits are: " + evenDigits);
        System.out.println("Odd number of digits: " + oddcnt);
        System.out.println("Odd digits are: " + oddDigits);
    }
}
