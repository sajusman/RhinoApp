package Scripting;
import Exposables.CounterScriptable;
import Exposables.DateScriptable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

import java.lang.reflect.InvocationTargetException;

public class ScopeBuilder{

    public static Scriptable build(Context cx) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Scriptable scope = cx.initStandardObjects();
        ScriptableObject.defineClass(scope, CounterScriptable.class);
        ScriptableObject.defineClass(scope, DateScriptable.class);
        return scope;
    }
}
