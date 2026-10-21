public class StringCompleteDemo {

    public static void main(String[] args) {

        // ==========================================
        // 1. Creating Strings
        // ==========================================

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        char[] arr = {'J', 'a', 'v', 'a'};

        System.out.println("===== String Creation =====");
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
        System.out.println("s3 : " + s3);
        System.out.println("Character Array : " + new String(arr));

        // ==========================================
        // 2. == vs equals()
        // ==========================================

        System.out.println("\n===== == vs equals() =====");

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));

        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));

        // ==========================================
        // 3. compareTo()
        // ==========================================

        System.out.println("\n===== compareTo() =====");

        System.out.println("Java vs Java : " + "Java".compareTo("Java"));
        System.out.println("Java vs Apple : " + "Java".compareTo("Apple"));
        System.out.println("Java vs Python : " + "Java".compareTo("Python"));

        // ==========================================
        // 4. String Methods
        // ==========================================

        String str = "Programming";

        System.out.println("\n===== String Methods =====");

        System.out.println("Length : " + str.length());

        System.out.println("charAt(3) : " + str.charAt(3));

        System.out.println("substring(3) : " + str.substring(3));

        System.out.println("substring(3,7) : " + str.substring(3, 7));

        System.out.println("contains(\"gram\") : " + str.contains("gram"));

        System.out.println("indexOf('g') : " + str.indexOf('g'));

        System.out.println("lastIndexOf('g') : " + str.lastIndexOf('g'));
        System.out.println("lastIndexOf('g') from : " + str.lastIndexOf('g', 4));

        System.out.println("concat() : " + s1.concat(" Programming"));

        // ==========================================
        // 5. Immutability
        // ==========================================

        System.out.println("\n===== String Immutability =====");

        String original = "Java";

        original.concat(" Programming");
        System.out.println("Without Assignment : " + original);
        
        original = original.concat(" Programming");
        System.out.println("With Assignment : " + original);

        // ==========================================
        // 6. StringBuilder
        // ==========================================

        System.out.println("\n===== StringBuilder =====");

        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Original : " + sb);

        sb.append(" Programming");
        System.out.println("append() : " + sb);

        sb.insert(4, " Core");
        System.out.println("insert() : " + sb);

        sb.setCharAt(0, 'K');
        System.out.println("setCharAt() : " + sb);

        sb.deleteCharAt(1);
        System.out.println("deleteCharAt() : " + sb);

        sb.delete(0, 4);
        System.out.println("delete() : " + sb);

        sb.replace(0, 4, "JAVA");
        System.out.println("replace() : " + sb);

        sb.reverse();
        System.out.println("reverse() : " + sb);

        sb.reverse();

        System.out.println("Length : " + sb.length());

        System.out.println("Capacity : " + sb.capacity());

        // ==========================================
        // 7. Capacity Growth
        // ==========================================

        System.out.println("\n===== Capacity Growth =====");

        StringBuilder capacityDemo = new StringBuilder();

        System.out.println("Default Capacity : " + capacityDemo.capacity());

        capacityDemo.append("abcdefghijklmnop");
        System.out.println("After 16 chars : " + capacityDemo.capacity());

        capacityDemo.append("q");
        System.out.println("After exceeding capacity : "
                + capacityDemo.capacity());

        // ==========================================
        // 8. StringBuffer
        // ==========================================

        System.out.println("\n===== StringBuffer =====");

        StringBuffer sf = new StringBuffer("Java");

        sf.append(" Programming");
        sf.insert(4, " Core");
        sf.deleteCharAt(1);
        sf.replace(0, 4, "JAVA");
        sf.reverse();

        System.out.println(sf);

        // ==========================================
        // 9. Important Notes
        // ==========================================

        System.out.println("\n===== Interview Notes =====");

        System.out.println("String is Immutable");
        System.out.println("StringBuilder is Mutable");
        System.out.println("StringBuffer is Mutable & Thread Safe");
        System.out.println("StringBuilder is Faster");
        System.out.println("String Literals use String Constant Pool");
        System.out.println("== compares References");
        System.out.println("equals() compares Contents");
        System.out.println("compareTo() performs Lexicographical Comparison");
    }
}