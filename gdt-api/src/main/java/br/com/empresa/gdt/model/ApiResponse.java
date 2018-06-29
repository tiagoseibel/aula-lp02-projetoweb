package br.com.empresa.gdt.model;

public class ApiResponse {
    private String message;

    public ApiResponse() {

    }

    public ApiResponse(String message) {
        this.message = message;
    }

    /**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}