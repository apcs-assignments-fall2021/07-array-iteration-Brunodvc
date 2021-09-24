public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] newarray = new int[arr.length];
        int counter = 0;
        for (int i = arr.length-1; i>=0; i--){
            System.out.println(i);
            newarray[counter] = arr[i];
            counter ++;

        }
        return newarray;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int greatest = -10000;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }
        int newgreatest = -100000;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] > newgreatest && arr[i] != greatest) {
                newgreatest = arr[i];
            }
        }
        return newgreatest;
    }

    // This method is given a word, and it checks to see
    // if it was spelled correctly. The method only considers
    // words in the array dictionary as valid words
    // The method returns true is the word is spelled correctly
    // and false otherwise
    public static boolean spellCheck(String word) {
        // Don't edit this array
        // This is our dictionary of valid words
        String[] dictionary = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","cat","dog","cats","dogs"};

        for (int i = 0; i< dictionary.length; i++){
            if (word.equals(dictionary[i])){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
