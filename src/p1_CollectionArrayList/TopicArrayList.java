package p1_CollectionArrayList;

import java.util.ArrayList;

public class TopicArrayList {
    //not fixed in size -declare,add,remove,print

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Paper");
        arrayList.add("Pen");
        arrayList.add("book");
        arrayList.add("bookmark");
        for(int i=0; i<=10; i++){
        }
        System.out.println(arrayList);
        System.out.println(arrayList.size());// finding length of arraylist
    }
}