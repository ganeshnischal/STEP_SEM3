package main.StringOperations.AssigmentProblems;

class WordFrequency {
    void printFilteredWordFrequency(String feedback) {
        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");
        String[] words = feedback.split("\\s+");
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};
        String[] uniqueWords = new String[words.length];
        int[] frequency = new int[words.length];
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean isStopWord = false;
            for (int j = 0; j < stopWords.length; j++) {
                if (words[i].equals(stopWords[j])) {
                    isStopWord = true;
                    break;
                }
            }
            if (!isStopWord) {
                int position = -1;
                for (int j = 0; j < count; j++) {
                    if (uniqueWords[j].equals(words[i])) {
                        position = j;
                        break;
                    }
                }
                if (position == -1) {
                    uniqueWords[count] = words[i];
                    frequency[count] = 1;
                    count++;
                } 
                else {
                    frequency[position]++;
                }
            }
        }
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (frequency[i] < frequency[j]) {
                    int temp = frequency[i];
                    frequency[i] = frequency[j];
                    frequency[j] = temp;
                    String tempWord = uniqueWords[i];
                    uniqueWords[i] = uniqueWords[j];
                    uniqueWords[j] = tempWord;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(uniqueWords[i] + ": " + frequency[i]);
        }
    }
}