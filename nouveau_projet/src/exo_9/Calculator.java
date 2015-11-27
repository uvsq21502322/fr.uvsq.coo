package exo_9;

public class Calculator  extends Interpreter {
	Calculator() {
	set.put("quit", new Quit());
	set.put("undo", new Undo());
	set.put("plus", new Plus());
	set.put("min", new Min());	
	set.put("mul", new Mul());
	set.put("div", new Div(history));
	set.put("@accept", new Accept(history));
  }
	
protected Command getNewCommand() {
	String s = input.getString();
	while (! set.containsKey(s)) {
		display.printError("Not a valid command; try again !");
	    s= input.getString();
	}
	return ((Command)set.get(s)).clone();
  }	

	
}

