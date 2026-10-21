class Pair{
    Object A;
    Object B;
}

class PairWithoutGenerics {
    public static void main(String[] args) {
        Pair p = new Pair();
        p.A = 12;
        p.B = "B";

        String s1 = (String) p.A;
        String s2 = (String) p.B;
    }
}
//Errors caught at: Runtime ❌

// Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap') at PairWithoutGenerics.main(PairWithoutGenerics.java:13)