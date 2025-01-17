package jp.ac.itcollege.std.s23001.messageboard.aplication

import jp.ac.itcollege.std.s23001.messageboard.domain.model.Users
import jp.ac.itcollege.std.s23001.messageboard.domain.repository.UsersRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService(
    private val usersRepository: UsersRepository,
    private val passwordEncoder: PasswordEncoder
) {
    @Transactional
    fun register(viewName: String, email: String, password: String): Users {
        println("Registering user with email: $email")
        val hashedPassword = passwordEncoder.encode(password)
        val user = Users(
            id = 0,
            viewName,
            email,
            hashedPassword
        )
        return usersRepository.createUser(user)
    }

    @Transactional
    fun findByEmail(email: String): Users? {
        println("Finding user by email: $email")

        return usersRepository.findByEmail(email)
    }

    @Transactional
    fun findById(id: Long): Users? {
        println("Finding user by id: $id")
        return usersRepository.findById(id)
    }

    @Transactional
    fun delete(id: Long) {
        println("Deleting user with id: $id")
        return usersRepository.deleteUser(id)
    }

    @Transactional
    fun find(id: Long): Users {
        return usersRepository.findById(id)
            ?: throw Exception("User not found")
    }
}