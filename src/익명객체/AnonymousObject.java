package 익명객체;

public class AnonymousObject {
    public static void main(String[] args) {
        A a = new A();
        a.field.methodParent();
    }
}

class Parent {
    String name = "Parent Class";
    void methodParent() {
        System.out.println("Parent mothod : " + this.name);
    }
}

class A {
    Parent field = new Parent() {
        int childField;
        void methodChild() {
        }
        @Override
        void methodParent() {
        }
    };
}
