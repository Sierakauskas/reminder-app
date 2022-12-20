package lt.reminder.app.model.dto;

import java.util.List;

public class EldershipDto {

    private Long id;
    private String name;
    private List<VillageDto> villages;

    public EldershipDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<VillageDto> getVillages() {
        return villages;
    }

    public void setVillages(List<VillageDto> villages) {
        this.villages = villages;
    }
}
