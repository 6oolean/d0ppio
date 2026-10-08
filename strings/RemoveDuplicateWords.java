public class RemoveDuplicateWords{
    public static void main(String[] args){
        String s = "happy happy birthday to you";
        String[] str = s.split(" ");
        String res = "";

        for(int i=0; i<s.length(); i++){
            if(!res.contains(str[i]))
                res += str[i] + " ";
        }
        System.out.println(res.trim());
    }
}