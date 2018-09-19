package com.atguigu.com;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author zhufy
 * @create 2018-09-11 9:59
 * 1.Idea中模板所处的位置 settings-editor--live templates /postfix completion
 * 2.常用的模板
 *
 *
 */
public class TemplatesTest {
    //模板六 prsf可以生成private static  final alt+enter快捷键进行依赖的添加
    private static final Customer CUST = new Customer();
    //变形psf
    public static final int NUM1 = 11;
    //变形psfi
    public static final int NUM2 = 22;
    //变形psfs
    public static final String NATION = "CHINA";


    //模板一 main方法  psvm
    public static void main(String[] args) {
        //模板二 System.out.println(""); sout
        //变形形式 soutp soutm soutv xxx.sout
        System.out.println("hello");
        
//        模板三：fori
        String[] arr = {"Lilei","Hanmeimei","Jim","James"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形 iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
            
        }
        //模板四list.for
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add(789);
        for (Object o : arrayList) {
            System.out.println(o.toString());
        }
        //变形list.fori 从头到尾的遍历
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //变形list.forr 逆序的遍历
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }

    }


    public  void  method(){
        System.out.println("Tempaltes method!");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        //模板五ifn
        if (list == null) {
            
        }
        //变形inn
        if (list != null) {
            
        }
        //变形xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
