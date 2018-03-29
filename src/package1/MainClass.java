package package1;

import package2.SubClass;

public class MainClass {
    public static void main(String[] args) {
        BaseClass b1 = new BaseClass();
        SubClass s1 = new SubClass();
        b1.protectedMethod(); // 父类的protected方法可在同一个包中的其它类中被访问
        s1.protectedMethod(); // 子类中继承了父类的protected方法
        
        
    }
}