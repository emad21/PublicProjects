CREATE TABLE IF NOT EXISTS `TRAN_POINT` (
    `POINT_ID` INT(11) NOT NULL AUTO_INCREMENT,
    `POST_ID` INT(11) NOT NULL,
	`USER_ID` INT(11) NULL,
    `SUBSYSTEM_ID` INT(11) DEFAULT NULL,
	`SUBSYSTEM_VALUE` VARCHAR(10) NULL,
    `SUBSYSTEM_REFERENCE_ID` INT(11) DEFAULT NULL,
	`POINTS_TYPE_ID` INT(11) DEFAULT NULL,
    `POINTS_TYPE_VALUE` INT(11) DEFAULT NULL,
    `POINTS` INT(11) DEFAULT NULL,
    `CREATED_BY` INT(11) DEFAULT NULL,
    `CREATED_DATE` DATETIME DEFAULT NULL,
    `MODIFIED_BY` INT(11) DEFAULT NULL,
	`MODIFIED_DATE` DATETIME DEFAULT NULL,
    `UPDATE_SEQ` INT(11) DEFAULT NULL,    
    PRIMARY KEY (`POINT_ID`)
)  ENGINE=InnoDB DEFAULT CHARSET=latin1;
