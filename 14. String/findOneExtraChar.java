// i/p: s1 = "abcd", s2 = "abecd"
// o/p: e

// i/p: s1="abad" s2 = "abada"
// o/p: a

import java.util.Arrays;

public class findOneExtraChar {
    
    //Using Sorting
    char findExtra(String s1, String s2){  //TC: O(nlogn), SP: O(n)
        char a1[] = s1.toCharArray();
        Arrays.sort(a1);

        char a2[] = s2.toCharArray();
        Arrays.sort(a2);

        int n = s1.length();
        for(int i=0; i<n; i++){
            if(a1[i]!=a2[i]) return a2[i];
        }
        return a2[n];
    }

    char findExtraByCounting(String s1, String s2){ // TC: O(n), SP: O(n)
    
        int count[] = new int[26];
        int n = s1.length();
        for(int i=0;i<n;i++){
            count[s1.charAt(i)-'a']--;
            count[s2.charAt(i)-'a']++;
        }
        count[s2.charAt(n)-'a']++;
        for(int i=0;i<26;i++){
            if(count[i]==1){
                return (char)(i+'a');
            }
        }
        return 0;
    }

    //solution 3: Bitwise op - XOR -  if both are same then res = 0 else res = 1 
    // s1 = abc and s2 = acba and res = 0 
    // res = 0 ^ 'a' ^ 'b' ^ 'c' ^ 'a' ^ 'c' ^ 'b' ^ 'a'
    // res = 'a'
    char findExtraByBitwise(String s1, String s2){
        int res=0;
        int n  = s1.length();
        for(int i=0;i<n;i++){
            res= res ^ s1.charAt(i) ^ s2.charAt(i);
        }
        res = res ^ s2.charAt(n);
        return (char)res;
    }

    public static void main(String[] args) {
        findOneExtraChar obj = new findOneExtraChar();
        String s1 = "abcd";
        String s2 = "abecd";
        System.out.println("Sorting: "+obj.findExtra(s1, s2));
        System.out.println("Counting: "+obj.findExtraByCounting(s1, s2));
        System.out.println("Bitwise: "+obj.findExtraByBitwise(s1, s2)); 
    }
}
