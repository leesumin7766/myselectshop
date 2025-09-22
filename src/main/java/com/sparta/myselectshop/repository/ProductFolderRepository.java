package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.ProductFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface ProductFolderRepository extends JpaRepository<ProductFolder,Long> {
}
