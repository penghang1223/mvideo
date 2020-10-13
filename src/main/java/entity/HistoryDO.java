package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Schean
 * @Date: 2020/10/13 21:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoryDO {
    private String nickName;
    private String sign;
    private int roleId;
    private String desc;
    private  int isVip;
    private String coverPic;
    private String url;
    private int status;
}
