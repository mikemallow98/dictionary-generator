package dictionary.document;

import java.util.List;

/**
 * This class takes multiple files and treats each file as a 
 * separate document.
 * 
 * @author Mike Mallow
 */ 
public class FileBasedDocumentHandler implements DocumentI{
	List terms;
	
	public List parseTerms(){ return terms;}
	
}
