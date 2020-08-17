package controller;

import entity.Student;
import model.StudentModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignInController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String id = req.getParameter("id");
            System.out.println(">>>>>>>>>>>>" + id);
            StudentModel studentModel = new StudentModel();
            Student student = studentModel.getById(id);
            req.setAttribute("student", student);
            req.getRequestDispatcher("/signin.jsp").forward(req, resp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        req.getRequestDispatcher("/signin.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String full_name = req.getParameter("full_name");
            Integer gender = Integer.parseInt(req.getParameter("gender"));
            String email = req.getParameter("email");
            String dob = req.getParameter("dob");
            String phone = req.getParameter("phone");
            String address = req.getParameter("address");

            System.out.println(">>>>>>>>>>>>" + full_name);
            StudentModel studentModel = new StudentModel();
            String id = req.getParameter("id");
            boolean rs = studentModel.create(full_name, id, gender, address, phone,email, dob);
            if (rs) {
                System.out.println(">>>>>>>>>>>> success");
            }
            req.getRequestDispatcher("/public.jsp").forward(req, resp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
