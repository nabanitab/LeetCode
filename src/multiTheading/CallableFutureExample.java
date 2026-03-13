package multiTheading;

import java.util.concurrent.*;

public class CallableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //define a callble task
        Callable<Integer>task = ()-> {
            System.out.println("task running....");

            Thread.sleep(2000);
            return 42;
        };

        //submit task and get a future
        Future<Integer>future = executorService.submit((task));

        System.out.println("doing task...");

        //get result until ready
        Integer result = future.get();
        System.out.println("result : "+result);
        executorService.shutdown();
    }
}
