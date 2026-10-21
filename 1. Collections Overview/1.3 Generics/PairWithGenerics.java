class Pair<T,S>{
    T A;
    S B;
}

class PairWithGenerics{
    public static void main(String[] args) {
        Pair<Integer,String> p = new Pair<>();
        p.A = 12;
        p.B = "B";

        String s1 = (String) p.A;

}

//Errors caught at: Compile time ✅
//Instead of: Runtime ❌