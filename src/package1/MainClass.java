package package1;

import package2.SubClass;

public class MainClass {
    public static void main(String[] args) {
        BaseClass b1 = new BaseClass();
        SubClass s1 = new SubClass();
        b1.protectedMethod(); // �����protected��������ͬһ�����е��������б�����
        s1.protectedMethod(); // �����м̳��˸����protected����
        
        
    }
}