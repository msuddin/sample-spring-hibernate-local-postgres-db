package com.thetestroom.repositories;

import com.thetestroom.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// This interface is a DAO (Data Access Object)
// Repositories are used to encapsulate collection of objects and the retrieval of them
// JpaRepository provides default CRUD operations such as findAll, getOne
// JpaRepository also creates the Bean for this interface
public interface AccountRepository extends JpaRepository<Account, Long> {

}
