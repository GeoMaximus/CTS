package com.cts.designPatterns.singleton;

//BEST APPROACH FOR THE EXAM
//LAZY INIT THAT IS THREAD SAFE

public class DatabaseTwo {
    private static DatabaseTwo INSTANCE = null;
    private DatabaseTwo(){
        //s
    }

    public static DatabaseTwo getINSTANCE(){
        if(INSTANCE == null){
            synchronized (DatabaseTwo.class){
                //HERE MULTITHREADING IS KILLED
                if(INSTANCE == null) {
                    INSTANCE = new DatabaseTwo();
                }
            }
        }
        return INSTANCE;
    }
}
