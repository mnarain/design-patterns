package sr.unasat.designpatterns.patterns.momento;

public class Originator {
   private String state;

   public void setState(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }

   public Memento saveStateToMemento(){
      return new Memento(state);
   }

   public void getStateFromMemento(Memento memento){
      if (memento == null){
         return;
      }
      state = memento.getState();
   }



}