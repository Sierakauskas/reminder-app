package lt.reminder.app.model.domain;

import javax.persistence.*;

@Entity
@Table(name = "VILLAGE")
public class VillageEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ELDERSHIP_ID")
    private Long eldershipId;

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
        return eldershipId;
    }

    public void setEldershipId(Long eldershipId) {
        this.eldershipId = eldershipId;
    }
}
