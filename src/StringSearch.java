/**
 * Created by admin on 25.02.2015.
 */
public class StringSearch {

    public static void main(String[] args){

        String str = "The String class represents character strings. All string literals in Java programs, such as \"abc\", are implemented as instances of this class.";
        String recStr = "literals";
        int recStrlength = recStr.length();
        String subStr = "double";
        int strLength = str.length();
        String foundStr;
        String str1;
        String str2;
        String newStr;

        for (int i=0; i<strLength - recStrlength; i++){
            foundStr = str.substring(i, (i + recStrlength));
            if (foundStr.equalsIgnoreCase(recStr)){
                str1 = str.substring(0, i);
                str2 = str.substring(i + recStrlength, strLength);
                newStr = str1.concat(subStr).concat(str2);
                System.out.println(newStr);
            }
        }

    }

}
