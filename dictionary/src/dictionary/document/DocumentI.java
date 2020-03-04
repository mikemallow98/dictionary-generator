package dictionary.document;

import java.util.List;
import dictionary.util.Term;
/**
 * The document interface is implemented by any document handlers.
 * 
 * @author Mike Mallow
 */ 
public interface DocumentI{
	public List<Term> parseTerms();
}
