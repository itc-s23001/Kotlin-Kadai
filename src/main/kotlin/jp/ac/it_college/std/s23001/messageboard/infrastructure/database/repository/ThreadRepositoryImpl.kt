//package jp.ac.it_college.std.s23001.messageboard.infrastructure.database.repository
//
//import jp.ac.it_college.std.s23001.messageboard.domain.model.Thread
//import jp.ac.it_college.std.s23001.messageboard.domain.repository.ThreadRepository
//import jp.ac.it_college.std.s23001.messageboard.infrastructure.database.dao.ThreadEntity
//import jp.ac.it_college.std.s23001.messageboard.infrastructure.database.dao.UsersTable
//import kotlinx.datetime.toJavaLocalDateTime
//import org.jetbrains.exposed.sql.transactions.transaction
//import org.jetbrains.exposed.dao.id.EntityID
//import org.springframework.stereotype.Repository
//
//@Repository
//class ThreadRepositoryImpl : ThreadRepository {
//    override fun findById(id: Long): Thread? = transaction {
//        ThreadEntity.findById(id)?.toThread()
//    }
//
//    override fun findAll(): List<Thread> = transaction {
//        ThreadEntity.all().map { it.toThread() }
//    }
//
//    override fun save(thread: Thread): Thread = transaction {
//        ThreadEntity.new {
//            this.title = thread.title
//            this.userId = EntityID(thread.userId, UsersTable) // 修正点
//            this.createdAt = thread.createdAt.toJavaLocalDateTime()
//            this.updatedAt = thread.updatedAt.toJavaLocalDateTime()
//            this.deleted = thread.deleted
//        }.toThread()
//    }
//
//    override fun update(thread: Thread): Thread = transaction {
//        val entity = ThreadEntity.findById(thread.id) ?: throw IllegalArgumentException("Thread not found")
//        entity.apply {
//            this.title = thread.title
//            this.updatedAt = thread.updatedAt.toJavaLocalDateTime()
//            this.deleted = thread.deleted
//        }
//        entity.toThread()
//    }
//}
