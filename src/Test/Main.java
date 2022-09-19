package Test;

public class Main {
    public static void main(String[] args) {
        String answer = replaceWordInSentence("My name is Isaiah", "Isaiah", "");
        System.out.println(answer);



    }


    // My name is Isaiah // Isaiah // David
    public static String replaceWordInSentence ( String sentence, String oldWord, String newWord) {

        String result = "";

        if (!sentence.equals("") && sentence.contains(oldWord) ) {
            String [] words = sentence.split(" ");
            for (String word : words) {

                if (word.equals(oldWord)){
                    word = newWord;
                }
                result += " " + word;
            }
        }
        else {
            return "THE SENTENCE IS EITHER EMPTY OR IT DOES NOT CONTAIN THE OLDWORD";
        }

        return result;
    }

}