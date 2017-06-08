/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

/**
 *
 * @author Kailey
 *
 */
import java.io.IOException;
import java.io.StringWriter;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;



public class JsonExample {
    
    public static void main(String[] args) throws IOException, ParseException{
        JSONObject obj = new JSONObject();
        
        obj.put("Name", "Kailey");
        obj.put("num", new Integer(100));
        obj.put("balance", new Double(1000.21));
        obj.put("is_vip", new Boolean(true));
        
        StringWriter out = new StringWriter();
        obj.writeJSONString(out);
        
        String jsonText = out.toString();

        System.out.print(jsonText);
        
        JSONParser parser = new JSONParser();
        String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
        
        try{
            Object obj2 = parser.parse(s);
            JSONArray array = (JSONArray)obj2;
            
            System.out.println("The 2nd element of the array:");
            System.out.println(array.get(1));
            System.out.println();
            
            JSONObject obj3 = (JSONObject)array.get(1);
            System.out.println("Field \"1\"");
            System.out.println(obj3.get("1"));
            
            s = "{}";
            obj2 = parser.parse(s);
            System.out.println(obj2);
            
            s = "[5,]";
            obj2 = parser.parse(s);
            System.out.println(obj2);

            s = "[5,,2]";
            obj2 = parser.parse(s);
            System.out.println(obj2);
        }catch(ParseException pe){
            
            System.out.println("position: " + pe.getPosition());
            System.out.println(pe);
        }
        
        
    }
    
}
