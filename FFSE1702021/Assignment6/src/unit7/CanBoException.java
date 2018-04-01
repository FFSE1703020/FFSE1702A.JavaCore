package unit7;

public class CanBoException extends Exception {
	String errHoTen;
	
	public CanBoException() {
		
	}

	public CanBoException(String errHoTen) {
		super();
		this.errHoTen = errHoTen;
	}
	@Override
	public String toString() {
		return this.errHoTen;
	}	
	public static void chkHoTen(String hoTen) throws CanBoException {
		if(hoTen == null) {
			throw new CanBoException("Ten rong");
		}
		if(hoTen.length()>8) {
			throw new CanBoException("Ten qua dai");
		}
	}

}