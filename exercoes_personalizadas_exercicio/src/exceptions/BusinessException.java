package exceptions;

public class BusinessException extends RuntimeException {

	public static final long serialVersionUID = 1l;
	
	public BusinessException(String msg) {
		super(msg);
	}
}
