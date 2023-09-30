package com.youtube;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subs = new ArrayList<>();
    String title;

    public void subscribe(Subscriber sub){
        subs.add(sub);
    }
    public void unsubscribe(Subscriber sub){
        subs.remove(sub);
    }
    public void notifySubscribers(){
        for(Subscriber sub: subs){
            sub.update();
        }
    }

    public void uploadVideo(String title){
        this.title = title;
        notifySubscribers();
    }
}
