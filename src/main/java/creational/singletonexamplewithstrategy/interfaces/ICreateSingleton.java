package creational.singletonexamplewithstrategy.interfaces;

import creational.singletonexamplewithstrategy.abstractsingleton.AbstractSingleton;


public interface ICreateSingleton {
    public AbstractSingleton getSingletonInstance();
}
