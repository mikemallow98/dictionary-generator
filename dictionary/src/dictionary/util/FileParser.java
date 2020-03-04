package dictionary.util;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.InvalidPathException;
import java.io.FileNotFoundException;

/**
 * A file parser which returns the next line in the file.
 * The format of this file is very similar to one I learned in my Design Patterns class,
 * CS442 at Binghamton University
 * 
 * @author Mike Mallow
 */
public class FileParser{
	private BufferedReader parser;
	String line;
	
	/**
	 * @param filenameIn the name of the file to be read.
	 */
	public FileParser(String filenameIn) throws FileNotFoundException, IOException, InvalidPathException, SecurityException{
		//file validation
		if (!Files.exists(Paths.get(filenameIn))) {
			throw new FileNotFoundException("invalid input file or input file in incorrect location");
		}
		parser = new BufferedReader(new FileReader(new File(filenameIn)));
		line = parser.readLine();
	}


	/**
	 * Polls the next line in the file
	 * @return the next line in the file
	 */
	public String poll() throws IOException{
		//check if end of file
		if(null == line){
			return null;
		}
			String retVal = line.trim();
			line = parser.readLine();
			return retVal;
	}
	

	/**
	 * Closes the filereader
	 */
	public void close(){
		try{
			parser.close();
			line = null;
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
