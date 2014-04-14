package student;
import java.util.Collection;

import testdb.Test;
import userdb.Student;

/**
 * StudentAnswers is a class designed to store a collection of answers
 * linked to the appropriate test and student
 * answers is the collection of answers submitted by the student
 * student is the student who submitted the answers
 * test is the test for which the answers are for
 */
public abstract class StudentAnswers {
   Collection<Answer> answers;
   Student student;
   Test test;

   /**
    * adds an answer to the Collection of answers
    * @param answer - the answer to add to the collection
    */
   abstract void addAnswer(Answer answer);

   /**
    * removes an answer from the Collection of answers
    * @param answer - the answer to remove from the collection
    */
   abstract void removeAnswer(Answer answer);

   /**
    * updates the existing answer from the collection of answers
    * @param answer - the answer to update
    */
   abstract void updateAnswer(Answer answer);
}