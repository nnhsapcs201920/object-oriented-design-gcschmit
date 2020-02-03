import java.util.Scanner;

/**
This program shows a simple quiz with one question.
 */
public class QuestionDemo1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Question q = new FillInQuestion("The inventor of Java is _James Gosling_.");

        System.out.println( q );
        System.out.print("Your answer: ");
        String response = in.nextLine();

        /*
         * The FillInQuesiton class inherits the checkAnswer method. We don't need to override it
         *      because the inherited behavior is what is needed. Inheriting a method improves
         *      reliability (implemented in one place) and developer productivity (avoid rewriting
         *      the same code). Image if we had a dozen subclasses.
         */
        System.out.println(q.checkAnswer(response));
        
        ChoiceQuestion q2 = new ChoiceQuestion("Who founded Apple?");
        q2.addChoice("Bill Gates", false);
        q2.addChoice("Steve Jobs", true);
    }
}

