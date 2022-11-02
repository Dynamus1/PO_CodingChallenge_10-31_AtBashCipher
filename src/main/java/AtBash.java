import java.util.HashMap;
import java.util.Map;

public class AtBash {

    public static Map<Character,Character> map = new HashMap<>();

    public static String atBashCipher(String string){
        StringBuilder sb = new StringBuilder(string);

      for(int i = 0; i < string.length();i++){
          if(map.keySet().contains(sb.charAt(i))){
              sb.setCharAt(i, map.get(sb.charAt(i)));
          }
      }

      System.out.println(sb.toString());
      return sb.toString();
    };
}
