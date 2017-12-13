package io.jsd.training.client.rest.trainingcenter.runtime;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.LineIterator;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsd.training.client.rest.trainingcenter.model.Stagiaire;

public class Runtime {

	public static void main(String[] args)
			throws JsonParseException, JsonMappingException, ClientProtocolException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		Stagiaire stagiaireGet = mapper.readValue(sendGetRequest(), Stagiaire.class);
		Stagiaire stagiairePost = mapper.readValue(sendPostRequest(), Stagiaire.class);
		// Stagiaire stagiaireDelete = mapper.readValue(sendDeleteRequest(),
		// Stagiaire.class);
		sendDeleteRequest();
		Stagiaire stagiaireUpdate = mapper.readValue(sendUpdateRequest(), Stagiaire.class);

		System.out.println(stagiaireGet);
		System.out.println(stagiairePost);
		System.out.println(stagiaireUpdate);
	}

	public static String sendGetRequest() throws ClientProtocolException, IOException {

		CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://localhost:8080/CentreFormation/rest/stagiaire/id/3");

		CloseableHttpResponse response = closeableHttpClient.execute(httpGet);

		StringBuilder builder = new StringBuilder();
		// BufferedReader bufferedReader = new BufferedReader(
		// new InputStreamReader(response.getEntity().getContent()));

		LineIterator iterator = new LineIterator(new InputStreamReader(response.getEntity().getContent()));

		while (iterator.hasNext()) {
			builder.append(iterator.nextLine());
		}

		return builder.toString();
	}

	public static String sendPostRequest() throws ClientProtocolException, IOException {

		CloseableHttpClient closeableHttpClient = HttpClients.createDefault();

		HttpPost httpPost = new HttpPost("http://localhost:8080/CentreFormation/rest/stagiaire");

		httpPost.setHeader("Accept", "application/json");
		httpPost.setHeader("Content-type", "application/json");

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("nom", "POST");
		params.put("prenom", "DO");

		ObjectMapper mapper = new ObjectMapper();

		StringEntity stringEntity = new StringEntity(mapper.writeValueAsString(params));

		httpPost.setEntity(stringEntity);

		CloseableHttpResponse response = closeableHttpClient.execute(httpPost);

		StringBuilder builder = new StringBuilder();
		// BufferedReader bufferedReader = new BufferedReader(
		// new InputStreamReader(response.getEntity().getContent()));

		LineIterator iterator = new LineIterator(new InputStreamReader(response.getEntity().getContent()));

		while (iterator.hasNext()) {
			builder.append(iterator.nextLine());
		}

		return builder.toString();
	}

	public static void sendDeleteRequest() throws ClientProtocolException, IOException {

		CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
		HttpDelete httpDelete = new HttpDelete("http://localhost:8080/CentreFormation/rest/stagiaire/id/5");
		CloseableHttpResponse response = closeableHttpClient.execute(httpDelete);

	}

	public static String sendUpdateRequest() throws ClientProtocolException, IOException {

		CloseableHttpClient closeableHttpClient = HttpClients.createDefault();

		HttpPut httpPut = new HttpPut("http://localhost:8080/CentreFormation/rest/stagiaire");

		httpPut.setHeader("Accept", "application/json");
		httpPut.setHeader("Content-type", "application/json");

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", 3);
		params.put("nom", "LUCIDA");
		params.put("prenom", "MARION");

		ObjectMapper mapper = new ObjectMapper();

		StringEntity stringEntity = new StringEntity(mapper.writeValueAsString(params));

		httpPut.setEntity(stringEntity);

		CloseableHttpResponse response = closeableHttpClient.execute(httpPut);

		StringBuilder builder = new StringBuilder();

		LineIterator iterator = new LineIterator(new InputStreamReader(response.getEntity().getContent()));

		while (iterator.hasNext()) {
			builder.append(iterator.nextLine());
		}

		return builder.toString();

	}

}
