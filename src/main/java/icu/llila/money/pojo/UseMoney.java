package icu.llila.money.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value="user_money")
public class UseMoney implements Serializable {

    @TableId(type = IdType.AUTO)
    @TableField(value = "id")
    private Integer id;

    @TableField(value = "addAredu")
    private Integer addAredu;

    @TableField(value = "amount")
    private Integer amount;

    @TableField(value = "user_id")
    private Integer userId;
}
