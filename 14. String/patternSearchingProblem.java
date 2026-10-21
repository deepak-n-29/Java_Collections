public class patternSearchingProblem {

    // I/P: txt = "Geeks for Geeks", pat = "Geeks"
    // O/P: 0 10
    static void patternExist(String txt, String pat) {
        int pos = txt.indexOf(pat);
        while (pos>=0) {
            System.out.print(pos + " ");
            pos = txt.indexOf(pat, pos + 1);
        }
    }

    static void patternExistWithoutInBuilt(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        for(int i=0;i<=n-m;i++) {
            int j;
            for(j=0;j<m;j++){
                if(txt.charAt(i+j)!=pat.charAt(j)) break;
            }
            if(j==m) {
                System.out.print(i + " ");
            }
        }
    }

    // I/P: 123.45
    // O/P: 45
    static String printPatternAfterDecimal(String num){
        int pos = num.indexOf('.');
        if(pos<0) return "";
        return num.substring(pos+1);
    }

    public static void main(String[] args) {
        String txt = "Geeks for Geeks";
        String pat = "Geeks";
        patternExist(txt, pat);
        System.out.println();
        patternExistWithoutInBuilt(txt, pat);
        System.out.println();
        String num = "123.45";
        System.out.println(printPatternAfterDecimal(num));
    }
    
}
