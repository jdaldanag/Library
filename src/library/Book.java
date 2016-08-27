package library;
import java.util.Date;

public class Book {
    private Author author = new Author();
    private String title;
    private int numPages;
    private boolean fiction;
    
    public String getAuthor(){
        return this.author.getName()+ " " + author.getBirthDate();}
    
    public String getTitle(){
        return this.title;}
    
    public int getPages(){
        return this.numPages;}
    
    public boolean getGenre(){
        return this.fiction;}
    
    public void setAuthor(String name,String date){
        this.author.setName(name);
        this.author.setBirthDate(date);}
    
    public void setTitle(String title){
        this.title = title;}
    
    public void setPages(int pages){
        this.numPages = pages;}
    
    public void setGenre(boolean genre){
        this.fiction = genre;}
}
