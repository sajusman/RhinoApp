package Exposables;

import org.mozilla.javascript.ScriptableObject;

public class Counter extends ScriptableObject {

    int count = 0;

    public Counter () { }

    public void jsConstructor(int a) {
        count = a;
    }

    public String getClassName() {
        return "CounterSC";
    }

    public int jsGet_count() {
        return count;
    }

    public void jsFunction_incrementCount(){
        count ++;
    }

    public void jsFunction_decrementCount(){
        count ++;
    }


    public void jsFunction_resetCount() {
        count = 0;
    }
}
