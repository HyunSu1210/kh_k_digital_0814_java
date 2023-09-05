package FinalTest2;

import 해시맵메뉴판만들기.MenuInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class CoffeeMenuEx {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/해시맵메뉴판만들기/coffe.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Map<String, MenuInfo> map = (Map<String, MenuInfo>) ois.readObject();
        for(String key : map.keySet()) {
            System.out.println("메뉴 : " +map.get(key).getName());
            System.out.println("가격 : " +map.get(key).getPrice());
            System.out.println("분류 : " +map.get(key).getCategory());
            System.out.println("설명 : " +map.get(key).getDescription());
            System.out.println("-".repeat(28));
        }
    }


}
