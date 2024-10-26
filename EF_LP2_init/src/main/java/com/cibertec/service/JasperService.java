package com.cibertec.service;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cibertec.model.Paciente;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

@Service
public class JasperService {

    public void generarConstanciaPDF(Paciente paciente) throws JRException {
  
        InputStream jasperStream = this.getClass().getResourceAsStream("/constanciaApellido.jasper");

        
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("id", paciente.getId());
        parametros.put("nombre", paciente.getNombre());
        parametros.put("direccion", paciente.getDireccion());
        parametros.put("telefono", paciente.getTelefono());
        parametros.put("email", paciente.getEmail());


        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperStream, parametros, new JREmptyDataSource());


        String outputPath = "constancia_" + paciente.getNombre() + ".pdf";
        JasperExportManager.exportReportToPdfFile(jasperPrint, outputPath);
    }
}
