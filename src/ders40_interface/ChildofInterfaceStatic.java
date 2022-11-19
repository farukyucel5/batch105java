package ders40_interface;

import java.util.ArrayList;
import java.util.List;

public class ChildofInterfaceStatic implements InterfaceStaticandDefaultMethoths{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    public static void main(String[] args) {
        List<String>isimler=new ArrayList<>();

        ChildofInterfaceStatic obj=new ChildofInterfaceStatic();
        obj.method3();

        InterfaceStaticandDefaultMethoths.method4();
    }


}
