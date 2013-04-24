package com.birdysolutions.birdyreminder;

import java.util.Timer;
import java.util.TimerTask;

public class TimerHandler {   
   
    public static void main(String[] args) { 
    	TimerHandler tTask=new TimerHandler();
        tTask.timeVoid();
    }
    
    public void timeVoid(){
        final Timer timer = new Timer();
        TimerTask tt=new TimerTask() { 
            @Override
            public void run() {
                System.out.println("µΩµ„¿≤£°");
                timer.cancel();
            }
        };

        System.out.println("begin...");
        timer.schedule(tt, 3000);
    }
}