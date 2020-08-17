package controller;

import model.StudentModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String id = req.getParameter("id");

            System.out.println(">>>>>>>>>>>>" + id);
            StudentModel studentModel = new StudentModel();
            boolean rs = studentModel.delete(id);
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
