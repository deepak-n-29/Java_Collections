interface Test {
    void print();
}
public class withoutParameter {

    static void fun(Test t){
        t.print();
    }
    public static void main(String[] args) {
        fun(()->System.out.println("Hello"));
    }
}