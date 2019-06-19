package com.example.kotlintutorials.reository.local.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity

@Entity(tableName = "UsersDB")
class UsersDB(avatarUrl: String) {

    @ColumnInfo(name = "avatar_url")
    var avatarUrl: String? = null

    @ColumnInfo(name ="events_url")
    var eventsUrl: String? = null

    @ColumnInfo(name ="followers_url")
    var followersUrl: String? = null

    @ColumnInfo(name ="following_url")
    var followingUrl: String? = null

    @ColumnInfo(name ="gists_url")
    var gistsUrl: String? = null

    @ColumnInfo(name ="gravatar_id")
    var gravatarId: String? = null

    @ColumnInfo(name ="html_url")
    var htmlUrl: String? = null

    @ColumnInfo(name ="id")
    var id: Int? = null

    @ColumnInfo(name ="login")
    var login: String? = null

    @ColumnInfo(name ="node_id")
    var nodeId: String? = null

    @ColumnInfo(name ="organizations_url")
    var organizationsUrl: String? = null

    @ColumnInfo(name ="received_events_url")
    var receivedEventsUrl: String? = null

    @ColumnInfo(name ="repos_url")
    var reposUrl: String? = null

    @ColumnInfo(name ="site_admin")
    var siteAdmin: Boolean? = null

    @ColumnInfo(name ="starred_url")
    var starredUrl: String? = null

    @ColumnInfo(name ="subscriptions_url")
    var subscriptionsUrl: String? = null

    @ColumnInfo(name ="type")
    var type: String? = null

    @ColumnInfo(name ="url")
    var url: String? = null

}