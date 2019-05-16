package dependency;

public class TestTransport implements Transport {
	public TestTransport() {
		System.out.println("in cnstr of " +getClass().getName());
	}
	@Override
	public void informBank(byte[] data) {
		System.out.println("informing bank using " + getClass().getName() + data.toString() + " layer");

	}

}
