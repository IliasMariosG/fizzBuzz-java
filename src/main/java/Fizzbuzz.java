public class Fizzbuzz {
    public String generate(Integer upto) {
        String result = "";
        for (int i=1; i<=upto; i++) {
            if (i == 1) {
                result += i;
            } else {
                if (i%3 == 0) {
                    result += ", " + "Fizz";
                } else if (i%5 == 0) {
                    result += ", " + "Buzz";
                } else {
                    result += ", " + i;
                }
            }
        }
        return result;
    }
}

