package prac13;

public class nom5 {
    static class Telephone{
        String stCountryCode = "";
        String stFirstThree = "";
        String stSecondThree = "";
        String stFour = "";

        Telephone(String str){
            if(str.length()<11){
                System.out.println("Введенный некоректный формат номера");
                return;
            }
            if (str.charAt(0) == '+'){
                stCountryCode += "+";
                str = str.replace("+", "");
            }
            int iCurrentPos = 0;
            stCountryCode += str.substring(0, str.length() - 10);
            iCurrentPos = stCountryCode.length() - 1;
            stFirstThree += str.substring(iCurrentPos,iCurrentPos + 3);
            iCurrentPos += stFirstThree.length() ;
            stSecondThree += str.substring(iCurrentPos,iCurrentPos + 3);
            iCurrentPos += stSecondThree.length() ;
            stFour += str.substring(iCurrentPos,iCurrentPos + 4);
        }

        @Override
        public String toString(){
            return stCountryCode + " " + stFirstThree + " " + stSecondThree + " " + stFour;
        }
    }

    public static void main(String[] args) {
        Telephone tmp = new Telephone("+79428965221");
        System.out.println(tmp);
        Telephone tmp1 = new Telephone("+79428965221");
        System.out.println(tmp1);
        Telephone tmp2 = new Telephone("+79428965221");
        System.out.println(tmp2);
        Telephone tmp3 = new Telephone("+79428221");
        System.out.println(tmp3);
        Telephone tmp4 = new Telephone("+79428965221");
        System.out.println(tmp4);
        Telephone tmp5 = new Telephone("+79428965221");
        System.out.println(tmp5);
    }
}