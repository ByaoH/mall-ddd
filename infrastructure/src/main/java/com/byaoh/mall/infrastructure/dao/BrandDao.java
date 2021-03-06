package com.byaoh.mall.infrastructure.dao;

import com.byaoh.mall.infrastructure.dataobject.PmsBrandDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BrandDao
 *
 * @author luliangyu
 * @date 2021-07-16 14:08
 */
@Repository
public interface BrandDao extends JpaRepository<PmsBrandDO, Long> {
}
