package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;



import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
        CloseableHttpClient client = HttpClients.createDefault();
            Scanner s= new Scanner(System.in);
            System.out.println("choose amount: ");
            int amount= s.nextInt();
        HttpGet getRequest= new HttpGet("https://opentdb.com/api.php?amount=" +amount+ "&category=19&difficulty=easy&type=multiple");
            HttpResponse response= (HttpResponse) client.execute(getRequest);
            String questions;
            questions = EntityUtils.toString(response.getEntity());
            Response responseObject= new ObjectMapper().readValue( questions, Response.class);
            System.out.println("Questions: ");
            System.out.println(responseObject.getResults().get(0).getQuestion());
            System.out.println("Incorrect Answers: ");
            Question question= responseObject.getResults().get(0);
            List<String>allAnswers= new ArrayList<>();
            allAnswers.addAll(question.getIncorrect_answers());
            allAnswers.addAll(question.getCorrect_answer());
            for (String answer: question.getIncorrect_answers()){
                System.out.println(answer);
            }



    }catch (IOException e){
        throw new RuntimeException(e);
        }
    }


}