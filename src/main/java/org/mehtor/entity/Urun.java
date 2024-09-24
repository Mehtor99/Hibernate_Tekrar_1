package org.mehtor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor   //Boş constructor oluşturur.
@AllArgsConstructor  //Full constructor oluştutur
@Data
@Builder
@Entity
@Table(name = "tbl_urun")
public class Urun {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String ad;
	Double fiyat;
	@OneToMany(cascade = CascadeType.PERSIST)
	List<Resim> resimler;
}