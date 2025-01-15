package br.com.phc.brasileiraoapi.dto;

import java.io.Serializable;

import br.com.phc.brasileiraoapi.util.StatusPartida;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PartidaGoogleDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private StatusPartida statusPartida;
	private String tempoPartida;
	
	//Varialveis da Equipe da Casa
	private String nomeEquipeCasa;
	private String urlLogoEquipeCasa;
	private Integer placarEquipeCasa;
	private String golsEquipeCasa;
	private Integer placarEstentidoEquipeCasa;
	
	//Varialveis da Equipe da Visitante
	private String nomeEquipeVisitante;
	private String urlLogoquipeVisitante;
	private Integer placarquipeVisitante;
	private String golsquipeVisitante;
	private Integer placarEstentidoquipeVisitante;
}
