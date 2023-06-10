package  dspracticeproblems;
public class IsUniqueCharacter {
 
    static boolean isGivenCharacterUnique(String value){
        if(value.length()>128) 
            return false; 

        boolean[] chars = new boolean[128];
        for(int i=0;i<value.length();i++){
            char c = value.toLowerCase().charAt(i);
            if(chars[c]){
                return false;
            }
            chars[c] = true;
        }

        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isGivenCharacterUnique("Anitha"));
    }
}
