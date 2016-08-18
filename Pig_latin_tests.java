package com.tiy.ssa.piglatin;
import static org.junit.Assert.*;

import org.junit.Test;


public class Pig_latin_tests {
	
	@Test
	public void test()
	{
		assertEquals("", "no idea", new PigLatin("played sprayed spayed hay die with me too") .translateWord());
	assertEquals("", "no idea", new PigLatin("screaming schools spell the phosphorus die with me too") .translateWord());
	}
	
}
