//package Linkedlist;

public class MusicNode{

    String musicName;

    MusicNode link; //object reference

    public MusicNode(String musicName) {

        this.musicName=musicName;
        link=null;
    }

    public String getMusicName() {

        return musicName;
    }
}