
class Student {
    
}

class EnggStudent extends Student {
    
}

class Inheritence {
    public static void main(String[] args) {
        Student s1 = new Student();
        EnggStudent s2 = new EnggStudent();

        s1 = s2;
        System.out.println("Output: " + s1);
        System.out.println("Output: " + s2);
    }
}