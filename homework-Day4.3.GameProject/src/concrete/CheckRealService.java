
public class CheckRealService implements ICheckRealPersonManager {

	@Override
	public boolean CheckRealPerson(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" ADLI KULLANICI DOÐRULANDI ");
		return true;
	}
	

}
