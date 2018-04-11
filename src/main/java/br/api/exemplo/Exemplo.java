package br.api.exemplo;

import java.io.IOException;

/**
 * Created by jean on 21/09/17.
 */
public class Exemplo {

    static String urlBaseAutenticacao = "https://autenticacao.info.ufrn.br/";
    static String clientId = "CLIENT-ID";
    static String clientSecret = "CLIENT-SECRET";

    static String urlBase = "https://api.info.ufrn.br/";
    static String versao = "v0.1";
    static String xApiKey = "X-API-KEY";

    public static void main(String[] args) throws IOException {
        Login login = new Login();
        Get get = new Get();

        String accessToken = login.logar(urlBaseAutenticacao, clientId, clientSecret);
        get.getData(xApiKey, accessToken, urlBase, versao);
    }

}