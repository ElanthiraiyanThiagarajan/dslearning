package functionalAndReactive.functional.section4;

@FunctionalInterface
public interface FunctionalGenerics<T, R> {
	
	R execute(T t); 
}

