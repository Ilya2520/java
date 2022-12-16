package prac6;

public class Shop implements Printable{
    String name;
    int goods;
    int price;
    boolean open;
    Comp []a;

    public Shop(String name,int goods, int price,boolean open) {
        this.name=name;
        this.goods = goods;
        this.price = price;
        this.open=open;
        this.a=new Comp[goods];
    }

    public Shop() {
        this.name="0";
        this.goods = 0;
        this.price = 0;
        this.open=false;
    }

    public String isOpen() {
        return  (!open) ? "no" : "yes" ;
    }

    public int getGoods() {
        return goods;
    }

    public void setGoods(int goods) {
        this.goods = goods;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void add(Comp s){
        for(int i=0;i<goods;i++){
         if (a[i]==null) {
             a[i] = s;
             break;
         }
        }
    }

    public void delet(String d){
        for(int i=0;i<goods;i++){
            if(a[i]!= null && a[i].name==d){
                a[i]=null;
            }
        }
    }

    public void find(String c){

        for(int i=0;i<goods;i++){
            if(a[i]!= null && a[i].name==c){
                System.out.println(a[i].toString());
            }
        }
    }

    public String print(){
        return "Shop:"+name+ " goods:"+goods+" price:"+price+" is open: "+isOpen() ;
    }
    public void pr(){
        for(int i=0;i<goods;i++){
            if(a[i]!=null)
                System.out.println(a[i]);
        }
    }
}
