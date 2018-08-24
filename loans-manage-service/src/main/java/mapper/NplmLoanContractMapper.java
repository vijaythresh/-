package mapper;

import com.atguigu.haorendai.bean.NplmLoanContract;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface NplmLoanContractMapper extends Mapper<NplmLoanContract> {

	List<NplmLoanContract> getIndexContract();

	List<NplmLoanContract> getContractPagination(Map map);

	Long getContractNum(Map map);

}
