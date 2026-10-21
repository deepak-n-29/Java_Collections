interface Test {
    void print(Integer p1, Integer p2);
    
}
public class MultipleParameter {
    static void fun(Test t, Integer p1, Integer p2){
        t.print(p1, p2);
    }
    
    public static void main(String[] args) {
        fun((p1, p2)->System.out.println(p1 + p2), 10, 20);
    }
}
