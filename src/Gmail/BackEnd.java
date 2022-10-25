package Gmail;

public class BackEnd {
    private String email;
    private int senha;

    public BackEnd(String email, int senha){
        this.email = email;
        this.senha = senha;
    }

    public String getEmail(){
        return email;
    }

    public int getSenha(){
        return senha;
    }
}
