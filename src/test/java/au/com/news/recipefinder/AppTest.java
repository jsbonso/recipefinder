package au.com.news.recipefinder;

import java.util.List;

import au.com.news.recipefinder.model.Fridge;
import au.com.news.recipefinder.model.Recipe;
import au.com.news.recipefinder.util.GenUtil;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Recipe Finder RecipeFinder.
 */
public class AppTest 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest( String testName ){
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( AppTest.class );
	}

	/**
	 * Test the Recipe Finder
	 */
	public void testRecipeFinder()
	{
		List<Fridge> fridgeList;
		List<Recipe> recipeList;
		
		RecipeFinder.fridgeList = GenUtil.getFridge();
		RecipeFinder.recipeList = GenUtil.getRecipes();
		
		Recipe recommendedRecipe = RecipeFinder.process();
		
		System.out.println("Recommended Recipe: " + recommendedRecipe.getName());
		
		assertTrue(recommendedRecipe != null);
	}
	
	
}
