package Comparator;

import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> set = new TreeSet<>(new DescendingComparator().reversed());
        set.add(new Fruit("포도", 3000));
        set.add(new Fruit("수박", 10000));
        set.add(new Fruit("딸기", 6000));
        for(Fruit e : set) {
            System.out.println("과일 이름 : " + e.name + ", 가격 " + e.price);
        }
    }
}
