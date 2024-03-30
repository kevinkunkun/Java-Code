package Sy7;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();
        map.put("Tom","CoreJava");
        map.put("John","Oracle");
        map.put("Susan","Oracle");
        map.put("Jerry", "JDBC");
        map.put("Jim","Unix");
        map.put("Kevin","JSP");
        map.put("Lucy","JSP");
        map.put("Alen","JDBC");
        Set<Map.Entry<String,String>>entrySet=map.entrySet();
        System.out.println("Map中的元素为："+entrySet);
        System.out.print("教师Lucy的课程已被修改为：");
        map.put("Lucy","CoreJava");
        System.out.println(map.get("Lucy"));
        System.out.println("修改后Map中的元素为："+entrySet);
        Iterator it=map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry=(Map.Entry)it.next();
            Object key=entry.getKey();
            Object value=entry.getValue();
            if(value.equals("JSP"))
            System.out.println("教学JSP的教师为:"+key);
        }
    }
}
