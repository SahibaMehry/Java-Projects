import java.math.BigInteger;
import java.security.InvalidParameterException;

public class BigRational {
    private BigInteger numerator, denominator;

    public BigRational(BigInteger numerator, BigInteger denominator) {
        if (denominator.equals(BigInteger.ZERO)) {
            throw new ArithmeticException("The denominator can't be equal to zero.");
        }
        if (denominator.signum() == -1) {
            numerator = numerator.negate();
            denominator = denominator.negate();
        }

        BigInteger gcd = numerator.gcd(denominator);
        this.numerator = numerator.divide(gcd);
        this.denominator = denominator.divide(gcd);
    }
    public BigRational add(BigRational other) {
        BigInteger new_numerator = this.numerator.multiply(other.denominator).add
                (other.numerator.multiply(this.denominator));
        BigInteger new_denominator = this.denominator.multiply(other.denominator);
        return new BigRational(new_numerator, new_denominator);
    }

    public BigRational subtract(BigRational other) {
        BigInteger new_numerator = this.numerator.multiply(other.denominator).subtract
                (other.numerator.multiply(this.denominator));
        BigInteger new_denominator = this.denominator.multiply(other.denominator);
        return new BigRational(new_numerator, new_denominator);
    }

    public BigRational multiply(BigRational other) {
        BigInteger new_numerator = this.numerator.multiply(other.numerator);
        BigInteger new_denominator = this.denominator.multiply(other.denominator);
        return new BigRational(new_numerator, new_denominator);
    }

    public BigRational divide(BigRational other) {
        BigInteger new_numerator = this.numerator.multiply(other.denominator);
        BigInteger new_denominator = this.denominator.multiply(other.numerator);
        return new BigRational(new_numerator, new_denominator);
    }

    public int compareTo(BigRational other) {
        return this.numerator.multiply(other.denominator).compareTo
                (other.numerator.multiply(this.denominator));
    }

    @Override
    public String toString() {
        return numerator + (!denominator.equals(BigInteger.ONE) ? "/" + denominator : "");
    }


    public static BigRational parseRational(String input) {
        BigInteger numerator, denominator;
        String[] arr = input.split("/");
        if (arr.length == 1) {
            try {
                numerator = new BigInteger(arr[0]);
            } catch (NumberFormatException e) {
                throw new InvalidParameterException("Can't parse " + "'" + input + "' as input.");
            }
            denominator = new BigInteger("1");

        } else if (arr.length == 2) {
            try {
                numerator = new BigInteger(arr[0]);
                denominator = new BigInteger(arr[1]);
            } catch (NumberFormatException e) {
                throw new InvalidParameterException("Can't parse " + "'" + input + "' as input.");
            }
        } else {
            throw new InvalidParameterException("Rational should have only one /");
        }
        return new BigRational(numerator, denominator);
    }

}