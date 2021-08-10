package fr.humanbooster.fx.facturation.coordination;

import fr.humanbooster.fx.facturation.business.Facture;
import fr.humanbooster.fx.facturation.service.ClientService;
import fr.humanbooster.fx.facturation.business.Client;
import fr.humanbooster.fx.facturation.service.FactureService;
import fr.humanbooster.fx.facturation.service.LigneFactureService;
import fr.humanbooster.fx.facturation.service.PrestationService;
import fr.humanbooster.fx.facturation.service.impl.ClientServiceImpl;
import fr.humanbooster.fx.facturation.service.impl.FactureServiceImpl;
import fr.humanbooster.fx.facturation.service.impl.LigneFactureServiceImpl;
import fr.humanbooster.fx.facturation.service.impl.PrestationServiceImpl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "clientsBean")
@RequestScoped
public class ClientsBean implements Serializable {

    private static final long serialVersionUID = 1L;

    public ClientService clientService = new ClientServiceImpl();
    private Client client;

    public void init(){
        System.out.println("PostConstruct");
        client = new Client(null);
    }

    public Client getClient(){
        return client;
    }

    //
//    public PrestationService prestationService = new PrestationServiceImpl();
//    private List<Client> clients = clientService.recupererClients();

    public List<Client> getClients() {
        List<Client> clients = clientService.recupererClients();
        return clients;
    }



}
