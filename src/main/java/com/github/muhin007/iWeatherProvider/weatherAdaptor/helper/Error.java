package com.github.muhin007.iWeatherProvider.weatherAdaptor.helper;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Error {
    public static int exceptionFuture(CompletableFuture<Integer> future, int temp) {
        try {
            temp = future.get();
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Ошибка обработки данных. Попробуйте еще раз.");
            System.exit(0);
            e.printStackTrace();
        }
        return temp;
    }
}
