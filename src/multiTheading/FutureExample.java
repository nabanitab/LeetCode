package multiTheading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();


        Future<Integer> future = executorService.submit(()->{
            System.out.println("calculating");
            Thread.sleep(2000);
            return 10+20;
        });

        System.out.println("task submitted,do other job");

        Integer result = future.get();
        System.out.println("result : "+result);
        executorService.shutdown();
    }
}
