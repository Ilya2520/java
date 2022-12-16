package prac6;

public class Book implements Printable{
    int pages;
    String name;
    int curPage;

    public Book(String name,int pages, int curPage) {
        this.name=name;
        this.pages = pages;
        this.curPage = curPage;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public Book() {
        this.pages = 0;
        this.name = "0";
        this.curPage = 0;
    }

    public String print(){
        return "Book:" +name + " pages:"+pages+" current page:"+curPage;
    }
}

