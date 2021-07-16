package chap18;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.util.*;
import java.rmi.server.*;


@SuppressWarnings("serial")
public class ServiceServerImpl extends UnicastRemoteObject implements ServiceServer  {

    HashMap<String, Service> serviceList;
  

    public ServiceServerImpl() throws RemoteException {
       // start and set up services 
       setUpServices();
    }

   private void setUpServices() {
       serviceList = new HashMap<String, Service>();
       serviceList.put("Dice Rolling Service", new DiceService());  
       serviceList.put("Day of the Week Service", new DayOfTheWeekService());  
       serviceList.put("Visual Music Service", new MiniMusicService());   
   }

    public Object[] getServiceList() {
       System.out.println("in remote");
       return serviceList.keySet().toArray();
        
    }

    public Service getService(Object serviceKey) throws RemoteException {        
       Service theService = (Service) serviceList.get(serviceKey);       
       return theService;
    }
  

    public static void main (String[] args) {
      
       try {
         LocateRegistry.createRegistry(8888);
         Naming.bind("rmi://localhost:8888/ServiceServer", new ServiceServerImpl());
        } catch(Exception ex) {
        	ex.printStackTrace();
        }
        System.out.println("Remote service is running");
    }

}