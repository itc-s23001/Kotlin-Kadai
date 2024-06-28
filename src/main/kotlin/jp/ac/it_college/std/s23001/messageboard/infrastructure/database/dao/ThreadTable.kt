//package jp.ac.it_college.std.s23001.messageboard.infrastructure.database.dao
//
//import org.jetbrains.exposed.dao.id.LongIdTable
//import org.jetbrains.exposed.sql.javatime.CurrentDateTime
//import org.jetbrains.exposed.sql.javatime.datetime
//
//object ThreadsTable : LongIdTable() {
//    val title = varchar("title", 256)
//    val userId = reference("user_id", UsersTable)
//    val createdAt = datetime("created_at").defaultExpression(CurrentDateTime)
//    val updatedAt = datetime("updated_at").defaultExpression(CurrentDateTime)
//    val deleted = bool("deleted").default(false)
//}
