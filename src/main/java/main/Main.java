package main;

import controller.ProjectController;
import java.sql.Connection;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

/**
 *
 * @author virgi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        ProjectController projectController = new ProjectController();
//        
//        Project project = new Project();
//        project.setName("Projeto teste");
//        project.setDescription("description");
//        projectController.save(project);      

        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("Projeto teste1");
        project.setDescription("description");
        project.setId(12);
        project.setName("Novo Nome do projeto");
//        project.setDescription("description");    
                
        projectController.save(project);
        project.setId(12);
        projectController.getUpdate(project);
        
        List<Project>projects = projectController.getAll();
        System.out.println("Total de projetos" + projects.size());
        
        //projectController.removeById(12;
        
    }
    
}
