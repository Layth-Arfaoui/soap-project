package metier;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlRootElement(name="compte")
public class Compte {
private long code;
private double solde;
@XmlTransient
private Date dateCreation;
public Compte(long code, double solde, Date dateCreation) {
	super();
	this.code = code;
	this.solde = solde;
	this.dateCreation = dateCreation;
}
public long getCode() {
	return code;
}
public double getSolde() {
	return solde;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setCode(int code) {
	this.code = code;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
public Compte() {
	super();
}



}
