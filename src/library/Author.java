package library;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Author {
    private String name;
    private Date birthDate;
    SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd");
    
    public Author(){}
    
    public String getName(){
        return this.name;}
    
    public String getBirthDate(){
        return this.df.format(birthDate);}
    
    public void setName(String name){
        this.name = name;}
    
    public void setBirthDate(String dateS){
        
        Date date = new Date();
        
        try { date=df.parse(dateS);}
        catch (ParseException e) {
            e.printStackTrace();}
    
        this.birthDate = date;}
}