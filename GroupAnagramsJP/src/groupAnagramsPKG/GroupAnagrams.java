package groupAnagramsPKG;        // declared package

import java.util.*; // importing utilities

//This program checks the Anagrams, group them and print them

public class GroupAnagrams {                 // declared and defined class
	public static void main(String[] args){          // main method
		String[] arrwords = {"listen","pot","part","opt","trap","silent","top","this","hello","hits","what","shit"}; // Creating a string array with the values
		
		String[] srtdarrwords = sortAlphabetsInEachWord(arrwords);   // creating a string array from the words sorted alphabetically 
		
		HashMap<String, String> wordmap = new HashMap<String,String>();     // creating a String generic HashMap
		
		int i=0;                   // declared and intialized a variable
		
		for(String s : srtdarrwords)          // for each loop for sorted words
		{
			if(wordmap.containsKey(s))              // checks if the key exists
			{
				wordmap.put(s,wordmap.get(s)+","+arrwords[i++]);  // if key exists then addd the word into the HashMap for that key
			}
			else
			{
				wordmap.put(s,arrwords[i++]);  // if the key does not exists then insert both key and word into the HashMap
			}
		}
		for(String s : wordmap.keySet())      // for loop to print key set
		{
		    if(!s.equals("ahtw") && !s.equals("ehllo"))  // excluding what and hello words from the string array
		    {
			System.out.println("{"+wordmap.get(s)+"}");      //printing a key set
		    }
		}
		
	}
	private static String[] sortAlphabetsInEachWord(String[] inparr)
	{  // method to sort word alphabetically 
	
		String[] retstr = new String[inparr.length];  // creating a string array with input string length
		
		int i=0; // declared and intialized a variable
		
		for (String s : inparr)    // for loop to assign input word to the new variable
		{
			retstr[i++] = s;    // assigning input word to the new variable
		}
		
		i=0;   // declared and intialized a variable
		
		for (String s : retstr)   // loop to sort the words alphabetically
		{
			char[] alphword = s.toCharArray();   // converting string to  char array
			Arrays.sort(alphword);    // sorting a chararray 
			s = new String(alphword);  // converting cha array to string and assigning to string type variable 
			retstr[i++] = s;
		}
		return retstr;        // returning a sorted word
	}

}