public class Main {
   public static void main(String[] args) {
      String sentence = "Hello, World!";
      StringBuilder newSentence = new StringBuilder();

      newSentence = newSentence.insert(0,sentence);
      newSentence = newSentence.replace(1,2,"o");
      newSentence = newSentence.replace(4,5,"e");
      newSentence = newSentence.replace(8,9,"e");

      System.out.println(newSentence);
   }
}