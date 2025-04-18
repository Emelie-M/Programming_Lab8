import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  mik
 * @version 0.1
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }

    @Test
    public void addComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain Surgery for Dummies.", 9899);
        assertEquals(true, salesIte1.addComment("Fred", "Great - I perform brain surgery every week now!", 4));
    }

    @Test
    //question 15
    public void addCommentDup()
    {
        SalesItem salesIte2 = new SalesItem("idk", 3);
        assertEquals(true, salesIte2.addComment("one", "one", 1));
        assertEquals(false, salesIte2.addComment("one", "one", 1));
    }

    @Test
    //question 16
    public void testRating()
    {
        SalesItem salesIte1 = new SalesItem("Book", 100);
        assertEquals(false, salesIte1.addComment("Ru", "comment", 0));
        assertEquals(false, salesIte1.addComment("Jumanji", "comments", 6));
    }

    @Test
    //question 19
    public void mostHelpfulCommentTest()
    {
        SalesItem salesIte1 = new SalesItem("cherry", 10);
        assertEquals(true, salesIte1.addComment("lucy", "meh", 2));
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(0);
        assertEquals(true, salesIte1.addComment("me", "very good", 5));
        salesIte1.upvoteComment(1);
        salesIte1.upvoteComment(1);
        salesIte1.upvoteComment(1);
        salesIte1.upvoteComment(1);
        salesIte1.upvoteComment(1);
        Comment comment1 = salesIte1.findMostHelpfulComment();
        assertEquals("me", comment1.getAuthor());
        assertEquals(5, comment1.getVoteCount());
    }

    @Test
    //question 20
    public void testingAll()
    {
        SalesItem salesIte1 = new SalesItem("cherry", 450);
        assertEquals(true, salesIte1.addComment("lucy", "meh", 3));
        assertEquals("cherry", salesIte1.getName());
        assertEquals(1, salesIte1.getNumberOfComments());
        assertEquals(450, salesIte1.getPrice());
    }
}







