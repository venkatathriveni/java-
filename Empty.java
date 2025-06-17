public class Main
{
public static void main(String[] args)
{
String A= "ABCDEF";
String B= "BDE";
String result="";
for(int i=0;i<A.lenght();i++)
{
Char ch=A.charAt(i);
if(B index of(ch) == -1)
{
result = result+ch;
}
}
System.out.println(result);
}
}