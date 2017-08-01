package dao;

import java.util.List;
import model.DiscountBO;
import model.DiscountBOExample;
import org.apache.ibatis.annotations.Param;

public interface DiscountBOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cy_bt_Dsc_Info
     *
     * @mbggenerated
     */
    int countByExample(DiscountBOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cy_bt_Dsc_Info
     *
     * @mbggenerated
     */
    int deleteByExample(DiscountBOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cy_bt_Dsc_Info
     *
     * @mbggenerated
     */
    int insert(DiscountBO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cy_bt_Dsc_Info
     *
     * @mbggenerated
     */
    int insertSelective(DiscountBO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cy_bt_Dsc_Info
     *
     * @mbggenerated
     */
    List<DiscountBO> selectByExample(DiscountBOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cy_bt_Dsc_Info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DiscountBO record, @Param("example") DiscountBOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cy_bt_Dsc_Info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DiscountBO record, @Param("example") DiscountBOExample example);
}