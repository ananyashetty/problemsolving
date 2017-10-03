package problem2;

public class Student {
	private Long Id;
	private String firstName;
	private Double gpa;
	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return the gpa
	 */
	public Double getGpa() {
		return gpa;
	}
	/**
	 * @param id the id to set
	 */
	public Student setId(Long id) {
		Id = id;
		return this;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public Student setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	/**
	 * @param gpa the gpa to set
	 */
	public Student setGpa(Double gpa) {
		this.gpa = gpa;
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", firstName=" + firstName + ", gpa=" + gpa + "]";
	}
}
