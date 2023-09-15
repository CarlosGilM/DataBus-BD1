package model;

import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {
  private int identificador;
  private String email;
  private String senha;
  private Date dataNascimento;
  private String numeroTel;
  private String nome;
  private String endereco;
  private String cpf;

public Cliente(int identificador, String email, String senha, Date dataNascimento, String numeroTel, String nome,String endereco, String cpf) {
    this.identificador = identificador;
    this.email = email;
    this.senha = senha;
    this.dataNascimento = dataNascimento;
    this.numeroTel = numeroTel;
    this.nome = nome;
    this.endereco = endereco;
    this.cpf = cpf;
}

public static boolean confereNome(String nome){
    nome.toUpperCase();
    //nome.replaceAll("[^a-zA-Z]", "");
    System.out.println(nome);

    boolean valido = true;

    if(nome.length() < 3 ){
       valido = false;
    }
    if(!nome.matches("[a-zA-Z]*")){
        valido = false;
     }
    
     return valido;
  }


  public static boolean confereSenha (String senha){
    senha.toUpperCase();
    if (senha.length() < 6) return false;

    else
    return true; 
}
  
public static boolean confereCpf(String cpf){
    boolean valido = true;

    if (cpf.length() != 11){
        valido = false;
    } 
    if(!cpf.matches("[0-9]*")){
        return false;
     }



    return valido; 
}

  public boolean confereEmail(String email) {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }

    public static Boolean confereNumero( String numero){
        boolean valido = true;

    if (numero.length() != 11){
        valido = false;
    } 
    if(!numero.matches("[0-9]*")){
        return false;
     }



    return valido; 
    }





public int getIdentificador() {
    return identificador;
}
public String getemail() {
    return email;
}
public String getSenha() {
    return senha;
}
public Date getDataNascimento() {
    return dataNascimento;
}
public String getNumeroTel() {
    return numeroTel;
}
public String getNome() {
    return nome;
}
public String getEndereco() {
    return endereco;
}
public String getCpf() {
    return cpf;
}

}
