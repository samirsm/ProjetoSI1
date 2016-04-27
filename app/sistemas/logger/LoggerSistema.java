package sistemas.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import play.Logger;
import play.Logger.ALogger;
import play.api.mvc.Controller;
import sistemas.logger.registrosAcoes.Acao;

public class LoggerSistema {
	
	private static final ALogger loggerAdministrador = Logger.of(Controller.class);
	private final int MAX_TAM_LOG = 10000;
	private String log = "";
	
	// Construtor default
	public LoggerSistema(){
	}
	
	public void registraAcao(Acao acao, String... detalhes){
		String horaSistema = (new Date()).toString();
		
		String detalhesUsuario = "";
		for (int i = 0; i < detalhes.length; i++) {
			detalhesUsuario += detalhes[i];
			detalhesUsuario += "||";
		}
		
		loggerAdministrador.info("["+horaSistema+"] " + acao.getMensagemAcao() + detalhesUsuario);
        log += "\n"+"["+horaSistema+"] " + acao.getMensagemAcao() + detalhesUsuario;
		verificaTamanhoLog();
		
	}
	
	private void verificaTamanhoLog(){
		if(log.length() > MAX_TAM_LOG){
			  salvaLog();
			  log ="";
			}
	}
	
	private void salvaLog(){
	  try{
	    salvaLogEmArquivo(log);
    } catch(IOException e){
    }
	}
	
	private void salvaLogEmArquivo(String action) throws IOException {
		FileWriter arquivoLog = new FileWriter("public/logs/log.txt", true);
		PrintWriter escreverNoLog = new PrintWriter(arquivoLog);
		
		escreverNoLog.println(action);
		
		arquivoLog.close();
	}
}