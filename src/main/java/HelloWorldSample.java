import io.reactivex.rxjava3.core.Flowable;

public class HelloWorldSample {
    public static void main(String[] args) {
        // 데이터를 통지하는 생산자를 생성한다.
        Flowable<String> flowable = Flowable.just("Hello", "World");

        // 통지 받은 데이터를 출력한다.
        flowable.subscribe(data -> System.out.println(data));
    }
}