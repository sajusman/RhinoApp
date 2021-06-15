package Scripting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaScriptWrapper {
    StringBuilder script = new StringBuilder();

    public JavaScriptWrapper(String path){
        importScript(path);
    }

    private void importScript(String path){
        try {
            File file = new File(path);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                script.append(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getScript() {
        return script.toString();
    }

}
