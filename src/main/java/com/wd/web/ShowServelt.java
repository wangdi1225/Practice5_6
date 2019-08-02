package com.wd.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import com.wd.bean.Clothes;
import com.wd.service.ClothesService;

@WebServlet("/show_do")
public class ShowServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShowServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

    private ClothesService cs;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ServletContextListener 可以通过配置监听器来达到我们的需求，在web项目创建时候创建spring容器，销毁时候关闭spring容器
				WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
				cs = (ClothesService) wac.getBean("clothesService");
				List<Clothes> clothesList=cs.getAllList();
				request.setAttribute("clothesList",clothesList);
				request.getRequestDispatcher("/show.jsp").forward(request, response);
		
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
