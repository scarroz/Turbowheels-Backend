package co.edu.unbosque.nominabackend.dto;

import java.time.LocalDate;

public class FinalSettlementDTO {
    private Long id;
    private LocalDate fechaFinal;
    
    public FinalSettlementDTO() {
		// TODO Auto-generated constructor stub
	}
    
    
    

	public FinalSettlementDTO(LocalDate fechaFinal) {
		super();
		this.fechaFinal = fechaFinal;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
    
    
}

