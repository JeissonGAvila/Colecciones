
import Vista.frmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class IngresoDatos {
    int codigo;
    String Nombre;
    frmPrincipal VistaPrincipal;

    public IngresoDatos(int codigo, String Nombre) {
        this.codigo = codigo;
        this.Nombre = Nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void IngresarDatos(int cod, String nom){
        this.VistaPrincipal.btnIngresar(cod,nom);
        
        this.VistaPrincipal.txtCodigo.getText();
        this.VistaPrincipal.txtNombre.getText();
    }
    
    
}
