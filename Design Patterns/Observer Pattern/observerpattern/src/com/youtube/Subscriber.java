package com.youtube;

public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    private Channel channel = new Channel();

    public void update(){
        System.out.println("Hey " + name + ", Video Uploaded : " + channel.title);
    }

    public void subscribeChannel(Channel ch){
        channel = ch;
    }
}
