/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestoreventos;

/**
 * PPROG 2016/2017 Trabalho Prático nº3 - TP3
 *
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 *
 * @since 27/05/2017
 */
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Utilizador{

	private String Nome;
	private String Username;
	private String Password;
	private String Email;

	public Utilizador() {
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public void setUsername(String Username) {
		Username = Username;
	}

	public void setPassword(String Password) {
		Password = Password;
	}

	public void setEmail(String Email) {

		this.Email = Email;
	}

       /** 
        * Método para validar email
        */
        public boolean valida() {

		String EMAIL_PATTERN
			= "^[a-z0-9-\\+]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9]+)*(\\.[a-z]{2,})$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		CharSequence stEmail = getEmail();
		Matcher matcher = pattern.matcher(stEmail);
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}

	}

        /** 
        * Métodos get para email, nome, userrname que retornam os mesmos
        */
	public String getEmail() {

		return this.Email;
	}

	public String getNome() {
		return Nome;
	}

	public String getUsername() {
		return Username;
	}

        /** 
        * Método toString para email, nome, userrname e email que retornam os mesmos
        */
	@Override
	public String toString() {
		String str = "Utilizador:\n";
		str += "\tNome: " + this.Nome + "\n";
		str += "\tUsername: " + this.Username + "\n";
		str += "\tPassword: " + this.Password + "\n";
		str += "\tEmail: " + this.Email + "\n";
		return str;
	}

}

