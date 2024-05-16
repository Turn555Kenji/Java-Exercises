package exercicio4;

public enum StatusVaga {
	OCUPADO(false),
	LIVRE(true);
	
	private boolean status;

	private StatusVaga(boolean status) {
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}
}
