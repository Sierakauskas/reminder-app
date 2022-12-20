package lt.reminder.app.model.domain;

import lt.reminder.app.model.dto.VillageDto;

public class  VillageMapper {

    public static VillageDto fromVillage(VillageEntity village) {
        VillageDto villageDto = new VillageDto();
        villageDto.setId(village.getId());
        villageDto.setName(village.getName());
        villageDto.setEldershipId(village.getEldershipId());
        return villageDto;
    }
}
