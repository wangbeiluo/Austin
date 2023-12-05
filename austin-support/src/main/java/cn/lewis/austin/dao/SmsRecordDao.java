package cn.lewis.austin.dao;

import cn.lewis.austin.domain.SmsRecord;
import org.springframework.data.repository.CrudRepository;

/**
 * @author lewis
 * @description:
 * @date: 2023/12/5
 * @Copyright:
 */
public interface SmsRecordDao extends CrudRepository<SmsRecord, Long>
{
}
