package stringAlgorithms;

import java.util.regex.Pattern;

public class ReverseWordsMain {

    public static void main(String[] args) {

        //Solution-1
        String myString = "I love programming";
        String[] strings = myString.split(" ");
        String result = "";

        for(int i = strings.length-1;i>=0;i--){
            result += strings[i] + " ";
        }
        System.out.println("Reversed String : ");
        System.out.println(result.substring(0, result.length()-1));

        //Solution-2
        String anotherString = "I learn programming";
        System.out.println(reverseWords(anotherString));

    }

    private static String reverseWords(String str){

        Pattern pattern = Pattern.compile("\\s");

        String[] temp = pattern.split(str);
        String result = "";

        for(int i=0;i<temp.length;i++){
            if(i == temp.length - 1){
                result = temp[i] + result;
            }else{
                result = " " + temp[i] + result;
            }
        }

        return result;
    }

}
