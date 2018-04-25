package scr;

import java.util.Arrays;
import org.antlr.v4.runtime.*;
import java.nio.charset.Charset;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class Errores extends BaseErrorListener
{
   private String listadeerrores = "";

    public void syntaxError( Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) 
    {
    	listadeerrores += listadeerrores + "Linea "+ line + msg + "\n";
    }

	public String mensaje() {
		return listadeerrores;
	}    
    
}