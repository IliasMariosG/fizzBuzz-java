public class Fizzbuzz {
    public String generate(Integer upto) {
        String result = "";
        for (int i=1; i<=upto; i++) {
            if (i == 1) {
                result += i;
            } else if (i == 2) {
                result += ", " + i;
            } else {
                if (i%3 == 0) {
                    result += ", " + "Fizz";
                }
            }
        }
        return result;
    }
}

