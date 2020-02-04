import java.util.Scanner;

/**
   This program shows a simple quiz with one question.
*/
public class QuestionDemo1
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      /*
       * In order to invoke the addChoice method on the q2 variable, the type of the q2 variable
       *    must be a ChoiceQuestion (or a subclass of ChoiceQuestion). It cannot be of type
       *    Question, since the Question class does not define the addChoice method.
       *    
       * This is enforced by the Java compiler.
       */
      ChoiceQuestion q2 = new ChoiceQuestion("Who founded Apple?");
      q2.addChoice("Bill Gates", false);
      q2.addChoice("Steve Jobs", true);

      Question q = new FillInQuestion("The inventor of Java is _James Gosling_.");
      // System.out.println( q );
      // System.out.print("Your answer: ");
      // String response = in.nextLine();
      /*
       * The FillInQuestion class inherits the checkAnswer method. We don't need to override it
       *    because the inherited behavior is what is needed. Inheriting a method improve reliability
       *    (implemented in one place) and developer productivity (avoid rewriting the same code).
       *    Imagine if we had a dozen subclasses.
       */
      // System.out.println(q.checkAnswer(response));
      
      Exam exam = new Exam();
      exam.addQuestion(q);
      exam.addQuestion(q2);
      exam.askQuestions();
   }
}

