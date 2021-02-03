import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length())
            return false;

        a = a.toUpperCase();
        b = b.toUpperCase();
        int[] arrayA = new int[a.length()];
        int[] arrayB = new int[b.length()];

        for (int i = 0; i < a.length(); i++){
            arrayA[i] = (int)a.charAt(i);
            arrayB[i] = (int)b.charAt(i);
        }

        sort(arrayA);
        sort(arrayB);

        for (int i = 0; i < a.length(); i++){
            if (arrayA[i] != arrayB[i])
                return false;
        }
        return true;

    }

    private static int[] sort(int[] arr) {
        int size = arr.length;
        int temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

/*
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For example,
the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If a and b are case-insensitive anagrams, print "Anagrams"; otherwise, print
"Not Anagrams" instead.
*/

/*
Input Format
The first line contains a string denoting a.
The second line contains a string denoting b.
*/

/*
Output Format
Print "Anagrams" if a and b are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.
*/

/*
Constraints
1<=length(a),length(b)<=50
Strings a and b consist of English alphabetic characters.
The comparison should NOT be case sensitive.
*/

/*
Sample Input 0
anagram
margana

Sample Output 0
Anagrams
*/