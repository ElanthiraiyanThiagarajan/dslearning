package functionalAndReactive.reactive.section5;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class MergeAndConcat {

	public static void main(String[] args) throws InterruptedException {
		
//
//		Observable<String> src1 = Observable.just("Ella","Alexa","Lily");
//		Observable<String> src2 = Observable.just("Priya","Chloe");
		
		Observable<String> src1 = Observable.interval(1, TimeUnit.SECONDS).map(e -> "src1 : "+e);
		Observable<String> src2 = Observable.interval(1, TimeUnit.SECONDS).map(e -> "src2 : "+e);
//		Observable.concat(src1, src2)
//		.subscribe(e -> System.out.println("Received : "+ e));
		
		src1.concatWith(src2)
		.subscribe(e -> System.out.println("Received : "+ e));
		
		Thread.sleep(20000);

	}

}
