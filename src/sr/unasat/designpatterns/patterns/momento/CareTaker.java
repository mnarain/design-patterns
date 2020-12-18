package sr.unasat.designpatterns.patterns.momento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
   private List<Memento> mementoList = new ArrayList<Memento>();

   public void add(Memento state){
      mementoList.add(state);
   }

   public Memento get(int index){
      return mementoList.get(index);
   }

   public Memento undo(){
      if (mementoList.size() <= 0) {
         return null;
      }
      Memento memento = mementoList.get(mementoList.size() - 1);
      mementoList.remove(mementoList.size()-1);
      return memento;
   }
}