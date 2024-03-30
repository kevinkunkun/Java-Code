package Sy6;

class StringExample {
    public static void main(String args[]) {
        String s1=new String("you are a student"),
        s2=new String("how are you");
    if(s1.equals(s2)) // 使用equals方法判断s1与s2是否相同
         {
        System.out.println("s1与s2相同");
    }
        else
    {
        System.out.println("s1与s2不相同");
    }
    String s3=new String("22030219851022024");
    if(s3.startsWith(String.valueOf(220302)))   //判断s3的前缀是否是“220302”。
    {
        System.out.println("吉林省的身份证");
    }
    String s4=new String("你"),
            s5=new String("我");
    if(s4.compareTo(s5)>0)//按着字典序s4大于s5的表达式。
    {
        System.out.println("按字典序s4大于s5");
    }
         else
    {
        System.out.println("按字典序s4小于s5");
    }
    int position=0;
    String path="c:\\java\\jsp\\A.java";
    position=path.charAt(path.length()-7); //获取path中最后出现目录分隔符号的位置
    System.out.println("c:\\java\\jsp\\A.java中最后出现\\的位置:"+position);
    String fileName=path.substring(path.length()-6);//获取path中“A.java”子字符串。
    System.out.println("c:\\java\\jsp\\A.java中含有的文件名:"+fileName);
    String str9=path.substring(path.length()-10,path.length()-7);
    System.out.println("c:\\java\\jsp\\A.java中“jsp”子字符串的代码为："+str9);

    String s6=new String("100"),
            s7=new String("123.678");
    int n1=Integer.valueOf(s6);     //将s6转化成int型数据。
    double n2=Double.valueOf(s7);  //将s7转化成double型数据。
    double m=n1+n2;
    System.out.println(m);
    String s8=String.valueOf(m) ;//String调用valuOf(int n)方法将m转化为字符串对象
    position=s8.indexOf(".");
    String temp=s8.substring(position+1);
    System.out.println("数字"+m+"有"+temp.length()+"位小数") ;
        String[] str10=s8.split("\\.");
        System.out.println("m的整数部分为："+str10[0]);
        System.out.println("m的小数部分为："+str10[1]);
    String s9=new String("ABCDEF");
    char a[]=s8.toCharArray();//将s8存放到数组a中。
    for(int i=a.length-1;i>=0;i--)
    {
        System.out.print(" "+a[i]);
    }
    System.out.println();
    StringBuffer str=new StringBuffer();
      str.append(a[0]).append(a[1]).append(a[2]);
      System.out.println("a的前三个单元为"+str);


        String str1=new String("ABCABC"),
                str2=null,
                str3=null,
                str4=null;
        str2=str1.replaceAll("A","First");
        str3=str2.replaceAll("B","Second");
        str4=str3.replaceAll("C","Third");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

       long i=12345;
       String x1=Long.toString(i,2);
        String x2=Long.toString(i,8);
        String x3=Long.toString(i,16);
        System.out.println("12345的二进制为："+x1+"\t\t"+"12345的八进制为："+x2+"\t\t"+"12345的十六进制为："+x3);
}
}

