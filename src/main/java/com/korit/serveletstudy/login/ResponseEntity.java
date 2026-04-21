package com.korit.serveletstudy.login;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Data
@Builder
@AllArgsConstructor
public class ResponseEntity<T> {
    private int status;
    private T body;


    public void response(ServletResponse response) throws IOException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setStatus(status);
        httpResponse.setContentType("application/json");
        httpResponse.getWriter().println(JsonParserUtil.stringify(this));
    }

}
