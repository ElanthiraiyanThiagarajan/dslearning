package pattern.singleton;

public class MultiThreadSingleton {


    private static MultiThreadSingleton instance = null;

    private MultiThreadSingleton(){

    }

    public static MultiThreadSingleton getInstance(){
        // Question arise why we have two null check here.
        // Reason for first null check is same as explained in method level synchronization why create lock if our object is already created.
        if(instance==null){
            synchronized (MultiThreadSingleton.class){
                //Reason for second null check is lets say two object are come inside first null at same time
                // One call has taken lock and proceeds for creating object first time. Now once lock is released for t1
                // t2 should not create object because its already created and that's why we have second null check.
                if(null==instance)
                    instance = new MultiThreadSingleton();
            }
        }
        return instance;
    }
}
