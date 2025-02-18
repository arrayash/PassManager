package com.arrayash.PassManager.Repository;
import com.arrayash.PassManager.model.data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface passrepo extends JpaRepository<data,Long>{
}
