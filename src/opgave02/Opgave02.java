package opgave02;

import opgave02.primenumbers.Prime;
import opgave02.primenumbers.SieveOfEratosthenes;
import opgave02.primenumbers.TimeDecorator;

public class Opgave02 {
    public static void main(String[] args) {

        System.out.println("Uden tids måling: ");

        Prime sieve = new SieveOfEratosthenes();
        sieve.findPrimeNumbers(10000000);

        System.out.println();
        System.out.println("Med tids måling: ");

        sieve = new TimeDecorator(sieve);
        sieve.findPrimeNumbers(10000000);

    }
}
