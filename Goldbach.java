public class Goldbach {
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to print all prime pairs for Goldbach's conjecture
    public static void printGoldbachPairs(int evenNumber) {
        if (evenNumber < 4 || evenNumber % 2 != 0) {
            System.out.println("Number must be an even integer greater than or equal to 4.");
            return;
        }

        System.out.println("Goldbach pairs for " + evenNumber + ":");
        for (int i = 2; i <= evenNumber / 2; i++) {
            if (isPrime(i) && isPrime(evenNumber - i)) {
                System.out.println(i + " + " + (evenNumber - i) + " = " + evenNumber);
            }
        }
    }

    public static void main(String[] args) {
        int number = 28;  // Change this to test other even numbers
        printGoldbachPairs(number);
    }
}
