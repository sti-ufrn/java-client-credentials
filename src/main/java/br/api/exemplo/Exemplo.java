package br.api.exemplo;

import java.io.IOException;

/**
 * Created by jean on 21/09/17.
 */
public class Exemplo {

    static String xApiKey = "X-API-KEY";
    static String clientId = "CLIENT-ID";
    static String clientSecret = "CLIENT-SECRET";
    static String urlBase = "https://apitestes.info.ufrn.br/";

    public static void main(String[] args) throws IOException {
        Login login = new Login();
        Get get = new Get();

        String accessToken = login.logar(urlBase, clientId, clientSecret);
        get.getData(urlBase, xApiKey, accessToken);
    }

}