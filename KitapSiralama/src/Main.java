import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        TreeSet<Book> books = new TreeSet<>(new NameLine());

        //sayfa sayısı için ;
        //TreeSet<Book> books = new TreeSet<>(new PageNumberLine());

        books.add(new Book("masumiyet müzesi",465,"orhan pamuk",2019));
        books.add(new Book("beyoğlunun en güzel abisi",485,"ahmet ümit",2019));
        books.add(new Book("hayvan çiftliği",152,"george orwel",1945));
        books.add(new Book("serenad",500,"zülfü livaneli",2005));
        books.add(new Book("fedai",600,"angutyus",2015));

        for (Book b : books){
            System.out.println(b.getName());
        }

    }
}