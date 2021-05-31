public class Test01 {
    public static void main(String[] args) {
        int a=100;
        int b=0;
        //这个方法声明时使用了throws ClassNotFoundException 编译时异常，必须处理。要不编译器报错
        //第一种方法继续上抛
        //第二种try..catch进行捕捉
        NumberFormatException n2=new   NumberFormatException("xasfdafaskjndjm");
        System.out.println(n2);
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    public  static void doSome()throws ClassNotFoundException{
        NumberFormatException n1=new  NumberFormatException();
        System.out.println(n1);
    }
}
