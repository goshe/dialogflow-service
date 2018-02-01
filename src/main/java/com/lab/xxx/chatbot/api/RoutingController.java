package com.lab.xxx.chatbot.api;

import com.lab.xxx.chatbot.api.model.DFRequestBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller which routes requests for the Zeppelin Chatbot API.
 *
 * // TODO change to zuul api gateway if applicable
 */
@RestController
public class RoutingController {


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String executeAction(@RequestBody DFRequestBody body) {
        System.out.println("custom intent called.");
        System.out.println("Recived body: " + body);

        return "";

    }
}
