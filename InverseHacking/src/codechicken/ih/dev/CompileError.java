package codechicken.ih.dev;

public class CompileError extends Error {
	/**
	 * 
	 */
	private String err;
	static final long serialVersionUID = 6148714970638153748L;

	@Override
	public String toString() {
		return "Compile Error " + err;
	}

	public CompileError(String error) {
		err=error;
	}
}
