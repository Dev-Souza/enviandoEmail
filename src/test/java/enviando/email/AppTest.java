package enviando.email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testeEmail() throws Exception {

		StringBuilder stringBuilderTextoEmail = new StringBuilder();

		stringBuilderTextoEmail.append("Olá, <br>");
		stringBuilderTextoEmail.append("Você está recebendo o acesso ao curso Java <br>");
		stringBuilderTextoEmail.append("Para ter acesso clique no botão abaixo. <br>");
		
		stringBuilderTextoEmail.append("<b>Login:</b> kauan123 <br>");
		stringBuilderTextoEmail.append("<b>Senha:</b> t54tret34<br>");

		stringBuilderTextoEmail.append(
				"<a target=\"_blank\" href=\"https://www.youtube.com/watch?v=99Xzv4Xffd0\" style=\"color:#2525a7; padding: 14px 25px; text-align: center; text-decoration: none; display: inline-block; border-radius: 30px; font-size: 20px; font-family: courier; border: 3px solid green; background-color: #99DA39;\">Acessar Portal do Aluno</a><br><br>");

		stringBuilderTextoEmail.append("<span style=\"font-size: 8px\">Ass.: Dev-Souza</span>");
		
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("kauanlima127@gmail.com", "Dev-Souza",
				"Testando email com Java", stringBuilderTextoEmail.toString());

		enviaEmail.enviarEmail(true);

		Thread.sleep(5000);

	}

}