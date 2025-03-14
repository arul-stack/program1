class Fibonacci
  {
    public static void main(String args[])
      {
        int first,second,n,i;
        first=1; second=0; n=10;
        System.out.println("Fibnacci series");
        for(i=2;i<n;i++)
          {
            int next=first+second;
            System.out.print(" "+next);
            first=second;
            second=next;
          }
      }
  }