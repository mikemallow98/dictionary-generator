package dictionary.document;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import dictionary.util.FileParser;
import dictionary.util.Term;


/**
 * This class takes one file and treats each line in the file as a 
 * separate document
 * 
 * @author Mike Mallow
 */ 
public class LineBasedDocumentHandler implements DocumentI{
	private FileParser fp;
	private List<Term> terms;
	
	/**
	 * @param filenameIn the file which will be used as input.
	 */ 
	public LineBasedDocumentHandler(String filenameIn) throws FileNotFoundException, IOException{
			fp = new FileParser(filenameIn);
			terms = new ArrayList<Term>();
	}
	
	/**
	 * retrieves a list of terms from the fileparser
	 */ 
	public List<Term> parseTerms(){
		String nextTerm;
		int documentCounter = 0;
		Term temp;
		try{		
			nextTerm = fp.poll();
		} catch(IOException e){
			e.printStackTrace();
			return terms;
		} 
		while(null != nextTerm){
			temp = new Term(nextTerm, documentCounter);
			terms.add(temp);
			try{
				nextTerm = fp.poll();
				documentCounter++;
			} catch(IOException e){
				e.printStackTrace();
				return terms;
			}
		}
		fp.close();
		return terms;
	}
}
