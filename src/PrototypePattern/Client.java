package PrototypePattern;

import java.util.Hashtable;
import java.util.Map;

/**
 * @Author: 李亚卿
 * @Date: Created in 23:58 2018/3/28 0028
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Resume resume = new Resume();

        Resume resume1 = resume.clone();
        resume1.abilities.add("打飞机");
        Resume resume2 = resume.clone();
        System.out.println(resume1.abilities + " " + resume2.abilities);
    }
}
