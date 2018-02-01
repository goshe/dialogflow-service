package com.lab.xxx.chatbot.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.Properties;

/**
 * Controller which routes requests for the Zeppelin Chatbot API.
 *
 * // TODO change to zuul api gateway if applicable
 */
@RestController
public class RoutingController {
    private static final Gson GSON = new GsonBuilder().create();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root() {
        return "Hello from routing service.";

    }

    @RequestMapping(value = "/api", method = RequestMethod.POST)
    @ResponseBody
    public String executeAction(@RequestBody String body) {
        System.out.println("custom intent called.");
        System.out.println("Recived body: " + body);
        Properties data = GSON.fromJson(body, Properties.class);

        data.list(System.out);

        String response = createJSONResponse("Response from Service !");
        System.out.println("Will send response " + response);
        return response;
    }

    private String createJSONResponse(String messageText) {
        return "{\"fulfillmentText\": \""+messageText+"\",\n" +
                "     \"fulfillmentMessages\": [{\n" +
                "       \"text\": {\n" +
                "         \"text\": [\""+messageText+"\"]\n" +
                "       }\n" +
                "}]}";
    }

}
