package org.apache.maven.plugin;

import org.apache.maven.plugins.Dictionary;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DictionaryTest {

    private Dictionary dictionary = Dictionary.getInstance();

    @Test
    public void testIsWord() {
        Assert.assertTrue(dictionary.isWord("parameter"));
    }

    @Test
    public void testSuggest() {
        long start = System.currentTimeMillis();
        List<String> suggestion = dictionary.suggest("father");
        System.out.println(System.currentTimeMillis() - start);

        System.out.println(suggestion);

    }

}
