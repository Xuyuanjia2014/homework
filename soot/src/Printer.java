import soot.Body;
import soot.BodyTransformer;
import soot.SootMethod;
import soot.Unit;
import soot.toolkits.graph.BriefUnitGraph;
import soot.toolkits.graph.UnitGraph;

import java.util.Iterator;
import java.util.Map;

public class Printer extends BodyTransformer {
    protected void internalTransform(Body body, String s, Map<String, String> map) {
        SootMethod method = body.getMethod();
        if(method.getName().equals("main") == false){
            return;
        }
        UnitGraph g=new BriefUnitGraph(body);
        Iterator it=g.iterator();
        while(it.hasNext()){
            Unit u=(Unit)it.next();
        }
        System.out.println(g.toString());
    }
}