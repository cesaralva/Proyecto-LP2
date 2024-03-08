package com.example.demo.controllers;

import com.example.demo.model.Reporte;
import jakarta.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/report")
public class ReporteContoller {

    @GetMapping("/report")
    public void report(HttpServletResponse response) throws IOException, JRException {

        //1. Acceder al reporte
        InputStream jasperStream = this.getClass().getResourceAsStream("/reportes/primerReporte.jasper");
        //2. Preparar los datos
        Map<String, Object> params = new HashMap<>();
        params.put("Usuario", "Cesar Alva");
        List<Reporte> listProduct = new ArrayList<>();
        listProduct.add(new Reporte(1L, "123", 12.00));
        listProduct.add(new Reporte(2L, "123", 0.50));
        listProduct.add(new Reporte(3L, "123", 1.50));
        listProduct.add(new Reporte(4L, "123", 120.00));

        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(listProduct);
        JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperStream);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, dataSource);
        //3. Configuracion
        response.setContentType("application/x-pdf");
        response.setHeader("Content-disposition", "filename=reporte_ejemplo.pdf");
        // 4. Exportar Reporte
// 4. Exportar Reporte
        final OutputStream outputStream = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);


    }


}
