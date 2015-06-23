import static org.junit.Assert.*;

import org.junit.Test;


public class DeleteAllOccursCharTest {

	@Test
	 public void deleteFromBeginning() {
		assertEquals("b",DeleteAllOccursChar.deleteCharIter("ab", 'a'));
		assertEquals("b",DeleteAllOccursChar.deleteChar("ab", 'a'));
		
		assertEquals("bc",DeleteAllOccursChar.deleteCharIter("aaaabc", 'a'));
		assertEquals("bc",DeleteAllOccursChar.deleteChar("aaaabc", 'a'));
	}
	
	@Test
	 public void deleteFromMiddle() {
		assertEquals("acd",DeleteAllOccursChar.deleteCharIter("abcd", 'b'));
		assertEquals("acd",DeleteAllOccursChar.deleteChar("abcd", 'b'));
		
		assertEquals("acd",DeleteAllOccursChar.deleteCharIter("abbcd", 'b'));
		assertEquals("acd",DeleteAllOccursChar.deleteChar("abbcd", 'b'));
	}
	
	@Test
	 public void deleteFromEnd() {
		assertEquals("abc",DeleteAllOccursChar.deleteCharIter("abcd", 'd'));
		assertEquals("abc",DeleteAllOccursChar.deleteChar("abcd", 'd'));
		
		assertEquals("abc",DeleteAllOccursChar.deleteCharIter("abcdd", 'd'));
		assertEquals("abc",DeleteAllOccursChar.deleteChar("abcdd"
				+ "", 'd'));
	}
	
	@Test
	 public void deleteNonExistentChar() {
		assertEquals("abc",DeleteAllOccursChar.deleteCharIter("abc", 'd'));
		assertEquals("abc",DeleteAllOccursChar.deleteChar("abc", 'd'));
	}
	
	@Test
	 public void deleteAllChars() {
		assertEquals("",DeleteAllOccursChar.deleteCharIter("a", 'a'));
		assertEquals("",DeleteAllOccursChar.deleteChar("a", 'a'));
		
		assertEquals("",DeleteAllOccursChar.deleteCharIter("aaaaaaaaaaaaaa", 'a'));
		assertEquals("",DeleteAllOccursChar.deleteChar("aaaaaaaaaaaaaa", 'a'));
	}
	
	@Test
	 public void deleteWithSpaces() {
		assertEquals("this is a test",DeleteAllOccursChar.deleteCharIter("thisX isX aX testX", 'X'));
		assertEquals("this is a test",DeleteAllOccursChar.deleteChar("thisX isX aX testX", 'X'));
		
		assertEquals("this is a test",DeleteAllOccursChar.deleteCharIter("thisx isx ax testx", 'x'));
		assertEquals("this is a test",DeleteAllOccursChar.deleteChar("thisx isx ax testx", 'x'));
	}

}
