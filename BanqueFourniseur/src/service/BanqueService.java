package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import metier.Compte;
@WebService(serviceName ="BanqueWs")
public class BanqueService {
public ArrayList<Compte> listCompt;

public BanqueService() {
listCompt = new ArrayList<Compte>();
}
@WebMethod(operationName="Convertion")
public double convertirEuroDinar(@WebParam(name="montant") double m){
	return m/3.2;
}

@WebMethod
public Compte getcompte(@WebParam(name="code") long code){
	
    
    return new Compte(code,Math.random()*80000,new Date());
    
}


@WebMethod
public List<Compte>getcomptes(){
	List<Compte> cptes=new ArrayList<>();
	cptes.add(new Compte(1L,Math.random()*80000,new Date()));
	cptes.add(new Compte(2L,Math.random()*80000,new Date()));
	cptes.add(new Compte(3L,Math.random()*80000,new Date()));
	cptes.add(new Compte(4L,Math.random()*80000,new Date()));
	return cptes;

}
/*
public void consulterListe(){
	
}
public void retirer(Compte c, double m){
	c.setSolde(c.getSolde()-m);
} 
public void verser(Compte c, double m) {
	c.setSolde(c.getSolde()+m);
}*/
}
