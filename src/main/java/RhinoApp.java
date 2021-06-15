import Scripting.JavaScriptWrapper;
import Scripting.ScriptExecutor;

import java.io.IOException;

public class RhinoApp {
    public static void main(String[] args) {
        JavaScriptWrapper javaScriptWrapper = new JavaScriptWrapper("src/main/java/Scripts/test.js");
        ScriptExecutor.Run(javaScriptWrapper.getScript());
    }
}
