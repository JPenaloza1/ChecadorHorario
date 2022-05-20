package checadorhorarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {

    private BufferedWriter bufferedWriter;
    private String ruta;

    public Log(String ruta) {
        this.ruta = ruta;
        this.open(true);
    }
    
    public Log(String ruta, boolean reset) {
        this.ruta = ruta;
        this.open(!reset);
    }
    
    private void open(boolean append) {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(this.ruta, append));
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addLine(String linea) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
            String formatoFecha = formato.format(new Date());
            
            this.open(true);
            this.bufferedWriter.write("[" +formatoFecha+ "] " + linea + "\n" ); 
            this.close();
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String[] getLines() throws FileNotFoundException, IOException {
        ArrayList<String> linesFile = new ArrayList<>();
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader(this.ruta));
        
        String linea;
        
        while( (linea = bufferedReader.readLine()) != null ) {
            linesFile.add(linea);
        }
        
        bufferedReader.close();
        
        bufferedReader.close();
        
        String[] lines = new String[linesFile.size()];
        
        for( int i=0 ; i<linesFile.size() ; i++ ) {
            lines[i] = linesFile.get(i);
        }
        
        return lines;
    }
    
    public void resetLog() throws IOException {
        this.open(false);
        this.close();
    }
    
    private void close() throws IOException {
        this.bufferedWriter.close();
    }
    
}
