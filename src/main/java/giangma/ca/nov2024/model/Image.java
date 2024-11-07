package giangma.ca.nov2024.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Blob;
@Getter
@Setter
@Entity
public class Image {

    @Id
    @GeneratedValue
    private Long id;
    private String fileName;
    private String fileType;

    @Lob
    private Blob image;
    private String downloadURL;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;


}
