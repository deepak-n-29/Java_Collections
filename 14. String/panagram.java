// i/p: The quick brown fox jumps over the lazy dog.
// o/p: true

// i/p: abc xyz
// o/p: false
public class panagram {

    static boolean checkPanagram(String s) {
        int n = s.length();
        if(n<26) return false;

        boolean[] visited = new boolean[26];
        for(int i=0; i<n; i++) {
            char x = s.charAt(i);
            if(x>='a' && x<='z') {
                visited[x-'a'] = true;
            }
            else if(x>='A' && x<='Z') {
                visited[x-'A'] = true;
            } 
        }

        for(int i=0; i<26; i++) {
            if(!visited[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {

        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkPanagram(s));

        String s1 = "abc xyz";
        System.out.println(checkPanagram(s1));
    }
}
