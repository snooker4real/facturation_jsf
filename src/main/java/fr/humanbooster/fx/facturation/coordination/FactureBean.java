package fr.humanbooster.fx.facturation.coordination;

import fr.humanbooster.fx.facturation.business.Facture;
import fr.humanbooster.fx.facturation.service.FactureService;
import fr.humanbooster.fx.facturation.service.LigneFactureService;
import fr.humanbooster.fx.facturation.service.impl.FactureServiceImpl;
import fr.humanbooster.fx.facturation.service.impl.LigneFactureServiceImpl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name = "factureBean")
@RequestScoped
public class FactureBean implements Serializable {
    public FactureService factureService = new FactureServiceImpl();
    private Facture facture;
    
    public LigneFactureService ligneFactureService = new LigneFactureServiceImpl();
}
