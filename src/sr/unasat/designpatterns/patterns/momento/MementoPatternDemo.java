package sr.unasat.designpatterns.patterns.momento;

public class MementoPatternDemo {
   public static void main(String[] args) {
   
      Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();
      
      originator.setState("State #1");
      originator.setState("State #2");
      careTaker.add(originator.saveStateToMemento());
      
      originator.setState("State #3");
      careTaker.add(originator.saveStateToMemento());

      
/*      originator.getStateFromMemento(careTaker.get(0));
      System.out.println("First saved State: " + originator.getState());
      originator.getStateFromMemento(careTaker.get(1));
      System.out.println("Second saved State: " + originator.getState());*/

      if(careTaker.undo() != null){
         originator.setState(careTaker.undo().getState());
      }else{
         originator.setState(null);
      }
      originator.getStateFromMemento(careTaker.undo());
      System.out.println("state after undo: " + originator.getState());

      if(careTaker.undo() != null){
         originator.setState(careTaker.undo().getState());
      }else{
         originator.setState(null);
      }
      originator.getStateFromMemento(careTaker.undo());
      System.out.println("state after undo: " + originator.getState());

   }
}