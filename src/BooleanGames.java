public class BooleanGames {
    private int number;  // instance variable

    // constructor
    public BooleanGames(int number) {
        this.number = number;
    }

    /* Returns true if the instance variable, number, is negative;
       returns false otherwise */
    public boolean isNegative() {
        return (number < 0);
    }

    /* Returns true if the instance variable, number, is greater than num */
    public boolean exceeds(int num) {
        return number > num;
    }

    /* Returns true if the instance variable, number, is even;
       returns false otherwise */
    public boolean isEven() {
        return number % 2 == 0;
    }

    /* Returns true if the instance variable, number, is odd; returns false
       otherwise; needs to be able to handle case when number is negative */
    public boolean isOdd() {
        return number % 2 == 1;
    }

    /* Returns true if the instance variable, number, is a multiple of x;
       returns false otherwise */
    public boolean isMultipleOf(int x) {
        return number % x == 0;
    }

    /* Returns true if the ones digit of the instance variable, number, is equal
       to num; e.g. if number is 437, then isOnesDigit(7) would return true and
       isOnesDigit(5) would return false
       This method should handle the case when number is negative, so if
       number is -123, then isOnesDigit(3) should return true.

       PRECONDITION:  num >= 0
     */
    public boolean isOnesDigit(int num) {
        int lastDigit = Math.abs(num % 10);
            return (lastDigit == num);
        }
    }
