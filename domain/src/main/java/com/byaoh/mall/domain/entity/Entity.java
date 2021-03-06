package com.byaoh.mall.domain.entity;

import com.byaoh.mall.types.Identifiable;
import com.byaoh.mall.types.Identifier;

/**
 * 实体类型标记接口
 *
 * @author luliangyu
 * @date 2021-07-17 11:21
 */
public interface Entity<ID extends Identifier> extends Identifiable<ID> {

	/**
	 * 新增之前调用初始化默认值
	 */
	void initDefaultValues();
}
