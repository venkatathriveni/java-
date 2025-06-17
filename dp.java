public class dp{
  static int[] memo;
  static int c;
  static int fib(int n){
    c++;
    if(n<0){
      System.out.println("Error:Negative number");
      return-1;
    }
    if(n==0)return 0;
    if(n==1)return 1;
    if(memo[n]!=-1)return memo[n];
    memo[n]=fib(n-1)+fib(n-2);
    return memo[n];
  }
  public static void main(String[] args){
    int n=10;
    memo=new int[n+1];
    for(int i=0;i<=n;i++){
       memo[i]=-1;
    }
    for(int i=0;i<n;i++){
       System.out.println(fib(i)+"");
    }
    System.out.println("\nTotal recursive calls:"+c);
  }
}