package jp.co.sss.crud.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class LoginForm {

	//TODO フィールドに必要なアノテーションを付与しバリデーションを行うこと
	//@author 中尾
	/** 社員ID */
	/**
	 * @author DANG
	 * 中尾さん担当箇所を代行修正
	 */
	@Max(value = 99999)
	@Min(value = 1)
	@NotNull
	private Integer empId;

	/** パスワード */
	/**
	 * @author DANG
	 * 中尾さん担当箇所を代行修正
	 */
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z0-9]{1,16}$")
	private String empPass;

	/**
	 * 社員IDの取得
	 *
	 * @return 社員ID
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * 社員IDのセット
	 *
	 * @param empId 社員ID
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	/**
	 * パスワードの取得
	 *
	 * @return パスワード
	 */
	public String getEmpPass() {
		return empPass;
	}

	/**
	 * パスワードのセット
	 *
	 * @param empPass パスワード
	 */
	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}
}