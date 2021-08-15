

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisService implements ICustomerCheckService {

	@Override
	public boolean checkRealPersonService(Customer customer)  {

		

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirthday());

		}

		catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
			return false;

		}

	}

	

}