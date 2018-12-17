use SupermarketOnline;

/* 清除数据 */
truncate table TbConfig;
truncate table TbToken;
truncate table TbTokenInfo;
truncate table  TbSubType;
truncate table  TbType;
truncate table TbAdminUser;

/*token过期时间配置*/
insert into TbConfig(configKey,configValue) values('token.timeout','30');


/*查询*/
select configKey,configValue,lastupdate from TbConfig;
select token,lastupdate from TbToken;
select token,infokey,info,lastupdate from TbTokenInfo;
select tid,typeName,typeInfo,isEnable,lastupdate from  TbType;
select stid,tid,subName,subInfo,isEnable,lastupdate from  TbSubType;
select auid,username,password,nickname, isEnable,lastupdate from TbAdminUser;

