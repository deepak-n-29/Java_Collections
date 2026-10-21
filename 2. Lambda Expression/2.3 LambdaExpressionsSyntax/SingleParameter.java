interface Test{
    void print(Integer p);
}
public class SingleParameter {
    static void fun(Test t, Integer p){
        t.print(p);
    }

    public static void main(String[] args) {
        fun((p)->System.out.println(p), 10);
    }
}
