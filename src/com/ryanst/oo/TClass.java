package com.ryanst.oo;

import com.ryanst.widget.Child;
import com.ryanst.widget.Parent;

import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by zhengjuntong on 16/5/23.
 */
public class TClass {
    public static void main(String[] args) {
        List<Parent> parentList = new ArrayList<>();
        List<Child> childList = new ArrayList<>();
        doTest(parentList);
        // 注意这里,如果doTest不是? extends Parent的类型,则编译错误.?的用法就是这样
        doTest(childList);

        //泛型T的用法,类似模板，需要在类的定义中声明
        Test<String> test = new Test<>();
        test.doTest("test");

        TestPC<Child> tch = new TestPC<>();
        Parent parent = new Parent();
        Child child = new Child();
//        tch.doTest(parent); Error
//        tch.doTest((Child) parent); Error
        tch.doTest(child);
    }

    public static void doTest(List<? extends Parent> list) {

    }

    public static class Test<T> {
        public T doTest(T t) {
            return t;
        }
    }

    public static class TestPC<Parent> {
        public Parent doTest(Parent t) {
            System.out.println(t.getClass().getName());
            return t;
        }
    }
}
