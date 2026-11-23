public class App {
    public static void main(String[]args){
        Connexion  conn= null;
        conn =conn.createConnexion("jean", "1234");
        System.out.println(conn.getname() +conn.getpass());
        conn.closeConnexion();
        
        Connexion conn2= Connexion.createConnexion("chancella","2345");
        System.out.println(conn2.getname() +conn2.getpass());
        conn.closeConnexion();
        
        Connexion conn1= Connexion.createConnexion("Winnie","0045");
        System.out.println(conn1.getname() +conn1.getpass());
        conn1.closeConnexion();
        

    }
}
