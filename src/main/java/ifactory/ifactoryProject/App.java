package ifactory.ifactoryProject;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonProcessingException
    {
    	JsonTestClass json = new JsonTestClass();
    	System.out.println(json.userToJson());
        
    }
}
