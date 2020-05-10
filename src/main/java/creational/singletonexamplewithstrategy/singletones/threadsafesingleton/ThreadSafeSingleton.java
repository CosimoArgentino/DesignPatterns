package creational.singletonexamplewithstrategy.singletones.threadsafesingleton;

import creational.singletonexamplewithstrategy.abstractsingleton.AbstractSingleton;

public class ThreadSafeSingleton extends AbstractSingleton {

    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton(){

    }

    synchronized public static ThreadSafeSingleton getInstance(){
        if(instance==null){
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }

    @Override
    public String getSingletonType() {
        return "Thread safe singleton created!";
    }
}
