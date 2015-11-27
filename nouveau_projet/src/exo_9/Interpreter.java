package exo_9;

import java.util.Hashtable;

abstract class Interpreter {
	protected Stack history = new Stack();
	protected Hashtable set = new HashTable();

	public void session() {
	while(true)  {
		   Command command = getNewCommand();
		if (command instanceof Quit) {return ;}
		else { command.execute();  }
	      }
	abstract protected Command getNewCommand() {
		String s = input.getString();
		while (! set.containsKey(s)) {
			display.printError("Not a valid command; try again !");
			s= input.getString();
		  }
		return ((Command)set.get(s)).clone();
	   }
    }	
}
