//package jp.ac.it_college.std.s23001.messageboard.infrastructure.database.repository
//
//import jp.ac.it_college.std.s23001.messageboard.domain.model.Message
//import jp.ac.it_college.std.s23001.messageboard.domain.repository.MessageRepository
//import jp.ac.it_college.std.s23001.messageboard.infrastructure.database.dao.MessageEntity
//import jp.ac.it_college.std.s23001.messageboard.infrastructure.database.dao.MessagesTable
//import jp.ac.it_college.std.s23001.messageboard.infrastructure.database.dao.ThreadsTable
//import jp.ac.it_college.std.s23001.messageboard.infrastructure.database.dao.UsersTable
//import jp.ac.itcollege.std.s23001.messageboard.domain.model.Message
//import kotlinx.datetime.toJavaLocalDateTime
//import org.jetbrains.exposed.sql.transactions.transaction
//import org.jetbrains.exposed.dao.id.EntityID
//import org.springframework.stereotype.Repository
//
//@Repository
//class MessageRepositoryImpl : MessageRepository {
//    override fun findById(id: Long): Message? = transaction {
//        MessageEntity.findById(id)?.toMessage()
//    }
//
//    override fun findByThreadId(threadId: Long): List<Message> = transaction {
//        MessageEntity.find { MessagesTable.threadId eq threadId }
//            .map { it.toMessage() }
//    }
//
//    override fun save(message: Message): Message = transaction {
//        MessageEntity.new {
//            this.threadId = EntityID(message.threadId, ThreadsTable)
//            this.userId = EntityID(message.userId, UsersTable)
//            this.message = message.message
//            this.postedAt = message.postedAt.toJavaLocalDateTime()
//            this.updatedAt = message.updatedAt.toJavaLocalDateTime()
//            this.deleted = message.deleted
//        }.toMessage()
//    }
//
//    override fun update(message: Message): Message = transaction {
//        val entity = MessageEntity.findById(message.id) ?: throw IllegalArgumentException("Message not found")
//        entity.apply {
//            this.message = message.message
//            this.updatedAt = message.updatedAt.toJavaLocalDateTime()
//            this.deleted = message.deleted
//        }
//        entity.toMessage()
//    }
//}
