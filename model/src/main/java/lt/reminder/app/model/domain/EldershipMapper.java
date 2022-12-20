package lt.reminder.app.model.domain;

import lt.reminder.app.model.dto.EldershipDto;
import lt.reminder.app.model.dto.EldershipNameDto;
import lt.reminder.app.model.dto.VillageDto;

import java.util.List;

public class EldershipMapper {

    public static EldershipNameDto fromEldershipToEldershipNameDto(EldershipEntity eldership) {
        EldershipNameDto eldershipNameDto = new EldershipNameDto();
        eldershipNameDto.setId(eldership.getId());
        eldershipNameDto.setName(eldership.getName());
        return eldershipNameDto;
    }

    public static EldershipDto fromEldership(EldershipEntity eldership) {
        EldershipDto eldershipDto = new EldershipDto();
        eldershipDto.setId(eldership.getId());
        eldershipDto.setName(eldership.getName());
        setVillages(eldershipDto, eldership.getVillages());
        return eldershipDto;
    }

    private static void setVillages(EldershipDto eldershipDto, List<VillageEntity> villages) {
        if (villages != null) {
            List<VillageDto> villageDtos = villages.stream().map(VillageMapper::fromVillage).toList();
            eldershipDto.setVillages(villageDtos);
        }
    }
}
