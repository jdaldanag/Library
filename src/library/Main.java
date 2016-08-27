package library;

public class Main {

    public static void main(String[] args) {
        Book light = new Book();
        
        light.setAuthor("George","2003.11.23");
        light.setTitle("Ice and Fire");
        light.setPages(208);
        light.setGenre(true);
        
        System.out.println(light.getAuthor());
        System.out.println(light.getTitle());
        System.out.println(light.getPages());
        System.out.println(light.getGenre());
    }
    
}
