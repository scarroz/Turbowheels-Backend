package co.edu.unbosque.nominabackend.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.io.source.ByteArrayOutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;

import co.edu.unbosque.nominabackend.dto.ContractDTO;
import co.edu.unbosque.nominabackend.dto.EmployeeDTO;
import co.edu.unbosque.nominabackend.dto.PayrollDTO;
import co.edu.unbosque.nominabackend.service.ContractService;
import co.edu.unbosque.nominabackend.service.EmployeeService;
import co.edu.unbosque.nominabackend.service.PayrollService;

@RestController
@RequestMapping("/api/pdf")
@CrossOrigin(origins = "*")
public class PDFController {

	@Autowired
	private EmployeeService eService;

	@Autowired
	private ContractService contratoService;

	@Autowired
	private PayrollService payrollService;

	@GetMapping(value = "/empleados", produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<ByteArrayResource> generarReporteEmpleados() throws DocumentException {
		List<EmployeeDTO> empleados = eService.listarEmpleados();

		Document document = new Document(PageSize.A4);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PdfWriter.getInstance(document, baos);
		document.open();

		Paragraph titulo = new Paragraph("REPORTE DE EMPLEADOS",
				new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD, BaseColor.BLUE));
		titulo.setAlignment(Element.ALIGN_CENTER);
		titulo.setSpacingAfter(10f);
		document.add(titulo);

		PdfPTable tabla = new PdfPTable(3);
		tabla.setWidthPercentage(100);
		tabla.addCell("Documento");
		tabla.addCell("Nombre");
		tabla.addCell("Apellido");

		for (EmployeeDTO e : empleados) {
			tabla.addCell(e.getDocumento() + "");
			tabla.addCell(e.getNombre());
			tabla.addCell(e.getApellido());
		}

		document.add(tabla);
		document.close();

		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=reporte_empleados.pdf")
				.contentType(MediaType.APPLICATION_PDF).body(new ByteArrayResource(baos.toByteArray()));
	}

	@GetMapping(value = "/contratos", produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<ByteArrayResource> generarReporteContratos() throws DocumentException {
		List<ContractDTO> contratos = contratoService.listarContratos();

		Document document = new Document(PageSize.A4.rotate()); // Usamos A4 horizontal
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PdfWriter.getInstance(document, baos);
		document.open();

		Paragraph titulo = new Paragraph("REPORTE DE CONTRATOS",
				new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD, BaseColor.DARK_GRAY));
		titulo.setAlignment(Element.ALIGN_CENTER);
		titulo.setSpacingAfter(10f);
		document.add(titulo);

		PdfPTable tabla = new PdfPTable(6);
		tabla.setWidthPercentage(100);
		tabla.setSpacingBefore(10f);
		tabla.setSpacingAfter(10f);

		float[] anchos = { 1f, 2f, 2f, 2.5f, 2.5f, 2f };
		tabla.setWidths(anchos);

		Font headerFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.WHITE);
		BaseColor headerColor = BaseColor.GRAY;
		String[] headers = { "ID", "Tipo de contrato", "Salario", "Fecha Inicio", "Fecha Final", "ID del empleado" };
		for (String header : headers) {
			PdfPCell cell = new PdfPCell(new Phrase(header, headerFont));
			cell.setBackgroundColor(headerColor);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla.addCell(cell);
		}

		for (ContractDTO c : contratos) {
			tabla.addCell(c.getId() + "");
			tabla.addCell(c.getTipo());
			tabla.addCell(c.getSalario().toString());
			tabla.addCell(c.getFechaInicio().toString());
			tabla.addCell(c.getFechaFin().toString());
			tabla.addCell(c.getEmployeeId().toString());
		}

		document.add(tabla);
		document.close();

		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=reporte_contratos.pdf")
				.contentType(MediaType.APPLICATION_PDF).body(new ByteArrayResource(baos.toByteArray()));
	}

	@GetMapping(value = "/nomina", produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<ByteArrayResource> generarReporteNomina() throws DocumentException {
		List<PayrollDTO> planillas = payrollService.listarNominas();

		Document document = new Document(PageSize.A4);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PdfWriter.getInstance(document, baos);
		document.open();

		Paragraph titulo = new Paragraph("REPORTE DE NÓMINA",
				new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD, BaseColor.DARK_GRAY));
		titulo.setAlignment(Element.ALIGN_CENTER);
		titulo.setSpacingAfter(10f);
		document.add(titulo);

		PdfPTable tabla = new PdfPTable(4);
		tabla.setWidthPercentage(100);
		tabla.setSpacingBefore(10f);
		tabla.setSpacingAfter(10f);

		float[] anchos = { 1f, 2f, 2.5f, 2.5f };
		tabla.setWidths(anchos);

		Font headerFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.WHITE);
		BaseColor headerColor = BaseColor.GRAY;

		String[] headers = { "ID", "ID del contrato", "Salario total pagado", "Fecha de pago" };
		for (String header : headers) {
			PdfPCell cell = new PdfPCell(new Phrase(header, headerFont));
			cell.setBackgroundColor(headerColor);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setPadding(5f);
			tabla.addCell(cell);
		}

		Font cellFont = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL, BaseColor.BLACK);

		for (PayrollDTO p : planillas) {
			tabla.addCell(new Phrase(p.getId() + "", cellFont));
			tabla.addCell(new Phrase(p.getContractId().toString(), cellFont));
			tabla.addCell(new Phrase("$" + p.getTotalPagado().toString(), cellFont));
			tabla.addCell(new Phrase(p.getFecha().toString(), cellFont));
		}

		document.add(tabla);
		document.close();

		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=reporte_nomina.pdf")
				.contentType(MediaType.APPLICATION_PDF).body(new ByteArrayResource(baos.toByteArray()));
	}

}