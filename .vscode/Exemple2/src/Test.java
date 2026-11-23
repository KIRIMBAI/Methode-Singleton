public class Test{


public static void main(String[]args){
    int som=Singleton.getInstance().Somme(2,5);
    System.out.println("la somme est :"+som);

    Singleton s1=Singleton.getInstance(8,4);
    s1.affiche();
    Singleton s2=Singleton.getInstance(18,4);
    s1.affiche();
}
}