public class Fizzbuzz {
    public String generate(Integer upto) {
        String result = "";
        for (int i=1; i<=upto; i++) {
            if (i == 1) {
                result += i;
            } else {
                result += ", " + i;
            }
        }
        return result;
    }
}
