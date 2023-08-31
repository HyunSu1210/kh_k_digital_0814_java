package 해시셋;

import java.util.HashSet;

// 중복 허용하지 않음, 순서x
public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("Java"); // add 안 됨
        for(String e : set) System.out.println(e + " ");
    }
}
