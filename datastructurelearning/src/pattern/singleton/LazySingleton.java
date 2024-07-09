package pattern.singleton;

import java.io.Serializable;

/**
 * Lazy initialization mean application will create instance when it is requested.
 * However, this can be used when you have non-thread-safe application. If used in multi threading it might break,
 * Why? because your getinstance method if invoked by two thread at same time then!!!!
 *
 * When to use?  Non thread safe and creating common resource like db connection.
 *
 *
 */
public class LazySingleton implements Serializable {

    private static LazySingleton lazySingleTon = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(lazySingleTon==null){
            lazySingleTon =  new LazySingleton();
        }
        return lazySingleTon;
    }


}
