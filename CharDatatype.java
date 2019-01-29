public class CharDatatype {
    public static void upperLower(char ch){
        if(ch>=97 && ch<=123){
            System.out.println("Lower");
        }
        else if(ch>=65 && ch<=96){
            System.out.println("Upper");
        }
        else{
            System.out.println("Not Valid");
        }

    }
    public static char toggle(char ch){
        char x=' ';
        if(ch>=97 && ch<=123){
            x=(char)(ch-32);
        }
        else if(ch>=65 && ch<=96){
            x=(char)(ch+32);
        }
        return x;
    }
    public static void main(String[] args) {
        char ch='z';
        upperLower(ch);
        char ch1=toggle(ch);
        System.out.println(ch1);
    }
}
