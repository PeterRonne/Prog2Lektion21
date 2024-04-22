package opgave02.primenumbers;

public abstract class PrimeDecorator extends Prime{
    Prime prime;

    public PrimeDecorator(Prime prime) {
        this.prime = prime;
    }
}
