public class Main {
    public static void main(String[] args) {
        String[] words = {"c","ac","pippo"};

        for (String word : words) { /*for(int =0; i<words.length; i++)
                                   String word = words[i])  */
            String result;

            if ( word.length() >= 2){
                String start = word.substring(0, 1);
                String end = word.substring(word.length()-1);
                String center = word.substring(1, word.length()-1) ;
                result = end + center + start;
            }
            else
                result = "Stringa corta";

            System.out.println(result);
        }
    }
}