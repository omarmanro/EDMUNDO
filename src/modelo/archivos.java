package modelo;

import java.io.*;
import java.util.ArrayList;

public class archivos implements Serializable {
    private ArrayList <servicio> listaServicio;
    private servicio servicio;
    private ArrayList <banco> listaBanco;
    private banco banco;
    private ArrayList <website> listaWeb;
    private website website;
    private ArrayList <app> listaApp;
    private app app;
    public archivos(){
        listaBanco =new ArrayList<banco>();
        banco = new banco();
        listaApp =new ArrayList<app>();
        app = new app();
        listaServicio =new ArrayList<servicio>();
        servicio = new servicio();
        listaWeb =new ArrayList<website>();
        website = new website();
    }




    public Object[][] cargarConfiguracionFragmentos() {
        Object[][] datos = new Object[1][1];
        Object[][] aux ;
        String path = "src/Configuracion/config_file.txt";
        File archivo;
        try {
            archivo = new File(path);
            BufferedReader buffReader = new BufferedReader(new FileReader(archivo));
            String linea;
            buffReader.readLine();
            linea = buffReader.readLine();
            int row = 0;
            while(linea != null) {
                String[] renglon = linea.split("-");
                aux=datos;
                datos = new Object[row+1][renglon.length];
                for (int i = 0; i < renglon.length; i++) {
                    datos[row][i]= renglon[i];
                }
                if(row==0){
                    linea = buffReader.readLine();
                    row++;
                    continue;
                }
                for (int i = 0; i < aux.length; i++) {
                    datos[i] =aux[i];
                }
                linea = buffReader.readLine();
                row++;
            }
        }catch(IOException e) {
            System.out.println("Ha ocurrido un error con el archivo");
        }
        return datos;
    }
    public void guardarConfiguracionFragmentos(String[] datos) {
        String path = "src/Configuracion/config_file.txt";
        File archivo;
        boolean creado=false;
        try {
            archivo = new File(path);


            if (!archivo.exists()) {
                creado=true;
                archivo.createNewFile();
            }
            FileWriter writer = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(writer);
            if(creado) {
                bw.write("");
                bw.write("Nombre Del Servicio-Usuario Afiliado-Correo-Contrasena-Domicilio-Dato Extra\n");
            }
            for (int i = 0; i < datos.length ; i++) {
                if(datos[i] == null){
                    continue;
                }
                bw.write(datos[i]+'-');
            }
            bw.newLine();

            bw.close();
            writer.close();
        }catch(IOException e) {
            e.printStackTrace();
            System.out.println("Ha ocurrido un error con el archivo");
        }
    }
    public void borrarTupla(String[] datos) {
        String path = "src/Configuracion/config_file.txt";
        File archivo;
        boolean creado=false;
        try {
            archivo = new File(path);
            if (!archivo.exists()) {
                creado=true;
                archivo.createNewFile();
            }
            FileWriter writer = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(writer);
            if(creado) {
                bw.write("");
                bw.write("Nombre Del Servicio-Usuario Afiliado-Correo-Contrasena-Domicilio-Dato Extra\n");
            }
            for (int i = 0; i < datos.length ; i++) {
                if(datos[i] == null){
                    continue;
                }
                bw.write(datos[i]+'-');
            }
            bw.newLine();

            bw.close();
            writer.close();
        }catch(IOException e) {
            e.printStackTrace();
            System.out.println("Ha ocurrido un error con el archivo");
        }
    }
//    public void agregarBanco(String [] datos){
//        listaBanco.add(datos);
//    }
    public void agregarServicio(servicio servicio){
        listaServicio.add(servicio);
    }
    public void agregarWeb(website website){
        listaWeb.add(website);
    }
    public void agregarApp(app app){
        listaApp.add(app);
    }



}
