package com.speed.mixer.web.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sambit on 5/1/2017.
 */
public class SecurityUtil {

    @Autowired
    private ObjectMapper jacksonObjectMapper;

    public static void sendResponse(HttpServletResponse response, int status, Object object) throws IOException {


    }
}
