public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "alice", "bob", "pippo", "pluto"};

        for (String word : words) {
            String result;
            if(word == ""){
                result = "";
                System.out.println(result);
            }
            else{
            String first = word.substring(0,1);
            result = first.toUpperCase() + word.substring(1);
            System.out.println(result);
            }
        }
    }
}