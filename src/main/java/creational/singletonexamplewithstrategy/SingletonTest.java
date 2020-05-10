package creational.singletonexamplewithstrategy;

import creational.singletonexamplewithstrategy.abstractsingleton.AbstractSingleton;
import creational.singletonexamplewithstrategy.singletones.eagerinitializationsingleton.EagerInitializationSingletonImpl;
import creational.singletonexamplewithstrategy.singletones.threadsafesingleton.ThreadSafeSingletonImpl;

public class SingletonTest {
    public static void main(String[] args){

        AbstractSingleton singleton = new SingletonStrategyClass(new EagerInitializationSingletonImpl()).getSingleton();

        System.out.println(singleton.getSingletonType());

        singleton = new SingletonStrategyClass(new ThreadSafeSingletonImpl()).getSingleton();

        System.out.println(singleton.getSingletonType());

    }
}
