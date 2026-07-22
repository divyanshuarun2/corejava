package functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    static Function<String, String> f1 = (name)-> name.toUpperCase();
    static Function<String,String> addSomeString  =(string)->string.concat("something is added");
    public static void main(String[] args) {

        String apply = f1.andThen(addSomeString).apply("osso chhotu, delliote");
        String javaIsMyFavLang = f1.compose(addSomeString).apply("java is my fav lang");

        System.out.println(apply);
        System.out.println(javaIsMyFavLang);

    }
}
