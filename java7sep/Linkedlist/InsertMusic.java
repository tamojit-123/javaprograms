//package Linkedlist;
import java.util.Scanner;
public class InsertMusic {

    MusicNode start;
    
    public void insertMusic(){

        String nodeData;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the music name: ");
        nodeData = scanner.next();

        MusicNode newNode = new MusicNode(nodeData);

        if(start==null){
            start=newNode;
        }
        else{
            MusicNode temp;
            temp=start;

            while(temp.link!=null){

                temp=temp.link;
            }
            temp.link=newNode;
        }
    }
    public void traverse(){

        for()
    }
}
