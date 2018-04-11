package br.api.exemplo;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jean on 21/09/17.
 */
public class Get {

    public static void getData(String xApiKey, String token, String urlBase, String versao) {
        RestTemplate restTemplate = new RestTemplate();

        String url = urlBase + "curso/" + versao + "/modalidades-educacao";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "bearer " + token);
        headers.add("x-api-key", xApiKey);

        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
        if ( responseEntity.getStatusCode() == HttpStatus.OK ) {
            System.out.println( responseEntity.getBody() );
        }
    }

}