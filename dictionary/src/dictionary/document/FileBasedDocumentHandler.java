package dictionary.document;

import java.util.List;
import dictionary.util.Term;

/**
 * This class takes multiple files and treats each file as a 
 * separate document.
 * 
 * @author Mike Mallow
 */ 
public class FileBasedDocumentHandler implements DocumentI{
	List<Term> terms;
	
	public List<Term> parseTerms(){ return terms;}
	
}
