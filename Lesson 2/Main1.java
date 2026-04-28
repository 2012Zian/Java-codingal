class Main1{
    public static void main(String[] args){
        int a=10;
        int b=4;
        int sum =a+b;
        int sub =a-b;
        int multiply =a*b;
        int divide =a/b;

        System.out.println("addition of a and b is : "+sum);
        System.out.println("substrction of a and b is: "+sub);
        System.out.println("multiplication of a and b :"+multiply);
        System.out.println("divition of a and b :"+divide);

        System.out.println("uniary: "+(a++));
        System.out.println("uniary: "+(++b));

        System.out.println("binary operator");
        System.out.println("1+2 "+1+2);
        System.out.println("1+2 "+(1+2));
        System.out.println(1+2  +"=3");

        int increment = ++a * b++;
        System.out.println(increment);

        int largestnumber = (a>b) ? a:b;
        System.out.println(largestnumber);
    }
}

