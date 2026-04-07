package co.edu.unbosque.nominabackend.mapper;

import co.edu.unbosque.nominabackend.dto.EPSDTO;
import co.edu.unbosque.nominabackend.model.EPS;

public class EPSMapper {

    public static EPSDTO toDTO(EPS eps) {
        if (eps == null) {
            return null;
        }

        EPSDTO dto = new EPSDTO();
        dto.setId(eps.getId());
        dto.setNombre(eps.getNombre());
        return dto;
    }

    public static EPS toEntity(EPSDTO dto) {
        if (dto == null) {
            return null;
        }

        EPS eps = new EPS();
        eps.setId(dto.getId());
        eps.setNombre(dto.getNombre());
        return eps;
    }
}
