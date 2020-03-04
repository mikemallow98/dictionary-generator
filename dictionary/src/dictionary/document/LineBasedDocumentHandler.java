package dictionary.document;

import java.io.FileNotFoundException;
import java.io.IOException;

import dictionary.util.FileParser;


/**
 * This class takes one file and treats each line in the file as a 
 * separate document
 * 
 * @author Mike Mallow
 */ 
public class LineBasedDocumentHandler implements DocumentI{
	FileParser fp;
	
	/**
	 * @param filenameIn the file which will be used as input.
	 */ 
	public LineBasedDocumentHandler(String filenameIn) throws FileNotFoundException, IOException{
			fp = new FileParser(filenameIn);
	}
	
	/**
	 * retrieves a list of terms from the fileparser and then
	 * tokenizes them
	 */ 
	public void parseTerms(){
	
	}
}
