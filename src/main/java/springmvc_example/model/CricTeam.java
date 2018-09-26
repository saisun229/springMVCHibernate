package springmvc_example.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="team")
public class CricTeam {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 
 @Column(name = "name")
 private String  name;
 
 @Column(name = "captain")
 private String captain;
 
 @Column(name = "vicecaptain")
 private String vicecaptain;
 
 @Column(name = "coach")
 private String coach;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCaptain() {
	return captain;
}

public void setCaptain(String captain) {
	this.captain = captain;
}

public String getVicecaptain() {
	return vicecaptain;
}

public void setVicecaptain(String vicecaptain) {
	this.vicecaptain = vicecaptain;
}

public String getCoach() {
	return coach;
}

public void setCoach(String coach) {
	this.coach = coach;
}

}