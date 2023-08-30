package List예제1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<MenuInfo> menuInfoList = new ArrayList<>();
        menuInfoList.add(new MenuInfo("Americano",2500,true));
        menuInfoList.add(new MenuInfo("Latte",4000,true));
        menuInfoList.add(new MenuInfo("BlackTea",4000,true));
        // 향상된 for문 : 배열이나 Collection 클래스 자식들
        for(MenuInfo menu : menuInfoList) {
            System.out.println(menu.getMenuInfo());
        }
        for(int i = 0; i < menuInfoList.size(); i++) {
            System.out.println(menuInfoList.get(i).getMenuInfo());
        }
    }
}

class MenuInfo {
    String name;
    int price;
    String category;
    String description;
    boolean isTax;

    public MenuInfo(String name, int price, boolean isTax) {
        this.name = name;
        this.price = price;
        this.isTax = isTax;
    }

    public String getMenuInfo() {
        return "{"+"\"name\":"+name+","+"\"price\":"+price+","+"\"isTax\":"+isTax+"}";
    }
}
