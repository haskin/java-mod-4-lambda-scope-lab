import java.util.function.UnaryOperator;

/*
 * Problem:
 * x Fix the modifiers of the PREFIX and SUFFIX variables so they can be used in the operator lambda expression.
 * x  Fix the lambda expression so that:
 *      x str doesn’t have any whitespace.
 *      x The PREFIX and SUFFIX values are added to the string.
 */

public class Main {
    public static final String PREFIX = "__prefix__";
    public static final String SUFFIX = "__suffix__";

    // fix the operator code
    public static UnaryOperator<String> operator = str -> PREFIX + str.trim() + SUFFIX;

    public static void main(String[] args) {
        String res = operator.apply("  hello");
        System.out.println(res); // __prefix__hello__suffix__
    }
}
