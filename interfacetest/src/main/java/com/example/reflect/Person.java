package com.example.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Person {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name = "张三";

    static void main(){
        try {

            /**
             * 反射的三种方式，可以说是拿到class的三种方式
             * Object.class
             * object.getClass();
             * Class.forName("pkgPath");
             *
             *
             * class.newInstance();
             */
            Person p = Person.class.newInstance();
            Person p1 = (Person) Class.forName("com.example.reflect.Person").newInstance();
            Person p2 = new Person().getClass().newInstance();


            Class<?> cls = Class.forName("com.example.reflect.Person");

            Object obj = cls.newInstance();

            Method getname = cls.getMethod("getName",null);
            Class [] params = new Class[1];
            params[0] = String.class;
            Method setName = cls.getMethod("setName",params);

            Object param = new String("sss");

            setName.invoke(obj,param);

            /**
             * 调用方法的过程；
             * 拿到class
             * 1.对象
             * Object obj = class.newInstance();
             * 2.方法
             * Class[] params = new Class[];
             * params[0] = String.class
             * Method method = class.getMethod("name",params);
             * 3.调用
             * Object[] param = new Object[];
             * param[0] = new Stirng("");
             * method.invoke(obj,param);
             *
             *
             */

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public enum CarTye{
        typeDAZHONG,TYPE,TYLE;
    }

}
