package com.cts.designPatterns.singleton;

//LAZY INIT IS NOT THREAD SAFE
//EARLY INIT

public class Database {
    private static Database INSTANCE = null;
    static {
        try {
            INSTANCE = new Database(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private Database(int something) throws Exception {
        if(something < 0){
            throw new Exception();
        }
    }

    public static Database getINSTANCE(){
        return INSTANCE;
    }
}
