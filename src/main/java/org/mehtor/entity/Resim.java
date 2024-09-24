package org.mehtor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor   //Boş constructor oluşturur.
@AllArgsConstructor  //Full constructor oluştutur
@Builder
@Data
@Entity
@Table(name = "tbl_resim")
public class Resim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String ad;
	String url;
	
}