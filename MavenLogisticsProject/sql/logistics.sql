use logisticdb;

-- 1、创建消费者表/顾客表
create table august_client (
  client_id         int primary key auto_increment,
  client_name       varchar(20),
  client_gender     int,
  user_id           int references august_user (user_nubmer),
  order_id          int references august_order_list (order_id),
  client_password   varchar(20),
  client_phone      varchar(20),
  client_birth_date datetime,
  client_address    varchar(50),
  client_remarks    varchar(50)
);

-- 2、订单表
create table august_order_list (
  order_id                 int primary key auto_increment,
  order_type               int,
  receipt_id               int references august_delivery_receipt (receipt_id),
  order_goods_name         varchar(20),
  order_goods_weight       int,
  order_mailer             varchar(20),
  order_mail_address       varchar(50),
  order_receiving_address  varchar(50),
  order_state              int,
  order_mailer_phone       varchar(20),
  order_consignee          varchar(20),
  order_consignee_phone    varchar(20),
  order_start_city         varchar(20),
  order_midpoint_city      varchar(20),
  order_end_city           varchar(20),
  order_delivery_price     decimal(18, 0),
  order_distribution_price decimal(18, 0),
  order_transport_price    decimal(18, 0),
  order_total_price        decimal(18, 0),
  order_lorry              varchar(20),
  order_remarks            varchar(50)

);

-- 3、车辆表
create table august_lorry (
  lorry_number          int primary key auto_increment,
  lorry_model           varchar(20),
  lorry_producing_area  varchar(20),
  route_number          varchar(20) references august_route (route_number),
  lorry_production_date datetime,
  lorry_purchase_date   datetime,
  lorry_remarks         nvarchar(50)

);

-- 4、城市表
create table august_city (
  city_id     int primary key auto_increment,
  city_name   varchar(20),
  area_id     varchar(20) references august_city_region (region_id),
  province_id varchar(20) references august_province (province_id)
);

-- 5、城市区域表
create table august_city_region (
  region_id   int primary key auto_increment,
  region_name varchar(50),
  city_id     varchar(50) references august_city (city_id)

);

-- 6、管理员表

create table august_admin (
  admin_number     int primary key auto_increment,
  admin_name       varchar(20),
  admin_gender     int,
  user_number      int references august_user (user_nubmer),
  admin_state      int,
  admin_where_city varchar(20),
  admin_address    varchar(20),
  admin_password   varchar(20),
  admin_phone      varchar(20),
  admin_remarks     varchar(50)
);

-- 7、交货单表

create table august_delivery_receipt (
  receipt_id            int auto_increment primary key,
  receipt_start_city    varchar(20) not null,
  receipt_end_city      varchar(20),
  receipt_arrive_city   varchar(20),
  receipt_state         int,
  receipt_generate_time datetime,
  receipt_remarks        nvarchar(50)
);

-- 8、路线表

create table august_route (
  route_number             int primary key auto_increment,
  route_name               varchar(20),
  province_start_number    int references august_province (province_id),
  city_start_number        int references august_city (city_id),
  province_midpoint_number int references august_province (province_id),
  city_midpoint_number     int references august_city (city_id),
  province_end_number      int references august_province (province_id),
  city_end_number          int references august_city (city_id),
  route_transport_price    decimal(18, 0),
  route_remarks             varchar(50)
);

-- 9、配送点表
create table august_station (

  station_id     int primary key auto_increment,
  station_name   varchar(20),
  province_id    varchar(20),
  city_id        varchar(20),
  admin_id       varchar(20),
  station_phone  varchar(20),
  station_adress varchar(50),
  route_number   int references august_route (route_number),
  user_id        int references august_user (user_nubmer),
  station_remarks varchar(50)
);

-- 10、配送范围表
create table august_area (
  area_id     int primary key auto_increment,
  area_name   varchar(20),
  area_price  decimal(18, 0),
  city_id     int references august_city (city_id),
  stattion_id int references august_station (station_id),
  area_remarks varchar(20)
);

-- 11、省份表
create table august_province (
  province_id   int primary key auto_increment,
  province_name varchar(20)
);

-- 12、用户组表
create table august_user (
  user_nubmer int primary key auto_increment,
  user_name   varchar(20),
  user_remarks varchar(50)
);



-- 12、用户组表数据
insert into august_user (user_name, user_remarks)
VALUES ("陈赫", "买了一台苹果笔记电脑"),
       ("张三", "买了一部华为荣耀10手机"),
       ("李四", "买了java编程、JavaEE框架");

-- 11、省份表数据
insert into august_province (province_name)
values ("广东"),
       ("福建"),
       ("海南"),
       ("湖南"),
       ("贵州"),
       ("湖北"),
       ("江西");

-- 10、配送范围表数据
insert into august_area (area_name, area_price, city_id, stattion_id, area_remarks)
values ("中通物流", 16, 4, 1, "物流好慢");

--  9、配送点表数据
insert into august_station (station_name,
                            province_id,
                            city_id,
                            admin_id,
                            station_phone,
                            station_adress,
                            route_number,
                            user_id,
                            station_remarks)
values ("天心区", 4, 4, 1, "15034542342", "某某花园3栋12号", 1, 1, "没有什么好说的，你这个人好烦");

-- 8、路线表数据
insert into august_route (route_name,
                          province_start_number,
                          city_start_number,
                          province_midpoint_number,
                          city_midpoint_number,
                          province_end_number,
                          city_end_number,
                          route_transport_price,
                          route_remarks)
values ("海南到广东到湖南", 3, 2, 1, 1, 4, 4, 12, "一路顺风"),
       ("广东到湖南到贵州", 1, 1, 4, 4, 5, 5, 20, "欢迎远道而来的客人");

-- 7、交货单表
insert into august_delivery_receipt (receipt_start_city,
                                     receipt_end_city,
                                     receipt_arrive_city,
                                     receipt_state,
                                     receipt_generate_time,
                                     receipt_remarks)
values ("海口", "长沙", "广州", 0, now(), "怎么那么备注啊"),
       ("广州", "长沙", "贵阳", 0, now(), "好远不想去");

-- 6、管理员表数据
insert into august_admin (admin_name,
                          admin_gender,
                          user_number,
                          admin_state,
                          admin_where_city,
                          admin_address,
                          admin_password,
                          admin_phone,
                          admin_remarks)
values ("陈先生", 0, 1, 0, "长沙", "湖南省长沙市某某区某某路某某公司124号", "123456", "15034321234", "这个人好懒"),
       ("李咏lol", 0, 2, 0, "广州", "广东省广州市某某区某某路145号", "xxxxxx", "1678984545", "这个人都不知道说什么了");

-- 5、城市区域
insert into august_city_region (region_name, city_id)
VALUES ("黄埔区", 1),
       ("天河区", 1),
       ("龙华区", 2),
       ("秀英区", 2),
       ("思明区", 3),
       ("天心区", 4),
       ("南明区", 5),
       ("武昌区", 6),
       ("西湖区", 7);

-- 4、城市
insert into august_city (city_name, area_id, province_id)
VALUES ("广州", 1, 1),
       ("海口", 2, 3),
       ("厦门", 3, 2),
       ("长沙", 4, 4),
       ("贵阳", 5, 5),
       ("武汉", 6, 6),
       ("南昌", 7, 7);

-- 3、车辆表数据
insert into august_lorry (lorry_model,
                          lorry_producing_area,
                          route_number,
                          lorry_production_date,
                          lorry_purchase_date,
                          lorry_remarks)
values ("大卡车", "外国", 1, current_timestamp(), now(), "国外不怎么好用，还是国产好用");

-- 2、订单表数据
insert into august_order_list (order_type,
                               receipt_id,
                               order_goods_name,
                               order_goods_weight,
                               order_mailer,
                               order_mail_address,
                               order_receiving_address,
                               order_state,
                               order_mailer_phone,
                               order_consignee,
                               order_consignee_phone,
                               order_start_city,
                               order_midpoint_city,
                               order_end_city,
                               order_delivery_price,
                               order_distribution_price,
                               order_transport_price,
                               order_total_price,
                               order_lorry,
                               order_remarks)
values (1,
        1,
        "电子商品",
        4,
        "程某",
        "海南海口市某某区某某公司",
        "湖南某某市某某公司",
        0,
        "14487432244",
        "陈先生",
        "15034323422",
        "海口",
        "广州",
        "长沙",
        20,
        20,
        40,
        80,
        "大卡车",
        "这个字段好长写的麻烦啊，有没有写的更快的方法");

-- 1、消费者表数据
insert into august_client (client_name,
                           client_gender,
                           user_id,
                           order_id,
                           client_password,
                           client_phone,
                           client_birth_date,
                           client_address,
                           client_remarks)
values ("陈先现", 0, 1, 1, "123456", "150457672", now(), "长沙某某区某偶路24号", "终于写完了");


select * from august_admin;
select * from august_area;
select * from august_city;
select * from august_city_region;
select * from august_client;
select * from august_delivery_receipt;
select * from august_lorry;
select * from august_order_list;
select * from august_province;
select * from august_route;
select * from august_station;
select * from august_user;