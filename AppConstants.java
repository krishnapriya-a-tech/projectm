package com.projectmanagement.constants;

public class AppConstants {

	public static final String SUCCESS = "success";
	public static final String FAILED = "failed";
	public static final String ERROR = "error";

	public static final String STATUS = "status";
	public static final String ID = "id";
	public static final String MESSAGE = "message";

	public static final String USER_REGISTERED_SUCCESSFULLY = "User registered successfully.";
	public static final String USER_UPDATED_SUCCESSFULLY = "User details updated successfully.";

	public static final String PASSWORD_CONFIRM_MISMATCH = "Password and Confirm Password do not match.";
	public static final String INVALID_MOBILE_NUMBER = "Mobile number must be exactly 10 digits and numeric.";
	public static final String INVALID_PASSWORD_FORMAT = "Password must be at least 8 characters long and include uppercase, lowercase, number, and special character.";

	public static final String EMAIL_ALREADY_EXISTS = "Email already exists.";
	public static final String MOBILE_NUMBER_ALREADY_EXISTS = "Mobile number already exists.";

	public static final String PASSWORD_REUSE_NOT_ALLOWED = "New password cannot be the same as the previous password.";
	public static final String PASSWORD_NOT_ALLOWED = "The chosen password is not allowed. Please use a different password.";

	public static final String EMAIL_ALREADY_ASSOCIATED = "Email is already associated with another account.";
	public static final String MOBILE_NUMBER_ALREADY_ASSOCIATED = "Mobile number is already associated with another account.";

	public static final String PASSWORD_REGEX_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z\\d]).{8,12}$";
	public static final String ONLY_NUMERIC_DIGITS = "\\d+";

	public static final String JWT_PREFIX_VALUE = "JWT_";
	public static final String NUMBER_FORMAT_VALUE = "%05d";

	public static final String USERNAME_NOT_FOUND = "User not found with the provided username: ";
	public static final String USERNAME_NOT_MATCH = "Username does not match";
	public static final String USER_INACTIVE = "User account is inactive. Please contact support.";
	public static final String INVALID_USERNAME_OR_PASSWORD = "Invalid username or password.";
	public static final String USERNAME = "userName";
	public static final String USER_ID = "userId";
	public static final String ROLE = "role";
	public static final String TOKEN = "token";
	public static final String EMAIL_NOT_FOUND = "The email was not found";
	public static final String RESET_PASSWORD_EMAIL_SENT = "The reset password email has been sent successfully";
	public static final String FOUR_DIGIT_NO = "%04d";
	public static final String FORGOT_PASSWORD_SUBJECT = "Reset Your Password";
	public static final String FORGOT_PASSWORD_EMAIL_CONTENT = "Hi %s,\n\n"
			+ "You recently requested to reset your password. Use the verification code below to proceed:\n\n"
			+ "%s\n\n" + "Please enter this code on the password reset page to create a new password.\n\n"
			+ "Thank You,\nProject Management Team";
	public static final String EXPIRED_OTP = "The OTP has expired";
	public static final String OTP_VALIDATED = "OTP validated successfully";
	public static final String INVALID_OTP = "The OTP is invalid";
	public static final String PASSWORD_CHANGED = "The password has been changed successfully";
	public static final String USERNAME_EXISTS = "The username already exists with the same password";
	public static final String NEW_PASSWORD_CANNOT_BE_SAME = "The new password cannot be the same as the existing password";

	public static final String PASSWORDS_NOT_MATCH = "Passwords do not match";
	
	//Create a new Task
	public static final String TASK_PREFIX_VALUE = "TASK_";
	public static final String NUMBER_FORMAT_VA_STRING = "%05d";

}
