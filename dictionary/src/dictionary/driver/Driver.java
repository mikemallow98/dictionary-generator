package dictionary.driver;

import dictionary.document.DocumentI;
import dictionary.document.LineBasedDocumentHandler;
import dictionary.tokenizer.Tokenizer;
import dictionary.util.Term;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Driver{
	public static void main(String[] args){
		DocumentI docHandler;
		List<Term> terms = new ArrayList<Term>();
		try{
			docHandler = new LineBasedDocumentHandler("test.txt");
			terms = (List<Term>) docHandler.parseTerms();
			for(int i = 0; i < terms.size(); i++){
				Term tmp = (Term) terms.get(i);
				System.out.println(tmp.getTerm() + "\t" + tmp.getDocID());
			}
		} catch(IOException e) {
			e.printStackTrace();
		}

	}
}

