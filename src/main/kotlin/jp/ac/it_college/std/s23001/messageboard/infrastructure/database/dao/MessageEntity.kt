//package jp.ac.it_college.std.s23001.messageboard.infrastructure.database.dao
//
//import jp.ac.itcollege.std.s23001.messageboard.domain.model.Message
//import kotlinx.datetime.toKotlinLocalDateTime
//import org.jetbrains.exposed.dao.LongEntity
//import org.jetbrains.exposed.dao.LongEntityClass
//import org.jetbrains.exposed.dao.id.EntityID
//
//class MessageEntity(id: EntityID<Long>) : LongEntity(id) {
//    companion object : LongEntityClass<MessageEntity>(MessagesTable)
//
//    var threadId by MessagesTable.threadId
//    var userId by MessagesTable.userId
//    var message by MessagesTable.message
//    var postedAt by MessagesTable.postedAt
//    var updatedAt by MessagesTable.updatedAt
//    var deleted by MessagesTable.deleted
//
//    fun toMessage() = Message(
//        id.value, threadId.value, userId.value, message,
//        postedAt.toKotlinLocalDateTime(), updatedAt.toKotlinLocalDateTime(), deleted
//    )
//}
//
//
