package Gmail;

public class FrontEnd {
    public static void main(String[] args) {
        BackEnd emailSenha1 = new BackEnd("mateusgodoi007@gmail.com", 257457895);
        BackEnd emailSenha2 = new BackEnd("mateusgodoi@gmail.com", 145621);
        BackEnd emailSenha3 = new BackEnd("mateusgodoi456@gmail.com", 87452);
        BackEnd emailSenha4 = new BackEnd("mateusgodoi74500@gmail.com", 111111111);
        BackEnd emailSenha5 = new BackEnd("mateusgodoi785@gmail.com", 541);
        BackEnd emailSenha6 = new BackEnd("mateusgodoi78541@gmail.com", 257457895);

        System.out.println(emailSenha1.getEmail() + "|" + emailSenha1.getSenha());
        System.out.println(emailSenha2.getEmail() + "|" + emailSenha2.getSenha());
        System.out.println(emailSenha3.getEmail() + "|" + emailSenha3.getSenha());
        System.out.println(emailSenha4.getEmail() + "|" + emailSenha4.getSenha());
        System.out.println(emailSenha5.getEmail() + "|" + emailSenha5.getSenha());
        System.out.println(emailSenha6.getEmail() + "|" + emailSenha6.getSenha());






    }
}
