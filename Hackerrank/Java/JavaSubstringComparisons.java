/*
Input Format
The first line contains a string denoting s.
The second line contains an integer denoting k.

Constraints
1 <= |s| <= 1000
s consists of English alphabetic letters only (i.e., [a-zA-Z]).

Output Format
Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

Sample Input 0
welcometojava
3

Sample Output 0
ava
wel
 */


import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String[] subString = new String[s.length()-k+1];
        String[] subStringSorted = new String[subString.length];
        int i;
        for (i = 0; i < s.length()-k+1; i++){
            subString[i] = s.substring(i, i+k);
        }
        subStringSorted = sort(subString);

        smallest = subStringSorted [0];
        largest = subStringSorted [s.length()-k];

            return smallest + "\n" + largest;
    }

    public static String[] sort (String[] arr){
        int size = arr.length;
        String temp;
        for(int i = 0; i<size-1; i++)
        {
            for (int j = i+1; j<arr.length; j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
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
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}