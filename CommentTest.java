

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }


    @Test
    //question 18
    public void storedCorrectly()
    {
        Comment comment1 = new Comment("lucy", "wow", 3);
        assertEquals("lucy", comment1.getAuthor());
        assertEquals(3, comment1.getRating());
    }

    @Test
    //question 18
    public void upVoteTest()
    {
        Comment comment2 = new Comment("lucy", "wow", 3);
        assertEquals(0, comment2.getVoteCount());
        comment2.upvote();
        comment2.upvote();
        comment2.upvote();
        comment2.upvote();
        comment2.upvote();
        assertEquals(5, comment2.getVoteCount());
    }


    @Test
    //question 18
    public void downVoteTest()
    {
        Comment comment1 = new Comment("lucy", "wow", 3);
        assertEquals(0, comment1.getVoteCount());
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        assertEquals(-3, comment1.getVoteCount());
    }
}





