package p2_CollectionHashset;

import java.util.HashSet;

public class TopicHashset {
    public static void main(String[] args) {
        HashSet<Integer > hashSet =new HashSet<>();
                          // index        length
        hashSet.add(11);  // 0              1
        hashSet.add(22);  // 1              2
        hashSet.add(33);  // 2              3
        hashSet.add(44);  // 3              4
        hashSet.add(55);  // 4              5
        System.out.println("Length: "+hashSet.size());
        System.out.println(hashSet);
        hashSet.remove(44);
        System.out.println(hashSet);
        hashSet.remove(11);
        System.out.println(hashSet);
        hashSet.remove(55);
        System.out.println(hashSet);
        hashSet.remove(22);
        System.out.println(hashSet);
    }
}
