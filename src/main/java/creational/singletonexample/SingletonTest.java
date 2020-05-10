package creational.singletonexample;

import creational.singletonexample.abstractsingleton.AbstractSingleton;
import creational.singletonexample.eagerinitialization.EagerInitializationSingletonImpl;
import creational.singletonexample.threadsafesingleton.ThreadSafeSingleton;
import creational.singletonexample.threadsafesingleton.ThreadSafeSingletonImpl;

public class SingletonTest {
    public static void main(String[] args){

        AbstractSingleton singleton = new SingletonStrategyClass(new EagerInitializationSingletonImpl()).getSingleton();

        System.out.println(singleton.getSingletonType());

        singleton = new SingletonStrategyClass(new ThreadSafeSingletonImpl()).getSingleton();

        System.out.println(singleton.getSingletonType());

    }
}
