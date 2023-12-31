
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DriveFileManager from "./components/listers/DriveFileCards"
import DriveFileDetail from "./components/listers/DriveFileDetail"

import IndexerFileIndexManager from "./components/listers/IndexerFileIndexCards"
import IndexerFileIndexDetail from "./components/listers/IndexerFileIndexDetail"

import VideoProcessingVideoManager from "./components/listers/VideoProcessingVideoCards"
import VideoProcessingVideoDetail from "./components/listers/VideoProcessingVideoDetail"

import NotificationNotificationManager from "./components/listers/NotificationNotificationCards"
import NotificationNotificationDetail from "./components/listers/NotificationNotificationDetail"

import DashboardFileUploadStatusManager from "./components/listers/DashboardFileUploadStatusCards"
import DashboardFileUploadStatusDetail from "./components/listers/DashboardFileUploadStatusDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/drives/files',
                name: 'DriveFileManager',
                component: DriveFileManager
            },
            {
                path: '/drives/files/:id',
                name: 'DriveFileDetail',
                component: DriveFileDetail
            },

            {
                path: '/indexers/fileIndices',
                name: 'IndexerFileIndexManager',
                component: IndexerFileIndexManager
            },
            {
                path: '/indexers/fileIndices/:id',
                name: 'IndexerFileIndexDetail',
                component: IndexerFileIndexDetail
            },

            {
                path: '/videoProcessings/videos',
                name: 'VideoProcessingVideoManager',
                component: VideoProcessingVideoManager
            },
            {
                path: '/videoProcessings/videos/:id',
                name: 'VideoProcessingVideoDetail',
                component: VideoProcessingVideoDetail
            },

            {
                path: '/notifications/notifications',
                name: 'NotificationNotificationManager',
                component: NotificationNotificationManager
            },
            {
                path: '/notifications/notifications/:id',
                name: 'NotificationNotificationDetail',
                component: NotificationNotificationDetail
            },

            {
                path: '/dashboards/fileUploadStatuses',
                name: 'DashboardFileUploadStatusManager',
                component: DashboardFileUploadStatusManager
            },
            {
                path: '/dashboards/fileUploadStatuses/:id',
                name: 'DashboardFileUploadStatusDetail',
                component: DashboardFileUploadStatusDetail
            },



    ]
})
