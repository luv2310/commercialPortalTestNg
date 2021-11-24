package poc;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.swing.DebugGraphics;

import org.json.JSONArray;
import org.json.JSONObject;

import com.muDomastic.qa.util.TestUtil;

public class httpgetrequest {
	static TestUtil action = new TestUtil();
	static boolean t =true;

	public static void main(String[] args) {  

	    Logger logger = Logger.getLogger("MyLog");  
	    FileHandler fh;  

	    try {  

	        // This block configure the logger with handler and formatter  
	        fh = new FileHandler(System.getProperty("user.dir")+"/LogFile.log");  
	        logger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter);  

	        // the following statement is used to log any messages  
	        logger.info("My first log");  

	    } catch (SecurityException e) {  
	        e.printStackTrace();  
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    }  

	    logger.info("Hi How r u?");  

	}
}






