package testtool.models.questiondb;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Question type corresponding with a short answer question
 * The student's answer will be compared with a list of
 * correct keywords, the order of the keywords does not
 * matter for this question.
 *
 * @author RJ Almada (rjalmada@calpoly.edu)
 * @version 21apr14
 *
 */
public class SAQuestion extends Question {
	/**
	 * The collection of keywords that the automatic
	 * grader should be looking for, in any order.
	 */
	Collection<String> correctKWs;
	
	public SAQuestion(String qt, String auth, String lu, String course,
		ArrayList<String> topics, int time, int diff, Collection<String> ckws) {
		this.questionText = qt;
		this.author = auth;
		this.lastUsed = lu;
		this.course = course;
		this.topics = topics;
		this.time = time;
		this.difficulty = diff;
		this.correctKWs = ckws;
	}
}