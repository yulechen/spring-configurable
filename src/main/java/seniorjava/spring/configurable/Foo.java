package seniorjava.spring.configurable;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
     public class Foo {

       @Pointcut("call(* java.util.List.*(..)) && if()") // must qualify
        boolean listOperation() {
           return true;
       }

       @Pointcut("call(* java.util..*(..))")
       void anyUtilityCall() {}


    @Before("call(* java.util.List.*(..))")
    public void callFromFoo() {
        System.out.println("Call from Foo.....");
    }

}