import java.rmi.RemoteException;

public interface ICheckRealPersonManager {
	
	boolean CheckRealPerson(Gamer gamer) throws NumberFormatException, RemoteException;

}
