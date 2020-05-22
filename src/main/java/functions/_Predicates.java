package functions;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicates {
    public static void main(String[] args) {
        String phone = "07517079771";
        System.out.println(isValid.test(phone));
//
        System.out.println(isValid.and(contains3).test(phone));

        System.out.println(biPredicate.test(phone,true));
    }
    static Predicate<String> isValid = phone ->
            phone.startsWith("0") && phone.length() == 11;
    static Predicate<String> contains3 = phone ->
            phone.contains("3");
    static BiPredicate<String,Boolean> biPredicate = (phone,kg) ->
            kg ? phone.startsWith("0771") : true;

}

