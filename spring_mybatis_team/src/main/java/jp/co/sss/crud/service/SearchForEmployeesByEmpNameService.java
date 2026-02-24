package jp.co.sss.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.sss.crud.entity.Employee;
import jp.co.sss.crud.mapper.EmployeeMapper;

@Service
public class SearchForEmployeesByEmpNameService {
	@Autowired
	private EmployeeMapper mapper;

	/**
	 * 社員名検索表示
	 * 
	 * 条件指定なし（null/空文字）で検索実行した場合は全件表示
	 * 入力チェックは行わない
	 * 
	 * @param empName 社員名
	 * @return 社員エンティティ
	 * @author author 中尾
	 */
	public List<Employee> execute(String empName) {

		// 条件指定せずに検索実行した場合は、社員情報の全件一覧を表示
		if (empName == null || empName.isEmpty()) {
			return mapper.findAllEmployeesOrderByEmpId();
		}

		// LIKE検索（部分一致）		
		return mapper.findByEmpNameContainingOrderByEmpId(empName);
	}

}
