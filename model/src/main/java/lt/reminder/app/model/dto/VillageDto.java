package lt.reminder.app.model.dto;

public class VillageDto {

    private Long id;
    private String name;
    private Long EldershipId;

    public VillageDto() {
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

    public Long getEldershipId() {
        return EldershipId;
    }

    public void setEldershipId(Long eldershipId) {
        EldershipId = eldershipId;
    }
}
