package com.espe.controller;

import java.io.*;
import java.time.Year;
import java.util.List;

import com.espe.dao.IAutoDAO;
import com.espe.idao.AutoDaoImpl;
import com.espe.model.Auto;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "autoController", value = "/autoController")
public class ServletAutoController extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World from Servlet!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        /**Auto auto1 = new Auto();
        auto1.setPlaca("5562222");
        auto1.setMarca("mazda");
        auto1.setModelo("grand sd");
        auto1.setAnio(Year.of(2020));
        auto1.setCilindraje("1600 c");
        auto1.setCosumo("20 km por galon");

        Auto auto2 = new Auto();
        auto2.setPlaca("55111");
        auto2.setMarca("Chevrolet");
        auto2.setModelo("grand sd");
        auto2.setAnio(Year.of(2020));
        auto2.setCilindraje("1600 c");
        auto2.setCosumo("20 km por galon");

        Auto auto3 = new Auto();
        auto3.setPlaca("55888888");
        auto3.setMarca("mercedes");
        auto3.setModelo("grand sd");
        auto3.setAnio(Year.of(2020));
        auto3.setCilindraje("1600 c");
        auto3.setCosumo("20 km por galon");

        IAutoDAO autoDAO = new AutoDaoImpl();
        autoDAO.add(auto1);
        autoDAO.add(auto2);
        autoDAO.add(auto3);

        List<Auto> listaAutos=autoDAO.get();
        request.setAttribute("autos", listaAutos);

        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);**/
    }

    public void destroy() {
    }
}