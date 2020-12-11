package sr.unasat.designpatterns.patterns.state;

public class StatePatternDemo {
   public static void main(String[] args) throws Exception {
      Context context = new Context();

      PauseState pauseState = new PauseState();
      pauseState.doAction(context);
      System.out.println(context.getState().toString());

      StartState startState = new StartState();
      startState.doAction(context);
      System.out.println(context.getState().toString());

      StopState stopState = new StopState();
      stopState.doAction(context);
      System.out.println(context.getState().toString());


   }
}