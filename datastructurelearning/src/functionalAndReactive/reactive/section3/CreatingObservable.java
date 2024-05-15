package functionalAndReactive.reactive.section3;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

import java.util.ArrayList;
import java.util.List;

public class CreatingObservable {

	public static void main(String[] args) {
		
		//create()
		
		Observable<Integer> source = Observable.create(

				e ->{
				e.onNext(10);
				e.onNext(11);
				e.onNext(12);
				e.onComplete();
				}
				);
		
		
		source.subscribe(System.out::println);
		
		
		//just()
		
		
		Observable<Integer> just = Observable.just(1,2,3);
		
		just.subscribe(System.out::println);
		
		
		//fromIterable
		
		//List<String> list = List.of("Ram", "Shyam", "Mike");
		List<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Shyam");
		
		@NonNull
		Observable<String> fromIterable = Observable.fromIterable(list);
		
		
		list.add("Rahin");
		
		fromIterable.subscribe(System.out::println);
				
	}

}
