package dependency;

public class SoapTransport implements Transport {
	public SoapTransport() {
		System.out.println("in cnstr of " +getClass().getName());
	}
	@Override
	public void informBank(byte[] data) {
		System.out.println("informing bank using " + getClass().getName() +  data +" layer");

	}

}
