package functional.com.functionalway;

import java.util.Optional;
import java.util.function.Function;

public class FunctionalWay {

    public static void main(String[] args) {
        FunctionalWay fw = new FunctionalWay();
        System.out.println(fw.legacyifElse("Hello"));
        System.out.println(fw.legacyifElse(null));

        System.out.println(fw.newIfElse().apply("Hello"));
        System.out.println(fw.newIfElse().apply(null));

    }


    /*Return Else Condition if input is null or Convert to lower*/
    private String legacyifElse(String s) {
        if (s != null) {
            return s.toLowerCase();
        } else {
            return "Value is null So else in Legacy.";
        }
    }

    /*Return Else Condition if input is null or Convert to lower*/
    private Function<String, String> newIfElse() {
        return s -> Optional.ofNullable(s)
                .map(y -> y.toLowerCase())
                .orElse("Value is null So else in Functional.");
    }


}
