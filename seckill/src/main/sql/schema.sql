--数据库初始化脚本

--创建脚本
CREATE database seckill;

USE seckill;


--创建秒杀商品表
 CREATE TABLE seckill(
`seckill_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
`name` VARCHAR(120) NOT NULL COMMENT '商品名称',
`number` INT NOT NULL COMMENT '商品库存数量',
`start_time` TIMESTAMP NOT NULL COMMENT '秒杀开始时间',
`end_time` TIMESTAMP NOT NULL COMMENT '秒杀结束时间',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
PRIMARY KEY(seckill_id),
KEY idx_start_time(start_time),
KEY idx_end_time(end_time),
KEY idx_create_time(create_time)
)EnGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀商品库存表';

--初始话数据
insert into seckill(name,number,start_time,end_time)
values
('1000元秒杀iphone6',100,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
 ('500元秒杀ipad2',200,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
 ('300元秒杀小米4',300,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
 ('200元秒杀红米note',400,'2015-11-01 00:00:00','2015-11-02 00:00:00');
 
 --创建 订单明细表(秒杀成功)
 CREATE TABLE success_killed(
 `seckill_id` BIGINT NOT NULL COMMENT '秒杀成功的商品id',
 `user_phone` BIGINT NOT NULL COMMENT '用户手机号',
 `state` TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态:-1:无效   0:成功    1:已付款   2:已发货   3:交易完成',
 `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '订单创建时间',
 PRIMARY KEY (seckill_id,user_phone),/*联合主键*/
 KEY idx_create_time(create_time)
 )Engine=InnoDB DEFAULT CHARSET=utf8 COMMENT '订单明细表(描述成功)';
