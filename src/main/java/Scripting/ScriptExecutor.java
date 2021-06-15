package Scripting;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class ScriptExecutor {

    public ScriptExecutor(){

    }
    public static void Run(String jsSource){
        // Creates and enters a Context. The Context stores information
        // about the execution environment of a script.
        Context cx = Context.enter();
        try {
            // Initialize the standard objects (Object, Function, etc.)
            // This must be done before scripts can be executed. Returns
            // a scope object that we use in later calls.
            Scriptable scope = ScopeBuilder.build(cx);
            // Now evaluate the string we've colected.
            Object result = cx.evaluateString(scope, jsSource, "<cmd>",     2, null);

            System.err.println(Context.toString(result));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Exit from the context.
            Context.exit();
        }
    }
}
