public final class Connexion {

    private  String name ;
    private String pass;
     private  static Connexion DdConnexion;

private  Connexion (String name ,String pass){
    this. name = name;
    this. pass = pass;

}
private Connexion (){
    super();
} 
public  static Connexion createConnexion (String name,String pass){
if(DdConnexion == null){
    DdConnexion =new Connexion (name,pass);

}
return DdConnexion;
}

public String closeConnexion(){
    if(DdConnexion!=null){
        DdConnexion =null;
    }
    return "la connexion est fermé";
}
public String getname(){
    return name;
}
public String getpass(){

    return pass;
}
} 
    

