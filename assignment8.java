class SplitSentence {
    public static void main(String[] args) {
        String sentence = "Java is a programming language";

        String[] words = sentence.split(" ");

        String result = "";

        for (String word : words) {
            result += "[" + word + "]";
        }

        System.out.println("New format: " + result);
    }
}
