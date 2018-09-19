package controller;

import model.Author;
import model.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AddBookServlet {

    private static final String USER = "user";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        session.setMaxInactiveInterval(10);
//        session.setAttribute(USER,request.getBookFromParams(request));
        request.getRequestDispatcher("/registerSuccess.jsp").include(request, response);
    }

    private Book getBookFromParams(HttpServletRequest request) {
        return null;
    }
}
