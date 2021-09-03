
public class patterns {
    public static void main(String args[]){
        triangle1(1, 4);
        System.out.println("");
        triangle1(4,1);
        System.out.println("");
        triangle2(1, 7);
        System.out.println("");
        triangle2(7, 1);
    }
    public static void triangle1(int top, int bot){
        if(top < bot){ 
            for (int i = top; i <= bot ; i++){
                System.out.println(stringX("*", i));
            }
            System.out.println("..........");
        }
        else{
            System.out.println("...........");
            for(int i = top; i >= bot ; i--){
                System.out.println(stringX("*", i));
            }
        }
    }
    
    public static void triangle2(int top, int bot){
        if(top > bot){
            System.out.println("............");
            String sp = "  ";
            for(int i = top; i >= bot; i--){
                if(i%2 != 0){
                    System.out.print(sp);
                    sp = sp.concat(" ");
                    System.out.println(stringX("*", i));
                }
            }
        }
        else{
            String sp = "     ";
            for(int i = top ; i <= bot ; i++){
                if(i%2 != 0){
                    System.out.print(sp);
                    sp = sp.substring(1);
                    System.out.println(stringX("*", i));
                }
            }
            System.out.println("...........");
        }
    }
    //method that repeats a string 's' 'i' times.
    public static String stringX(String s, int i){
        String temp = "";
        while(i >0){
            temp = temp.concat(s);
            i--;
        }
        return temp;
    }
}
