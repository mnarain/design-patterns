package sr.unasat.designpatterns.patterns.momento;

public class Memento {
   private String state;

   public Memento(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }	
}