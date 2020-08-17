package controller;

import entity.Student;
import model.StudentModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            StudentModel studentModel = new StudentModel();
            List<Student> studentList = studentModel.getAll();
            req.setAttribute("studentList", studentList);
            req.getRequestDispatcher("/list.jsp").forward(req, resp);
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}
