package com.islet.model.mail;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 邮件任务池，每个用户最多只有20条数据
 * </p>
 *
 * @author tangJM.
 * @since 2021-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务ID
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    @Version
    private Date modified;

    /**
     * 逻辑删除 0-否 1-是
     */
    @TableLogic
    private Boolean removed;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 邮箱帐号
     */
    private String email;

    /**
     * 邮箱密码
     */
    private String password;

    /**
     * 连接状态 0-无状态 1-连接中 2-连接异常
     */
    private Boolean connStatus;

    /**
     * 连接异常原因
     */
    private String connExceptionReason;

    /**
     * 服务器端口
     */
    private Integer port;

    /**
     * 服务器地址
     */
    private String host;

    /**
     * 是否支持SSL 0-否 1-是
     */
    private Boolean hasSsl;

    /**
     * 协议类型 0-爬虫 1-imap 2-pop3 4-exchange
     */
    private Boolean protocolType;

    /**
     * 节点ID
     */
    private String vpnId;

    /**
     * 是否监控 0-否 1-是
     */
    private Boolean hasMonitoring;

    /**
     * 重点关注目标 0-否 1-是
     */
    private Boolean hasEmphasis;

    /**
     * 描述
     */
    private String description;

    /**
     * 已读邮件数
     */
    private Integer readNumber;

    /**
     * 未读邮件数
     */
    private Integer unReadNumber;

    /**
     * 敏感邮件数
     */
    private Integer sensitiveNumber;


}
