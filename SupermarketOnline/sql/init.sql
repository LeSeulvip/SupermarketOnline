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
/*网站标题信息*/
insert into TbConfig(configKey,configValue) values('title','简易在线商城');
/*默认后台管理员*/
insert into TbAdminUser(username,password,nickname)values('admin','admin-pwd','内置管理员');


/*查询*/
select configKey,configValue,lastupdate from TbConfig;
select token,lastupdate from TbToken;
select token,infokey,info,lastupdate from TbTokenInfo;
select tid,typeName,typeInfo,isEnable,lastupdate from  TbType;
select stid,tid,subName,subInfo,isEnable,lastupdate from  TbSubType;
select auid,username,password,nickname, isEnable,lastupdate from TbAdminUser;

select i. *, u.username,u.nickname
from tblogs i
inner join tbadminuser u on i.operator=u.auid;

