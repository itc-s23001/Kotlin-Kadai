//package jp.ac.it_college.std.s23001.messageboard.infrastructure.database.dao
//
//import jp.ac.it_college.std.s23001.messageboard.domain.model.Thread
//import kotlinx.datetime.toKotlinLocalDateTime
//import org.jetbrains.exposed.dao.LongEntity
//import org.jetbrains.exposed.dao.LongEntityClass
//import org.jetbrains.exposed.dao.id.EntityID
//
//class ThreadEntity(id: EntityID<Long>) : LongEntity(id) {
//    companion object : LongEntityClass<ThreadEntity>(ThreadsTable)
//
//    var title by ThreadsTable.title
//    var userId by ThreadsTable.userId
//    var createdAt by ThreadsTable.createdAt
//    var updatedAt by ThreadsTable.updatedAt
//    var deleted by ThreadsTable.deleted
//
//    fun toThread() = Thread(
//        id.value, title, userId.value,
//        createdAt.toKotlinLocalDateTime(), updatedAt.toKotlinLocalDateTime(), deleted
//    )
//}
//
