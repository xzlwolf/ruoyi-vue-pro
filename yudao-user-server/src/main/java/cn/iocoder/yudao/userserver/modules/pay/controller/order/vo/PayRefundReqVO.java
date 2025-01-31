package cn.iocoder.yudao.userserver.modules.pay.controller.order.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@ApiModel("退款订单 Req VO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayRefundReqVO {

    @ApiModelProperty(value = "支付订单编号自增", required = true, example = "10")
    @NotEmpty(message = "支付订单编号自增")
    private Long payOrderId;

    @ApiModelProperty(value = "退款金额", required = true, example = "1")
    @NotEmpty(message = "退款金额")
    private Long amount;

    @ApiModelProperty(value = "退款原因", required = true, example = "不喜欢")
    @NotEmpty(message = "退款原因")
    private String reason;

    @ApiModelProperty(value = "商户退款订单号", required = true, example = "MR202111180000000001")
    //TODO 测试暂时模拟生成
    //@NotEmpty(message = "商户退款订单号")
    private String merchantRefundId;

}
