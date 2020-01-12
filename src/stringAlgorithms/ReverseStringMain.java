package stringAlgorithms;

public class ReverseStringMain {

    public static void main(String[] args) {

        String string = "My new String";

        char[] charArray = string.toCharArray();
        for(int i = charArray.length-1; i>=0; i--){
            System.out.println(charArray[i]);
        }

        byte[] strAsByteArray = string.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        for(int i=0; i<strAsByteArray.length; i++){
            result[i] = strAsByteArray[strAsByteArray.length-i-1];
        }
        System.out.println(new String(result));

        //swapping
        char[] tempArray = string.toCharArray();
        int left, right = 0;
        right = tempArray.length-1;
        for(left = 0;left<right; left++,right--){
            char temp = tempArray[left];
            tempArray[left] = tempArray[right];
            tempArray[right] = temp;
        }
        for (char c: tempArray){
            System.out.println(c);
        }
        System.out.println(new String(tempArray));

    }

}
