package com.BikkadIT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.Controller.ContectController;
@Repository
public interface ContectRepository extends JpaRepository<ContectController, Integer> {

}
