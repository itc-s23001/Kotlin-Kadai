//package jp.ac.it_college.std.s23001.messageboard.application.service
//
//import jp.ac.it_college.std.s23001.messageboard.domain.model.User
//import jp.ac.it_college.std.s23001.messageboard.domain.repository.UserRepository
//import org.springframework.security.crypto.password.PasswordEncoder
//import org.springframework.stereotype.Service
//import org.springframework.transaction.annotation.Transactional
//
//@Service
//@Transactional
//class AuthenticationService(
//    private val userRepository: UserRepository,
//    private val passwordEncoder: PasswordEncoder
//) {
//    fun authenticate(email: String, password: String): User {
//        val user = userRepository.findByEmail(email) ?: throw IllegalArgumentException("Invalid email or password")
//        if (!passwordEncoder.matches(password, user.password)) {
//            throw IllegalArgumentException("Invalid email or password")
//        }
//        return user
//    }
//}
