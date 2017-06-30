/**
 * Creating a class Add
 * @author Pri
 *
 */
public class Add {
	
		//main method of our class
			public static void main(String[] args) {
				// taking the integer value
		        int x = 5;
		      //this for  loop will run till the number of times specified in command line
		        for (int i = 0; i < args.length; i++) {
		        	//Applying parseInt method this will  convert the argument into the String
		            x = x + Integer.parseInt(args[i]);
		        }
		        System.out.println("The sum of the arguments passed is " + x);
		    }
		}

