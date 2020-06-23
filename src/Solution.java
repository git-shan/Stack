import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Character,Character> map = new HashMap<Character, Character>();
    public Solution(){
        mapInit();
    }
    private void mapInit(){
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        map.put('<','>');
    }
    public boolean isValid(String s){
        ArrayStack<Character> stack = new ArrayStack<>();
        for (int i =0; i< s.length();i++){
            char c = s.charAt(i);
            if (map.containsKey(c))
                stack.push(c);
            else {
                if(!map.containsValue(c)) continue; //skip none-key characters
                if(stack.isEmpty()) // not left pairing character found
                    return false;

                char topChar = stack.pop();
                if(c != map.get(topChar))// not match
                    return false;
            }

        }
        return stack.isEmpty(); // if all matched then pass
    }
}
