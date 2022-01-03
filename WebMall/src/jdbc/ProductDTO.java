package jdbc;

public class ProductDTO {
	//DB에 생성된 테이블을 private로 불러온다.
	private String pid;
	private String pname;
	private String pdesc;
	private String pprice;
	private String pfilen;
	
	//Source 에 Generate Constructor Using Fields 를 통해 객체 생성
	public ProductDTO(String pid, String pname, String pdesc, String pprice, String pfilen) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdesc = pdesc;
		this.pprice = pprice;
		this.pfilen = pfilen;
	}
	
	//Source에 Generate Getters and Setters를 통해 get,set메서드 생성
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public String getPprice() {
		return pprice;
	}

	public void setPprice(String pprice) {
		this.pprice = pprice;
	}

	public String getPfilen() {
		return pfilen;
	}

	public void setPfilen(String pfilen) {
		this.pfilen = pfilen;
	}
	
	
	
}
