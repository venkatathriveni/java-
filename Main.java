public class Main
{
public static void main(String[] args)
{
String A= "ABCDEF";
String B= "BDE";
String result="";
for(int i=0;i<A.length();i++)
{
char ch=A.charAt(i);
if(B.indexOf(ch) == -1)
{
result = result+ch;
}
}
System.out.println(result);
}
}