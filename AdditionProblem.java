public class AdditionProblem {
//	public static void main(String[] args) { 	I want to use this piece of code correctly in order to make this class the main
    private int x,y,answer;

    public AdditionProblem() {
         x = (int)(10 + 40*Math.random());
         y = (int)(30 * Math.random());
         answer = x + y;
     }

    public String getProblem() {
    return "Compute the sum: " + x + " + " + y;
    }

    public int getAnswer() {
    return answer;
    }
    }
//}	
