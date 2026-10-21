
class MyGen<T>{
    T obj;
    static int count;

    MyGen(){
        count++;
    }
}

public class GenericsCount {
    
    public static void main(String[] args) {
        MyGen<Integer> obj1 = new MyGen<>();
        MyGen<String> obj2 = new MyGen<>();
        MyGen<Double> obj3 = new MyGen<>();
        System.out.println("Output: " + MyGen.count);
    }
}
