/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement){

		String response = "";
		String newStatement = statement.trim().toLowerCase();

		if (newStatement.indexOf("no") >= 0){
			response = "Why so negative?";
		}

		else if (newStatement.trim().equals("")){
			response = "Why you typing black space at me???";
		}

		else if (newStatement.indexOf("wat's up") >= 0){
			response = "Wat's up dog!";
		}

		else if (newStatement.indexOf("who are you") >= 0){
			response = "I am a bot !!!";
		}

		else if (newStatement.indexOf("yo") >= 0){
			response = "Yo! Yo!! Yo!!!";
		}

		else if (newStatement.indexOf("loser") >= 0){
			response = "You are a loser!";
		}

		else if (newStatement.indexOf("cool") >= 0){
			response = "yup! its cool!";
		}

		else if (newStatement.indexOf("cat") >= 0
			|| statement.indexOf ("dog") >= 0 ){
			response = "I love pets! Tell me more!!";
		}

		else if (newStatement.indexOf("Baker") >= 0){
			response = "He is pretty cool :).";
		}

		else if (newStatement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0){
			response = "Tell me more about your family.";
		}

		else{
			response = getRandomResponse();
		}

		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}
}
