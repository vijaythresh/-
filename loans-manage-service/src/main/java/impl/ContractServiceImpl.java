package impl;

import com.vijaythresh.edloans.manage.controller.NplmLoanContract;
import haorendaimanageservice.ContractService;
import mapper.NplmLoanContractMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ContractServiceImpl implements ContractService {

	@Autowired
	private NplmLoanContractMapper nplmLoanContractMapper;

	public List<NplmLoanContract> getIndexContract() {
		return nplmLoanContractMapper.getIndexContract( );
	}

	public List<NplmLoanContract> getContractPagination(Map map) {
		return nplmLoanContractMapper.getContractPagination(map);
	}

	@Override
	public Long getContractNum(Map map) {
		return nplmLoanContractMapper.getContractNum(map);
	}

	/**
	 * 根据合同编号查询还款详情页面，暂未实现
	 *
	 * @param loanContractNum
	 * @return
	 */
	@Override
	public NplmLoanContract getRepayContract(String loanContractNum) {
		return null;
	}
}
