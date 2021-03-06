package org.big.restapi.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Timestamp;
/**
 *<p><b> Description 相关API</b></p>
 *<p> Description 相关API</p>
 * @author Bin
 * <p>Created date: 2022/06/24</p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfoGroup) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
@Getter
@Setter
@ToString
public class DescriptionModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "唯一标识UUID")
	private String id;
	
	@ApiModelProperty(value = "物种拉丁名")
	private String sciname;	
	
	@ApiModelProperty(value = "物种中文名")
	private String chname;
	
	@ApiModelProperty(value = "分类等级")
	private String rank;
	
	@ApiModelProperty(value = "描述标题")
	private String destitle;

	@ApiModelProperty(value = "描述内容")
	private String descontent;

	@ApiModelProperty(value = "描述人")
	private String describer;

	@ApiModelProperty(value = "描述日期")
	private String desdate;

	@ApiModelProperty(value = "描述语言")
	private String language;

	@ApiModelProperty(value = "版权信息")
	private String copyright;

	@ApiModelProperty(value = "权利所有人")
	private String rightsholder;

	@ApiModelProperty(value = "共享协议")
	private String licenseName;

	@ApiModelProperty(value = "共享协议ID")
	private String licenseId;

	@ApiModelProperty(value = "数据源")
	private String sourcesName;

	@ApiModelProperty(value = "数据源ID")
	private String sourcesId;

	@ApiModelProperty(value = "参考文献")
	private String referencejson;

	@ApiModelProperty(value = "描述类型")
	private String descriptiontypeName;

	@ApiModelProperty(value = "描述类型ID")
	private String descriptiontypeId;

	@ApiModelProperty(value = "关联物种ID")
	private String taxonId;

	@ApiModelProperty(value = "数据库ID")
	private String dbaseId;

	@ApiModelProperty(value = "状态")
	private Integer status;

	@ApiModelProperty(value = "同步日期")
	private Timestamp synchdate;

	@ApiModelProperty(value = "备注")
	private String remark;

	public DescriptionModel() {
		
	}
}