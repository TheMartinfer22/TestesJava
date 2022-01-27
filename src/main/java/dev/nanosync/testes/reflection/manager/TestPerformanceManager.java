package dev.nanosync.testes.reflection.manager;

import dev.nanosync.testes.reflection.annotations.TestPerformance;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestPerformanceManager {
    public void register(Object obj) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        for (Method method : obj.getClass().getMethods()){
            if (method.isAnnotationPresent(TestPerformance.class)){
                long startTime = System.currentTimeMillis();
                method.invoke(obj.getClass().newInstance());
                long endTime = System.currentTimeMillis();
                System.out.println("Total execution of " + method.getName() + " time: " + (endTime-startTime) + "ms");
            }
        }
    }
}
