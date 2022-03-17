/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checadorhorarios;

import com.controllers.AnadirEmpleadoController;
import com.controllers.AnadirHorarioController;
import com.controllers.EliminarEmpleadoController;
import com.controllers.InicioSesionController;
import com.controllers.MenuOpcionesEmpleadoController;
import com.controllers.MenuPrincipalController;
import com.controllers.ModificarEmpleadoController;
import com.controllers.ModificarHorarioController;

import com.models.AnadirEmpleadoModel;
import com.models.AnadirHorarioModel;
import com.models.EliminarEmpleadoModel;
import com.models.InicioSesionModel;
import com.models.MenuOpcionesEmpleadoModel;
import com.models.MenuPrincipalModel;
import com.models.ModificarEmpleadoModel;
import com.models.ModificarHorarioModel;

import com.views.frmAnadirEmpleado;
import com.views.frmAnadirHorario;
import com.views.frmEliminarEmpleado;
import com.views.frmInicioSesion;
import com.views.frmMenuOpcionesEmpleado;
import com.views.frmMenuPrincipal;
import com.views.frmModificarEmpleado;
import com.views.frmModificarHorario;

/**
 *
 * @author Jonat
 */

//Esta clase se encarga de tener todos los llamados a los controladores con
//su interfaz y modelo para poder cargar los controladores. Est´basada en el
//patron de diseño "template"
public class Template {
    
    public static void abrirInicioSesion(){
        frmInicioSesion inicioSesionV = new frmInicioSesion();
        InicioSesionModel inicioSesionM = new InicioSesionModel();
        InicioSesionController incioSesionC = new InicioSesionController(inicioSesionV, inicioSesionM);
        inicioSesionV.setVisible(true);
    }
    
    public static void abrirMenuPrincipal(){
        frmMenuPrincipal menuPrincipalV = new frmMenuPrincipal();
        MenuPrincipalModel menuPrincipalM = new MenuPrincipalModel();
        MenuPrincipalController menuPrincipalC = new MenuPrincipalController(menuPrincipalV, menuPrincipalM);
        menuPrincipalV.setVisible(true);
    }
    
    public static void abrirAnadirEmpleado(){
        frmAnadirEmpleado anadirEmpleadoV = new frmAnadirEmpleado();
        AnadirEmpleadoModel anadirEmpleadoM = new AnadirEmpleadoModel();
        AnadirEmpleadoController anadirEmpleadoC = new AnadirEmpleadoController(anadirEmpleadoV, anadirEmpleadoM);
        anadirEmpleadoV.setVisible(true);
    }
    
    public static void abrirMenuOpcionesEmpleado(int idEmpleado){
        frmMenuOpcionesEmpleado menuOpcionesEmpleadoV = new frmMenuOpcionesEmpleado();
        MenuOpcionesEmpleadoModel menuOpcionesEmpleadoM = new MenuOpcionesEmpleadoModel();
        menuOpcionesEmpleadoM.setIdEmpleado(idEmpleado);
        MenuOpcionesEmpleadoController menuOpcioneEmpleadoC = new MenuOpcionesEmpleadoController(menuOpcionesEmpleadoV, menuOpcionesEmpleadoM);
        menuOpcionesEmpleadoV.setVisible(true);
    }
    
    public static void abrirAnadirHorario(AnadirEmpleadoModel anadirEmpleadoM){
        frmAnadirHorario anadirHorarioV = new frmAnadirHorario();
        AnadirHorarioModel anadirHorarioM = new AnadirHorarioModel();
        
        anadirHorarioM.setNombre(anadirEmpleadoM.getNombre());
        anadirHorarioM.setaPaterno(anadirEmpleadoM.getaPaterno());
        anadirHorarioM.setaMaterno(anadirEmpleadoM.getaMaterno());
        anadirHorarioM.setRfc(anadirEmpleadoM.getRfc());
        anadirHorarioM.setGenero(anadirEmpleadoM.getGenero());
        anadirHorarioM.setfNacimiento(anadirEmpleadoM.getfNacimiento());
        anadirHorarioM.setfIngreso(anadirEmpleadoM.getfIngreso());
        
        AnadirHorarioController anadirHorarioC = new AnadirHorarioController(anadirHorarioV, anadirHorarioM);
        anadirHorarioV.setVisible(true);
    }
    
    public static void abrirModificarEmpleado(int idEmpleado){
        frmModificarEmpleado modificarEmpleadoV = new frmModificarEmpleado();
        ModificarEmpleadoModel modificarEmpleadoM = new ModificarEmpleadoModel();
        modificarEmpleadoM.setIdEmpleado(idEmpleado);
        ModificarEmpleadoController modificarEmpleadoC = new ModificarEmpleadoController(modificarEmpleadoV, modificarEmpleadoM);
        modificarEmpleadoV.setVisible(true);
    }
    
    public static void abrirModificarHorario(int idEmpleado){
        frmModificarHorario modificarHorarioV = new frmModificarHorario();
        ModificarHorarioModel modifcarHorarioM = new ModificarHorarioModel();
        modifcarHorarioM.setIdEmpleado(idEmpleado);
        ModificarHorarioController modificarHorarioC = new ModificarHorarioController(modificarHorarioV, modifcarHorarioM);
        modificarHorarioV.setVisible(true);
    }
    
    public static void abrirEliminarEmpleado(int idEmpleado){
        frmEliminarEmpleado eliminarEmpleadoV = new frmEliminarEmpleado();
        EliminarEmpleadoModel eliminarEmpleadoM = new EliminarEmpleadoModel();
        eliminarEmpleadoM.setIdEmpleado(idEmpleado);
        EliminarEmpleadoController eliminarEmpleadoC = new EliminarEmpleadoController(eliminarEmpleadoV, eliminarEmpleadoM);
        eliminarEmpleadoV.setVisible(true);
    }
}
