package com.lab.xxx.chatbot.api;

import com.google.cloud.dialogflow.v2beta1.EntityTypesClient;
import com.google.cloud.dialogflow.v2beta1.Intent;
import com.google.cloud.dialogflow.v2beta1.WebhookRequest;
import com.google.cloud.dialogflow.v2beta1.WebhookResponse;
import com.google.gson.Gson;
import com.lab.xxx.chatbot.api.model.DFRequestBody;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Controller which routes requests for the Zeppelin Chatbot API.
 *
 * // TODO change to zuul api gateway if applicable
 */
@RestController
public class RoutingController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root() {
        return "Hello from routing service.";

    }

    @RequestMapping(value = "/api", method = RequestMethod.POST)
    public String executeAction(@RequestBody String body) {
        System.out.println("custom intent called.");
        System.out.println("Recived body: " + body);

        return WebhookResponse.newBuilder().setFulfillmentText("This is a Service response").build().toString();
    }

}
