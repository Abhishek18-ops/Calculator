import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringToBinary {
    public static void main(String[] args) {
        String input ;
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        String result = convertStringToBinary(input);
        //System.out.println(result);
        //pretty print the binary format
        System.out.println(prettyBinary(result,8," "));


    }
    public static String convertStringToBinary(String input){
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for(char achar : chars){
            result.append(String.format("%8s" , Integer.toBinaryString(achar)).replaceAll(" ","0"));

        }
        return result.toString();
    }
    public static String prettyBinary(String binary , int blockSize,String separator){
        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < binary.length()){
            result.add(binary.substring(index,Math.min(index + blockSize,binary.length())));
            index += blockSize;

        }
        return result.stream().collect(Collectors.joining(separator));
    }
}
