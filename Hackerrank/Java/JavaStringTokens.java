/*
Input Format
A single string, s.

constraints
1 <= length of s <= 4.100000
s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,),
question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).

Output Format

On the first line, print an integer, n, denoting the number of tokens in string s (they do not need to be unique). Next,
print each of the n tokens on a new line in the same order as they appear in input string s.

Sample Input
He is a very very good boy, isn't he?

Sample Output
10
He
is
a
very
very
good
boy
isn
t
he
 */

import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();
        String check = "[!,?._'@\\s]+";
        String[] s2 = s.split(check);
        if(s.length()==0)
            System.out.println(0);
        else if (s.length()>400000)
            System.out.println(0);
        else
            System.out.println(s2.length);
            for (String tokens:s2)
                System.out.println(tokens);

        scan.close();
    }
}

/*
Explanation
We consider a token to be a contiguous segment of alphabetic characters. There are a total of 10 such tokens in string s,
and each token is printed in the same order in which it appears in string s.
 */
