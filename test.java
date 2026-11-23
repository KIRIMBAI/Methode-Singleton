public class test {
    public static void main(String[]args){
        Connexion conn= null;

        conn =conn.createConnexion(name:"jean",pass:"1234");

        System.out.println(conn.getname() +conn.getpass());
        conn.closeConnexion();
        
        Connexion conn2= Connexion.createConnexion;
        conn =conn.createConnexion(name:"winnie",pass:"2345");

        System.out.println(conn2.getname() +conn2.getpass());
        conn.closeConnexion();

        System.out.println(conn1.getname() +conn1.getpass());
        conn1.closeConnexion();
        

    }
    
}
