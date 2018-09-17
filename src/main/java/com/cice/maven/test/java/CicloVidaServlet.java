package com.cice.maven.test.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CicloVidaServlet extends HttpServlet {

    private String nombreSevlet;

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("LUZ");
        this.nombreSevlet = this.getClass().getCanonicalName();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("FUEGO (en el servlet "+nombreSevlet+")");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("DESTRUCCIÓN");
    }


}
