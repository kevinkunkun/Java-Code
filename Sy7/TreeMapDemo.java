package Sy7;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String,String>map=new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        map.put("1","Lucy");
        map.put("2","John");
        map.put("3","Smith");
        map.put("4","Aimee");
        map.put("5","Amanda");
        Set<String>key=map.keySet();
        System.out.println("键的集合为："+key);
        Iterator it=map.entrySet().iterator();
        System.out.print("姓名：");
        while (it.hasNext()){
            Map.Entry entry=(Map.Entry)it.next();
            Object key1=entry.getKey();
            System.out.print(map.get(key1)+" ");
        }
    }
}
