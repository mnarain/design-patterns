package sr.unasat.designpatterns.patterns.state;

public class PauseState implements State {

   public void doAction(Context context) throws Exception {
      if (!(context.getState() instanceof StartState)) {
         throw new Exception("Deze handeling kan niet uitgevoerd worden gezien de player nog niet is gestart.");
      }
      System.out.println("Player is in pause state");
      context.setState(this);	
   }

   public String toString(){
      return "Pause State";
   }
}