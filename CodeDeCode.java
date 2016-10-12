import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Math;
public class CodeDeCode{
  public static void main(String[]args){
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    //String[] alphabet = alphabetIn.split("");
    ArrayList<Integer> index = new ArrayList<Integer>();
    String input = "wxyz";
    int value = 3;
    for(int x=0;x<input.length();x++){
      for(int y=0;y<alphabet.length();y++){
        if(input.substring(x,x+1).equals(alphabet.substring(y,y+1)))
          index.add(y);
      }
    }
    decode(index, value, alphabet);
  }
  public static void code(ArrayList<Integer>index, int value, String alphabet){
    String fin="";
    for(int i=0; i<index.size();i++){
      int current = index.get(i)+value;
      if(current>= 26){
        current=Math.abs(current-26);
      }
      fin+=alphabet.substring(current, current+1);
    }
  System.out.println(fin);
  }
  public static void decode(ArrayList<Integer>index, int value, String alphabet){
    String fin="";
    for(int i=0; i<index.size();i++){
      int current = index.get(i)-value;
      if(current<=0){
        current=Math.abs(current-26);
      }
      fin+=alphabet.substring(current, current+1);
    }
  System.out.println(fin);
  }
}
