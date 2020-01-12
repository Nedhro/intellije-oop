import java.util.function.Function;
import java.util.function.Supplier;

class Company
{
    String name;

    public Company(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
class Comp{

}
public class Java8MethodReferences {
    public static void main(String[] args)
    {
        //Calling parseInt() method using lambda

        Function<String, Integer> lambdaFunction = (String s) -> Integer.parseInt(s);
        System.out.println(lambdaFunction.apply("12"));

        //Calling parseInt() method using method reference

        Function<String, Integer> referenceFunction = Integer::parseInt;
        System.out.println(referenceFunction.apply("12"));

        //Calling toLowerCase() method using lambda

        Function<String, String> lambda = (String s) -> s.toLowerCase();
        System.out.println(lambda.apply("JAVA"));

        //Calling toLowerCase() method using method reference

        Function<String, String> reference = String::toLowerCase;
        System.out.println(reference.apply("JAVA"));

        Company c = new Company("My_Company");

        //Calling getName() of c using lambda

        Supplier<String> lambdaSupplier = () -> c.getName();
        System.out.println(lambdaSupplier.get());

        //Calling getName() of c using method reference

        Supplier<String> referenceSupplier = c::getName;
        System.out.println(referenceSupplier.get());

        //Creating objects using lambda

        Supplier<Comp> supplier = () -> new Comp();
        supplier.get();

        //Creating objects using constructor references

        Supplier<Comp> ref = Comp::new;
        ref.get();
    }
}
