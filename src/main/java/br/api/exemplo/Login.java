package br.api.exemplo;

import org.json.JSONObject;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jean on 21/09/17.
 */
public class Login {

    public String logar(String urlBase, String clientId, String clientSecret) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format(urlBase + "authz-server/oauth/token?client_id=%s&client_secret=%s&grant_type=client_credentials", clientId, clientSecret);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, null, String.class);
        if ( responseEntity.getStatusCode() == HttpStatus.OK ) {
            System.out.println(responseEntity.getBody());
            JSONObject jsonObject = new JSONObject(responseEntity.getBody());
            return (String) jsonObject.get("access_token");
        }
        return null;
    }

}
