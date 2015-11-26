package ex3_9;

public abstract class Command  implements Cloneable  {
    public abstract void execute();
	public abstract void undo();

}

class Undo extends Command {
  protected Stack history;
  public Undo(Stack h) { history = h; }
  public void execute() { ((Command) history.top()).undo();}
  public void undo() {  }
  
}