package dev.nanosync.testes;


import dev.nanosync.testes.performance.ListsTest;
import dev.nanosync.testes.reflection.manager.TestPerformanceManager;

import java.lang.reflect.InvocationTargetException;

public class TestesMain {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        TestPerformanceManager testPerformanceManager = new TestPerformanceManager();
        testPerformanceManager.register(ListsTest.class.newInstance());

    }
}
