package checadorhorarios;

import com.controllers.AnadirEmpleadoController;
import com.controllers.AnadirHorarioController;
import com.controllers.EliminarEmpleadoController;
import com.controllers.GenerarReporteController;
import com.controllers.InicioSesionController;
import com.controllers.GenerarReporteSeleccionController;
import com.controllers.JustificarDiaController;
import com.controllers.JustificarController;
import com.controllers.JustificarIntervaloController;
import com.controllers.MenuOpcionesEmpleadoController;
import com.controllers.MenuPrincipalController;
import com.controllers.ModificarEmpleadoController;
import com.controllers.ModificarHorarioController;
import com.controllers.ModificarToleranciaController;
import com.controllers.RegistrarAsistenciaController;

import com.models.AnadirEmpleadoModel;
import com.models.AnadirHorarioModel;
import com.models.EliminarEmpleadoModel;
import com.models.GenerarReporteModel;
import com.models.InicioSesionModel;
import com.models.JustificarModel;
import com.models.GenerarReporteSeleccionModel;
import com.models.JustificarDiaModel;
import com.models.JustificarIntervaloModel;
import com.models.MenuOpcionesEmpleadoModel;
import com.models.MenuPrincipalModel;
import com.models.ModificarEmpleadoModel;
import com.models.ModificarHorarioModel;
import com.models.ModificarToleranciaModel;
import com.models.RegistrarAsistenciaModel;

import com.views.frmAnadirEmpleado;
import com.views.frmAnadirHorario;
import com.views.frmEliminarEmpleado;
import com.views.frmGenerarReporte;
import com.views.frmInicioSesion;
import com.views.frmGenerarReporteSeleccion;
import com.views.frmJustificarFalta;
import com.views.frmJustificar;
import com.views.frmMenuOpcionesEmpleado;
import com.views.frmMenuPrincipal;
import com.views.frmModificarEmpleado;
import com.views.frmModificarHorario;
import com.views.frmModificarTolerancia;
import com.views.frmRegistrarAsistencia;
import java.util.Date;


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
    
    public static void abrirJustificar(int idEmpleado){
        frmJustificar justificarV = new frmJustificar();
        JustificarModel justificarM = new JustificarModel();
        justificarM.setIdEmpleado(idEmpleado);
        JustificarController justificarC = new JustificarController(justificarV, justificarM);
        justificarV.setVisible(true);
    }
    
    public static void abrirJustificarDia(Date dia, int idEmpleado){
        frmJustificarFalta justificarDiaV = new frmJustificarFalta();
        JustificarDiaModel justificarDiaM = new JustificarDiaModel();
        justificarDiaM.setFecha(dia);
        justificarDiaM.setIdEmpleado(idEmpleado);
        JustificarDiaController justificarDiaC = new JustificarDiaController(justificarDiaV, justificarDiaM);
        justificarDiaV.setVisible(true);
    }
    
    public static void abrirJustificarIntervalo(Date inicio, Date fin, int idEmpleado){
        frmJustificarFalta justificarDiaV = new frmJustificarFalta();
        JustificarIntervaloModel justificarIntervaloM = new JustificarIntervaloModel();
        justificarIntervaloM.setFechaInicio(inicio);
        justificarIntervaloM.setFechaFin(fin);
        justificarIntervaloM.setIdEmpleado(idEmpleado);
        JustificarIntervaloController justificarIntervaloC = new JustificarIntervaloController(justificarDiaV, justificarIntervaloM);
        justificarDiaV.setVisible(true);
    }
    
    public static void abrirGenerarReporte(String desde, String hasta){
        frmGenerarReporte generarReporteV = new frmGenerarReporte();
        GenerarReporteModel generarReporteM = new GenerarReporteModel();
        generarReporteM.setFechaDesde(desde);
        generarReporteM.setFechaHasta(hasta);
        GenerarReporteController generarReporteC = new GenerarReporteController(generarReporteV, generarReporteM);
        generarReporteV.setVisible(true);
    }
            
    public static void abrirGenerarReporteSeleccion(int idEmpleado, String tipo, String desde, String hasta, String genero){
        frmGenerarReporteSeleccion generarReporteSeleccionV = new frmGenerarReporteSeleccion();
        generarReporteSeleccionV.opcion = tipo;
        GenerarReporteSeleccionModel generarReporteSeleccionM = new GenerarReporteSeleccionModel();
        generarReporteSeleccionM.setIdEmpleado(idEmpleado);
        generarReporteSeleccionM.setDesde(desde);
        generarReporteSeleccionM.setHasta(hasta);
        generarReporteSeleccionM.setGenero(genero);
        GenerarReporteSeleccionController generarReporteSeleccionC = new GenerarReporteSeleccionController(generarReporteSeleccionV, generarReporteSeleccionM);
        generarReporteSeleccionV.setVisible(true);
    }
    
    public static void abrirRegistrarAsistencia(){
        frmRegistrarAsistencia registrarAsistenciaV = new frmRegistrarAsistencia();
        RegistrarAsistenciaModel registrarAsistenciaM = new RegistrarAsistenciaModel();
        RegistrarAsistenciaController registrarAsistenciaC = new RegistrarAsistenciaController(registrarAsistenciaV, registrarAsistenciaM);
        registrarAsistenciaV.setVisible(true);
    }
    
    public static void abrirModificarTolerancia(){
        frmModificarTolerancia modificarToleranciaV = new frmModificarTolerancia();
        ModificarToleranciaModel modificarToleranciaM = new ModificarToleranciaModel();
        ModificarToleranciaController modificarToleranciaC = new ModificarToleranciaController(modificarToleranciaV, modificarToleranciaM);
        modificarToleranciaV.setVisible(true);
    }
    
}
