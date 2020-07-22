import io.reactivex.rxjava3.core.Flowable;

public class HelloWorldSample {
    public static void main(String[] args) {
        Flowable.just("Hello World").subscribe(System.out::println);
    }
}