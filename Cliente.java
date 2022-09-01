public class Cliente{
    
    private String nome;
    private String email;
    private String telefone;


public Cliente(String n, String e, String t){
    nome = n;
    email = e;
    telefone = t;
}

public String getNome(){
    return nome;
}

public String getEmail(){
    return email;
}

public String getTelefone(){
return telefone;    
}

}