class Sentence {
    private static final String punctuationSymblos = ";:,.!?";

    Sentence(String s) {
        String[] splitString = s.split("(?=[,.!?])|\\s");

        Words[] words = new Words[splitString.length];
        Punktuation[] punctuations = new Punktuation[splitString.length];

        for (int i = 0; i < splitString.length; i++) {

            if (punctuationSymblos.contains(splitString[i])) {
                punctuations[i] = new Punktuation(splitString[i]);
            } else {
                words[i] = new Words(splitString[i]);
            }

        }
    }
}
