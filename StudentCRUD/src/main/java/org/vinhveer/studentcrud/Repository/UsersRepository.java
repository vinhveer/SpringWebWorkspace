package org.vinhveer.studentcrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vinhveer.studentcrud.Entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>
{
}
