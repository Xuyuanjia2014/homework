import soot.BodyTransformer;
import soot.PackManager;
import soot.Transform;
import soot.options.Options;

import java.util.LinkedList;
import java.util.List;

public class Example {
    private Integer age;
    public void run(String dir){
        Printer printer = new Printer();

        Transform t1 = new Transform("jtp.Printer", printer);
        PackManager.v().getPack("jtp").add(t1);

        int size = 4;
        String[] soot_args = new String[size];
        soot_args[0] = "-process-dir";
        soot_args[1] = dir;
        soot_args[2] = "-pp";
        soot_args[3] = "-allow-phantom-refs";
        soot.Main.main(soot_args);
    }

    public Integer killYou(){
        Integer res = this.age;
        if(this.age > 20){
            System.out.println(" kill you.");
            res = 20;
        }
        else{
            System.out.println(" kill me.");
            res = 18;
        }
        return this.age+res;
    }

    public static void main(String[] args){
        List<String> processDir = new LinkedList<String>();
        processDir.add("E:\\codes\\homework\\soot-tools\\soot-tools\\soot\\target\\classes");
        Options.v().set_process_dir(processDir);
        Example example = new Example();
        example.run("E:\\codes\\homework\\soot-tools\\soot-tools\\soot\\target\\classes");
    }
}
