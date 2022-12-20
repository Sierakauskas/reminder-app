package lt.reminder.app.model.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ELDERSHIP")
public class EldershipEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToMany
    @JoinColumn(name = "ELDERSHIP_ID", referencedColumnName = "ID")
    private List<VillageEntity> villages;

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

    public List<VillageEntity> getVillages() {
        return villages;
    }

    public void setVillages(List<VillageEntity> villages) {
        this.villages = villages;
    }
}
