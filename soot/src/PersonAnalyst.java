import soot.*;
import soot.baf.BafBody;
import soot.jimple.JimpleBody;
import soot.options.Options;
import soot.toolkits.graph.BriefUnitGraph;
import soot.toolkits.graph.UnitGraph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class PersonAnalyst {
    public static void main(String[] args) {
        System.out.println("good:"+System.getProperty("java.home"));
        List<String> processDir = new LinkedList<String>();
        processDir.add("E:\\codes\\homework\\soot-tools\\soot-tools\\soot\\target\\classes");
        Options.v().set_process_dir(processDir);
        System.out.println(Scene.v().getSootClassPath());
        SootClass sc = Scene.v().loadClassAndSupport("Person");
        sc.setApplicationClass();
        StringBuffer finalString = new StringBuffer();
        finalString.append("Person's methods:\n");
        for(SootMethod temp : sc.getMethods()){
            StringBuffer sb = new StringBuffer("");
            for(Type type: temp.getParameterTypes()){
                if(sb.toString().contains(",")){
                    sb.append(","+type.toQuotedString());
                }
                else {
                    sb.append(type.toQuotedString());
                }
            }

            finalString.append(temp.getReturnType()+" "+temp.getName()+"("+sb.toString()+")\n");
        }
        finalString.append("Person's fields:\n");
        for(SootField temp : sc.getFields()){
            finalString.append(temp.getDeclaration()+" of "+ temp.getDeclaringClass().toString()+"\n");
        }
        System.out.println(finalString.toString());
    }
}