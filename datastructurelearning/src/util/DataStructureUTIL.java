package util;

public class DataStructureUTIL<T> {

    public static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.printf("%s ", t);
        }

    }
}
