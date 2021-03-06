package com.example.ShadowSocksShare.domain;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * 数据库操作
 */
@Repository
public interface ShadowSocksDetailsRepository extends JpaRepository<ShadowSocksDetailsEntity, Long> {

	/*@Query("select h.name as name, avg(r.rating) as averageRating  from Hotel h left outer join h.reviews r  group by h")
	Page<ShadowSocksDetailsEntity> findByCity(Pageable pageable);*/

	/**
	 * <= validTime
	 */
	Page<ShadowSocksDetailsEntity> findByValidTimeLessThanEqual(Date validTime, Pageable pageable);
}
