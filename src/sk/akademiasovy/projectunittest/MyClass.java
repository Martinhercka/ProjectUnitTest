package sk.akademiasovy.projectunittest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass
{
    public int max(int a, int b, int c)
    {
       if(a>b&&a>c){
           return a;}
       else if (b>a&&b>c){
           return b;}
       else if(c>a&&c>b){
           return c;}

        return a;

    }

    public String Reverse(String text)
    {
      char[] try1 = text.toCharArray();
        for (int i = try1.length-1; i>=0; i--)
            System.out.print(try1[i]);
        return text;
    }

    public boolean ipAddress(String ip)

    {
        String pattern = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(ip);

        if (m.find())
        {
            System.out.println("Right");
            return true;

        }else {
            System.out.println("False");
            return false;
        }




    }
}
