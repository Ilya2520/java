package prac1;

public class Book {
    String name;
    int pages;
    int currentPage;

    public Book(String n, int a, int b){
        name=n;
        pages=a;
        currentPage=b;
    }
    public Book(String n, int a){
        name=n;
        pages=a;
        currentPage=0;
    }
    public Book( int a, int b){
        name="none";
        pages=a;
        currentPage=b;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    public void isOpen(){
        if (currentPage>0){
            System.out.println("Book is open");
        }
        else{
            System.out.println("Book is close");
        }
    }
    public void nextPage(){
        currentPage+=1;
    }
    public void prevPage(){
        currentPage-=1;
    }
    public void close(){
        setCurrentPage(0);
    }
    public void remaningPages(){
        System.out.println(name + " has about " + Integer.toString(pages - currentPage) + " pages to read");
    }
    public void bookIsEnd(){
        if (currentPage<pages){
            System.out.println("Book is reading");
        }
        else {
            System.out.println("Book is end");
        }
    }
}
