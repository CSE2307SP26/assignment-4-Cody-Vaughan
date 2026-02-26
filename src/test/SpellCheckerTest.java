package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpellCheckerTest {

	@Test
	void test() {
		        //1. Construct objects to be tested


        SpellChecker checker = new SpellChecker();


        //2. Call the method being tested


        int words = checker.getNumberOfWords();


        //3. Assert the expected results


        assertEquals(0, words);
    }


    @Test
    void testAddingWord() {


        SpellChecker checker = new SpellChecker();




        checker.addWord("test");




        assertEquals(1, checker.getNumberOfWords());
    }


    @Test
    void testAddingDuplicateWord() {


        SpellChecker checker = new SpellChecker();




        checker.addWord("test");


        checker.addWord("test");




        assertEquals(1, checker.getNumberOfWords());


    }


    @Test
    void testWordProperlySpelled(){




        SpellChecker checker = new SpellChecker();


        checker.addWord("test");


        assertEquals(true, checker.isProperlySpelled("test"));






    }


    @Test
    void testWordImproperlySpelled(){


        SpellChecker checker = new SpellChecker();




        checker.addWord("test");
)


        assertEquals(false, checker.isProperlySpelled("estt"));




    }


    @Test
    void testIgnoresCase(){


        SpellChecker checker = new SpellChecker();


        checker.addWord("test");


        assertEquals(true, checker.isProperlySpelled("teSt"));


    }


    @Test
    void testGivesSuggestion(){


        SpellChecker checker = new SpellChecker();


        checker.addWord("test");


        assertEquals("test", checker.getSuggestion("estt"));


    }


    @Test
    void testSuggestionWithProperlySpelledWord()){
       
        SpellChecker checker = new SpellChecker();


        checker.addWord("test");


        assertEquals("test", checker.getSuggestion("test"));


    }


    @Test
    void testRemovingWord(){


        SpellChecker checker = new SpellChecker();


        checker.addWord("test");


        checker.removeWord("test");


        assertEquals(0, checker.getNumberOfWords());


    }


    @Test
    void testSortingWords(){


        SpellChecker checker = new SpellChecker();


        checker.addWord("test");


        checker.addWord("apple");
       
        checker.addWord("banana");


        String[] sortedWords = checker.sortWords();


        assertArrayEquals(new String[] {"apple", "banana", "test"}, sortedWords);


    }








}

