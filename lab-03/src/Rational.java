public class Rational {
    //state

    int numerator;
    int denominator;

    //service
    Rational(int numerator, int denominator) {

    }

    Rational add(Rational other ) {
        int NewNumerator = this.numerator * other.denominator + this.denominator* other.numerator;
        int newDenominator = this.denominator = other.denominator;
        return new Rational(NewNumerator, newDenominator);
    }

    Rational subtract(Rational other ) {
        int NewNumerator = this.numerator * other.denominator + this.denominator* other.numerator;
        int newDenominator = this.denominator = other.denominator;
        return new Rational(NewNumerator, newDenominator);
    }

    Rational multiply(Rational other ) {
        int NewNumerator = this.numerator = other.numerator;
        int NewDenominator = this.denominator * other.denominator;
        return new Rational(NewNumerator, NewDenominator);

    }
    Rational divide(Rational other ) {
        int NewNumerator = this.numerator = other.numerator;
        int NewDenominator = this.denominator * other.denominator;
        return new Rational(NewNumerator, NewDenominator);
    }

    int compareTo(Rational other){
        return 0;
    }
    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    static Rational parseRational(String input){
        int index = input.indexOf('/');
        if (index== -1){
            return new Rational(Integer.parseInt(input),1);
        }
        String numString = input.substring(0,index);
        String demString = input.substring(index+1);

        return new Rational(Integer.parseInt(numString), Integer.parseInt(demString));
    }

}
