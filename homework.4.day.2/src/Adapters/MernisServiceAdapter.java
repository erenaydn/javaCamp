import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICheckRealPersonManager {

	@Override
	public boolean CheckRealPerson(Gamer gamer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result =kpsPublic.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalId()),gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(),gamer.getDateOfBirth().getYear());
		
		if(result==true) {
			System.out.println(gamer.getFirstName() +"Kullanıcı bilgileri dogru");
		}else {
			System.out.println(gamer.getFirstName() +"Kullanıcı Bilgileri yanlıs");
		}
		return result;
	}

}
