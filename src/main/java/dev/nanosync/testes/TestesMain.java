package dev.nanosync.testes;


import dev.nanosync.testes.jedistest.PoolConnection;

import java.lang.reflect.InvocationTargetException;

public class TestesMain {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
//        TestPerformanceManager testPerformanceManager = new TestPerformanceManager();
//        testPerformanceManager.register(ListsTest.class);

        new PoolConnection().getResources().setAttribute("teste", "123");
    }
}
