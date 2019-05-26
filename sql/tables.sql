DROP TABLE IF EXISTS `user`;

CREATE TABLE `user`(
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`username` varchar(50) NOT NULL,
	`password` varchar(50) NOT NULL,
	PRIMARY KEY(`id`),
	UNIQUE KEY `user_id_uindex` (`id`),
	UNIQUE KEY `user_username_uindex` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

INSERT INTO `user` VALUES (NULL,'testuser1','123456'),(NULL,'testuser2','123456'),(NULL,'testuser3','123456');


DROP TABLE IF EXISTS `workgroup`;

CREATE TABLE `workgroup`(
	`groupid` int(11) NOT NULL AUTO_INCREMENT,
	`groupname` varchar(50) NOT NULL,
	`leaderId` int(11) NOT NULL,
	`mainMission` varchar(50) NOT NULL,
	`status` int(2) NOT NULL,
	`startDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`endDate` timestamp,
	`currentSubmissionId` int(11) DEFAULT NULL,
	PRIMARY KEY(`groupId`),
	UNIQUE KEY `workgroup_id_uindex` (`groupId`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

INSERT INTO `workgroup` VALUES (NULL,'testgroup1','完成任务一',0,CURRENT_TIMESTAMP),(NULL,'testgroup2','完成任务二',0,CURRENT_TIMESTAMP),(NULL,'testgroup3','完成任务三',0,CURRENT_TIMESTAMP);



DROP TABLE IF EXISTS `submission`;

CREATE TABLE `submission`(
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`name` varchar(255) DEFAULT NULL,
	`description` text,
	`groupId` int(11) NOT NULL,
	`status` int(2) NOT NULL,
	`startDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`endDate` timestamp,
	PRIMARY KEY(`id`),
	UNIQUE KEY `submission_id_uindex`(`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

INSERT INTO `submission` VALUES (NULL,'子任务1','子任务1详情',1,0,CURRENT_TIMESTAMP),(NULL,'子任务2','子任务2详情',1,0,CURRENT_TIMESTAMP),(NULL,'子任务3','子任务3详情',1,0,CURRENT_TIMESTAMP);



DROP TABLE IF EXISTS `membermission`;

CREATE TABLE `membermission`(
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`name` varchar(255) DEFAULT NULL,
	`description` text,
	`subMissionId` int(11) NOT NULL,
	`status` int(2) NOT NULL,
	`startDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`endDate` timestamp,
	`owner_id` int(11) DEFAULT NULL,
	PRIMARY KEY(`id`),
	UNIQUE KEY `membermission_id_uindex`(`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

INSERT INTO `membermission` VALUES (NULL,'成员任务1标题','成员任务1详情','1',0,CURRENT_TIMESTAMP),(NULL,'成员任务2标题','成员任务2详情','1',0,CURRENT_TIMESTAMP),(NULL,'成员任务3标题','成员任务3详情','1',0,CURRENT_TIMESTAMP);

DROP TABLE IF EXISTS `user2group`;

CREATE TABLE `user2group`(
	 `user_id` int(11) NOT NULL,
	 `group_id` int(11) NOT NULL,
	 PRIMARY KEY(`user_id`,`group_id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;


INSERT INTO user2group (user_id,group_id) VALUES (1,1);

CREATE TABLE `message`{
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `sender_id` int(11) NOT NULL,
    `receiver_id` int(11) NOT NULL,
    `data` varchar(50),
    PRIMARY KEY(`id`)
}ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

INSERT INTO message (id,sender_id,receiver_id,data)values(1,1,2,"1给2的message");