package dictionary.util;


/**
 * This class holds the contents and the document ID of a term.
 * 
 * @author Mike Mallow
 */
public class Term{
    private String contents;
    private int docID;

    /**
     * 
     * @param contentsIn the term
     * @param docIDIn the document the term comes from
     */
    public Term(String contentsIn, int docIDIn){
        contents = contentsIn;
        docID = docIDIn;
    }

    /**
     * @return the contents of the term.
     */
    public String getTerm(){
        return contents;
    }

    /**
     * 
     * @return the document ID of the term.
     */
    public int getDocID(){
        return docID;
    }
}