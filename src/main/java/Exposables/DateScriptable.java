package Exposables;

import org.mozilla.javascript.ScriptableObject;

import java.util.Date;

public class DateScriptable extends ScriptableObject {

    @Override
    public String getClassName() {
        return "DateSC";
    }
    public Date date;
    public void jsConstructor() {
        date = new Date();
    }

    public String jsFunction_toString(){
        return date.toString();
    }
}
