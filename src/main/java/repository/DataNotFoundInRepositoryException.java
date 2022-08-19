package repository;

public class DataNotFoundInRepositoryException extends RuntimeException {
	
	private static final long serialVersionUID=-629364106538570196L;
	private static  String DEFAUL_MESSAGE="Data not found in Repo";
	
	public DataNotFoundInRepositoryException() {
		super(DEFAUL_MESSAGE);
	}
	
	public DataNotFoundInRepositoryException(String mesage) {
		super(mesage);
	}

}
