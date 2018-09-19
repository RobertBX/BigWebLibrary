package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import model.Author;



@WebServlet("/AddAuthorServlet")
public class AddAuthorServlet extends HttpServlet {

    private static final String USER = "user";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        session.setMaxInactiveInterval(10);
//        session.setAttribute(USER,request.getAuthorFromParams(request));
        request.getRequestDispatcher("/registerSuccess.jsp").include(request, response);
    }

//    private Author getAuthorFromParams(HttpServletRequest request) {
//        Author author = new Author();
//        author.setFirst_name(request.getParameter("firstName"));
//        author.setLast_name(request.getParameter("lastName"));
//        author.setBirth_place(request.getParameter(""));
//        author.setEmail(request.getParameter("email"));
//        user.setGender(Gender.valueOf(request.getParameter("gender")));
//        user.setPassword(request.getParameter("password"));
//        user.setPhone(Long.valueOf(request.getParameter("phone")));
//        return User;
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response){

    }
}