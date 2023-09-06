package CoBo.ItFarm.Data.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "prediction")
@Data
public class PredictionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "time")
    private TimeEntity time;

    private Float ph;

    private Float ec;

    private Float water_temperature;

    private Float field_temperature;
}
