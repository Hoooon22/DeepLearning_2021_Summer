import java.util.*;
import java.util.HashSet;
import java.util.Arrays;
import java.util.HashMap;

public class CharToIntEx {
    
    public static void main(String[] args) {
        String corpus="The earth revolves around the sun the moon revolves around the earth";
        corpus=corpus.toLowerCase();
        String[] puncs= new String[]{".", ",", "!", "?", "'"};
        System.out.println(corpus);
        
        HashSet<String> wordsSet = new HashSet<>(); //set variable to store unique words
        //add each word in corpus to wordsSet. 
        String []words=corpus.split(" ");        
        for(int i=0; i<words.length; i++)
            wordsSet.add(words[i]);
            
        String []wordList= new String[wordsSet.size()]; // list variable to store ordered list of unique words.
        //assign words in wordsSet to wordList to sort
        int index=0;
        for(String w : wordsSet) {
            wordList[index++]=w;
        }
        //sort unique words in words set.
        Arrays.sort(wordList);    
        
        //map words to unique integers
        HashMap<String, Integer> word2IdxMap= new HashMap<>();
        for(int i=0; i<wordList.length; i++) {
            word2IdxMap.put(wordList[i], i);
        }
        
        System.out.println("====mapping result====");
        word2IdxMap.forEach((key, value)
            -> System.out.println(key +": "+value));
    }
}











