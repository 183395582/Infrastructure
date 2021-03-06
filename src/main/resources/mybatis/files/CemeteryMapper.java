package mybatis.files;

import com.gmzj.entity.Cemetery;
import com.gmzj.entity.CemeteryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CemeteryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cemetery
     *
     * @mbggenerated Sun Jan 22 00:36:16 CST 2017
     */
    int countByExample(CemeteryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cemetery
     *
     * @mbggenerated Sun Jan 22 00:36:16 CST 2017
     */
    int deleteByExample(CemeteryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cemetery
     *
     * @mbggenerated Sun Jan 22 00:36:16 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cemetery
     *
     * @mbggenerated Sun Jan 22 00:36:16 CST 2017
     */
    int insert(Cemetery record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cemetery
     *
     * @mbggenerated Sun Jan 22 00:36:16 CST 2017
     */
    int insertSelective(Cemetery record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cemetery
     *
     * @mbggenerated Sun Jan 22 00:36:16 CST 2017
     */
    List<Cemetery> selectByExample(CemeteryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cemetery
     *
     * @mbggenerated Sun Jan 22 00:36:16 CST 2017
     */
    Cemetery selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cemetery
     *
     * @mbggenerated Sun Jan 22 00:36:16 CST 2017
     */
    int updateByExampleSelective(@Param("record") Cemetery record, @Param("example") CemeteryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cemetery
     *
     * @mbggenerated Sun Jan 22 00:36:16 CST 2017
     */
    int updateByExample(@Param("record") Cemetery record, @Param("example") CemeteryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cemetery
     *
     * @mbggenerated Sun Jan 22 00:36:16 CST 2017
     */
    int updateByPrimaryKeySelective(Cemetery record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cemetery
     *
     * @mbggenerated Sun Jan 22 00:36:16 CST 2017
     */
    int updateByPrimaryKey(Cemetery record);
}