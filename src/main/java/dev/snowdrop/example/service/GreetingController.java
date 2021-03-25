/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.snowdrop.example.service;

import java.io.IOException;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class GreetingController {

    private GreetingProperties properties;

    @Autowired
    public GreetingController(GreetingProperties properties) {
        this.properties = properties;
    }

    @RequestMapping("/api/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        //Objects.requireNonNull(properties.getMessage(), "Greeting message was not set in the properties");

        //String message = String.format(properties.getMessage(), name);
        //return new Greeting(message);
    	String prefix = System.getenv().getOrDefault("appconfig", "Hi");
        if (prefix == null) {
            prefix = "Hello!";
        }

        return new Greeting(String.format("%s %s! Welcome to Configuring Spring Boot on Kubernetes!", prefix, name));
    }
    
    @RequestMapping("/api/greeting2")
    public Greeting greeting2(@RequestParam(value = "name", defaultValue = "World") String name) {
        Objects.requireNonNull(properties.getMessage(), "Greeting message was not set in the properties");

        String message = String.format(properties.getMessage(), name);
        return new Greeting(message);
    }
    
    @RequestMapping("/api/greeting3")
    public Greeting greeting3(@RequestParam(value = "name", defaultValue = "World") String name) {
    	String json = System.getenv().getOrDefault("jsonconfig", "Hi");
    	ObjectMapper objectMapper = new ObjectMapper();
    	WebconsoleSettingDto read = new WebconsoleSettingDto();
    	try {
    		read = objectMapper.readValue(json, WebconsoleSettingDto.class);
    	} catch (IOException e) {
    		
    	}
        return new Greeting(read.getAppSetting().toString());
    }
}
